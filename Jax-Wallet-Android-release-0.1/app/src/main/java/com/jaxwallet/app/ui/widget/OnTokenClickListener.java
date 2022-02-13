package com.jaxwallet.app.ui.widget;

import android.view.View;

import com.jaxwallet.app.entity.tokens.Token;

import java.math.BigInteger;
import java.util.List;

public interface OnTokenClickListener {
    void onTokenClick(View view, Token token, List<BigInteger> tokenIds, boolean selected);
    void onLongTokenClick(View view, Token token, List<BigInteger> tokenIds);
}