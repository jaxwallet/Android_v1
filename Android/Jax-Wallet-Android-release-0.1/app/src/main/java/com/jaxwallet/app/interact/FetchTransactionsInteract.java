package com.jaxwallet.app.interact;

import com.jaxwallet.app.entity.ActivityMeta;
import com.jaxwallet.app.entity.ContractType;
import com.jaxwallet.app.entity.tokens.TokenInfo;
import com.jaxwallet.app.entity.Transaction;
import com.jaxwallet.app.entity.Wallet;
import com.jaxwallet.app.repository.TokenRepositoryType;
import com.jaxwallet.app.repository.TransactionRepositoryType;

import io.reactivex.Single;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import io.realm.Realm;

import com.jaxwallet.app.repository.entity.RealmAuxData;

import java.util.List;

public class FetchTransactionsInteract {

    private final TransactionRepositoryType transactionRepository;
    private final TokenRepositoryType tokenRepository;

    public FetchTransactionsInteract(TransactionRepositoryType transactionRepository,
                                     TokenRepositoryType tokenRepositoryType) {
        this.transactionRepository = transactionRepository;
        this.tokenRepository = tokenRepositoryType;
    }

    public Single<ActivityMeta[]> fetchTransactionMetas(Wallet wallet, List<Long> networkFilters, long fetchTime, int fetchLimit) {
        return transactionRepository
                .fetchCachedTransactionMetas(wallet, networkFilters, fetchTime, fetchLimit)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
    }

    public Single<ActivityMeta[]> fetchEventMetas(Wallet wallet, List<Long> networkFilters)
    {
        return transactionRepository.fetchEventMetas(wallet, networkFilters);
    }

    public Single<ContractType> queryInterfaceSpec(TokenInfo tokenInfo)
    {
        //can resolve erc20, erc721 and erc875 from a getbalance check and look at decimals. Otherwise try more esoteric
        return tokenRepository.determineCommonType(tokenInfo);
    }

    public Transaction fetchCached(String walletAddress, String hash)
    {
        return transactionRepository.fetchCachedTransaction(walletAddress, hash);
    }

    public long fetchTxCompletionTime(String walletAddr, String hash)
    {
        return transactionRepository.fetchTxCompletionTime(walletAddr, hash);
    }

    public Realm getRealmInstance(Wallet wallet)
    {
        return transactionRepository.getRealmInstance(wallet);
    }

    public RealmAuxData fetchEvent(String walletAddress, String eventKey)
    {
        return transactionRepository
                .fetchCachedEvent(walletAddress, eventKey);
    }

    public void restartTransactionService()
    {
        transactionRepository.restartService();
    }

    public void removeOverridenTransaction(Wallet wallet, String overridenTxHash)
    {
        transactionRepository.removeOverridenTransaction(wallet, overridenTxHash);
    }
}
