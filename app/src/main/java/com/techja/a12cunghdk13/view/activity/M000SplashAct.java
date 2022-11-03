package com.techja.a12cunghdk13.view.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.techja.a12cunghdk13.R;
import com.techja.a12cunghdk13.databinding.ActM000SplashBinding;

public class M000SplashAct extends BaseAct<ActM000SplashBinding> {


    @Override
    protected void initView() {
        new Handler().postDelayed(() -> gotoMainAct(), 2000);
    }

    @Override
    protected ActM000SplashBinding getViewBinding() {
        return ActM000SplashBinding.inflate(getLayoutInflater());
    }

    private void gotoMainAct() {
        Intent intent = new Intent();
        intent.setClass(this, M001MainAct.class);
        startActivity(intent);

        finish();
        //onBackPressed();
    }
}
