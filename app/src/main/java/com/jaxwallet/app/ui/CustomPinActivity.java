package com.jaxwallet.app.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.github.omadahealth.lollipin.lib.managers.AppLock;
import com.github.omadahealth.lollipin.lib.managers.AppLockActivity;
import com.jaxwallet.app.R;

public class CustomPinActivity extends AppLockActivity {

//    @Override
//    public int getContentView() {
//        return R.layout.activity_custom_pin;
//    }

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
    @Override
    public void onBackPressed()
    {
        Intent intent = getIntent();
        if (getIntent().getIntExtra(AppLock.EXTRA_TYPE, 0) != AppLock.UNLOCK_PIN) {
            setResult(0);
            finish();
        }
    }

}