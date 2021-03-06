package com.jaxwallet.app.entity;

public interface HomeCommsInterface
{
    void downloadReady(String ready);
    void requestNotificationPermission();
    void backupSuccess(String keyAddress);
    void changeCurrency();
    void resetTokens();
    void changedLocale();
    void resetTransactions();
    void openWalletConnect(String sessionId);
}
