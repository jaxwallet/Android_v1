package com.jaxwallet.app.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.omadahealth.lollipin.lib.managers.AppLockActivity;

public class CustomPinActivity extends AppLockActivity {

    @Override
    public void showForgotDialog() {

    }

    @Override
    public void onPinFailure(int attempts) {

    }

    @Override
    public void onPinSuccess(int attempts) {

    }

    @Override
    public int getPinLength() {
//        return super.getPinLength();//you can override this method to change the pin length from the default 4
        return 6;
    }
}