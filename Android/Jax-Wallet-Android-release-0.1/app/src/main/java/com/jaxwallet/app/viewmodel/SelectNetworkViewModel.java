package com.jaxwallet.app.viewmodel;

import android.app.Activity;
import android.content.Intent;

import com.jaxwallet.app.entity.NetworkInfo;
import com.jaxwallet.app.repository.EthereumNetworkBase;
import com.jaxwallet.app.repository.EthereumNetworkRepositoryType;
import com.jaxwallet.app.repository.PreferenceRepositoryType;
import com.jaxwallet.app.service.TokensService;
import com.jaxwallet.app.ui.SelectNetworkFilterActivity;

import java.util.List;

public class SelectNetworkViewModel extends BaseViewModel {
    private final EthereumNetworkRepositoryType networkRepository;
    private final TokensService tokensService;
    private final PreferenceRepositoryType preferenceRepository;

    public SelectNetworkViewModel(EthereumNetworkRepositoryType ethereumNetworkRepositoryType,
                                  TokensService tokensService,
                                  PreferenceRepositoryType preferenceRepository)
    {
        this.networkRepository = ethereumNetworkRepositoryType;
        this.tokensService = tokensService;
        this.preferenceRepository = preferenceRepository;
    }

    public NetworkInfo[] getNetworkList()
    {
        return networkRepository.getAvailableNetworkList();
    }

    public List<Long> getFilterNetworkList()
    {
        return networkRepository.getFilterNetworkList();
    }

    public void openSelectNetworkFilters(Activity ctx, int requestCode)
    {
        Intent intent = new Intent(ctx, SelectNetworkFilterActivity.class);
        ctx.startActivityForResult(intent, requestCode);
    }

    public boolean mainNetActive()
    {
        return preferenceRepository.isActiveMainnet();
    }

    public boolean hasShownTestNetWarning()
    {
        return preferenceRepository.hasShownTestNetWarning();
    }

    public void setShownTestNetWarning()
    {
        preferenceRepository.setShownTestNetWarning();
    }

    public NetworkInfo getNetworkByChain(long chainId)
    {
        return networkRepository.getNetworkByChain(chainId);
    }

    public boolean isMainNet(long networkId)
    {
        return EthereumNetworkBase.hasRealValue(networkId);
    }

    public long getSelectedNetwork()
    {
        NetworkInfo browserNetwork = networkRepository.getActiveBrowserNetwork();
        if (browserNetwork != null) { return browserNetwork.chainId; }
        else return -1;
    }
}
