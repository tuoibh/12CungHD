package com.techja.a12cunghdk13.view.activity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.techja.a12cunghdk13.R;
import com.techja.a12cunghdk13.databinding.ActM001MainBinding;

public class M001MainAct extends BaseAct<ActM001MainBinding>{
    public static final String KEY_TYPE = "KEY_TYPE";
    public static final String CU_GIAI = "CU_GIAI";
    public static final String SU_TU = "SU_TU";
    public static final String BACH_DUONG = "BACH_DUONG";
    public static final String KIM_NGUU = "KIM_NGUU";
    public static final String SONG_TU = "SONG_TU";
    public static final String XU_NU = "XU_NU";
    public static final String THIEN_BINH = "THIEN_BINH";
    public static final String BO_CAP = "BO_CAP";
    public static final String NHAN_MA = "NHAN_MA";
    public static final String MA_KET = "MA_KET";
    public static final String BAO_BINH = "BAO_BINH";
    public static final String SONG_NGU = "SONG_NGU";

    int count = 0;

    private static final String TAG = M001MainAct.class.getName();

    @Override
    protected void initView() {

        Log.i(TAG, "initView");
        binding.ivCuGiai.setOnClickListener(v -> clickToItem(R.string.cu_giai_title2, R.string.cu_giai_text, R.drawable.ic_cu_giai, CU_GIAI));
        binding.ivSuTu.setOnClickListener(v -> clickToItem(R.string.su_tu_title2, R.string.su_tu_text, R.drawable.ic_su_tu, SU_TU));
        binding.ivBachDuong.setOnClickListener(v -> clickToItem(R.string.bach_duong_title2, R.string.bach_duong_text, R.drawable.ic_bach_duong, BACH_DUONG));
        binding.ivKimNguu.setOnClickListener(v -> clickToItem(R.string.kim_nguu_title2, R.string.kim_nguu_text, R.drawable.ic_kim_nguu, KIM_NGUU));
        binding.ivXuNu.setOnClickListener(v -> clickToItem(R.string.xu_nu_title2, R.string.xu_nu_text, R.drawable.ic_xu_nu, XU_NU));
        binding.ivThienBinh.setOnClickListener(v -> clickToItem(R.string.thien_binh_title2, R.string.thien_binh_text, R.drawable.ic_thien_binh, THIEN_BINH));
        binding.ivThienYet.setOnClickListener(v -> clickToItem(R.string.bo_cap_title2, R.string.bo_cap_text, R.drawable.ic_bocap, BO_CAP));
        binding.ivNhanMa.setOnClickListener(v -> clickToItem(R.string.nhan_ma_title2, R.string.nhan_ma_text, R.drawable.ic_nhan_ma, NHAN_MA));
        binding.ivMaKet.setOnClickListener(v -> clickToItem(R.string.ma_ket_title2, R.string.ma_ket_text, R.drawable.ic_ma_ket, MA_KET));
        binding.ivBaoBinh.setOnClickListener(v -> clickToItem(R.string.bao_binh_title2, R.string.bao_binh_text, R.drawable.ic_bao_binh, BAO_BINH));
        binding.ivSongNgu.setOnClickListener(v -> clickToItem(R.string.song_ngu_title2, R.string.song_ngu_text, R.drawable.ic_song_ngu, SONG_NGU));
        binding.ivSongTu.setOnClickListener(v -> clickToItem(R.string.song_tu_title2, R.string.song_tu_text, R.drawable.ic_song_tu, SONG_TU));
    }

    private void clickToItem(int title, int content, int photo, String zodiac) {
        binding.tvTitle.setText(title);
        binding.tvDetail.setText(content);
        binding.ivDetail.setImageResource(photo);
        
        button(zodiac);
    }

    @Override
    protected ActM001MainBinding getViewBinding() {
        return ActM001MainBinding.inflate(getLayoutInflater());
    }

    @Override
    public void onBackPressed() {
        if(count == 1){
            super.onBackPressed();
            return;
        }
        count++;
        Toast.makeText(M001MainAct.this,"Nhấn lần nữa để thoát", Toast.LENGTH_SHORT).show();
        new Handler().postDelayed(() -> count = 0, 2000);
    }

    private void button(String zodiac){
        binding.btXemThem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callView(zodiac);
            }
        });
    }

    private void callView(String zodiac) {
        Intent intent = new Intent();
        intent.setClass(this, M002MainAct.class);
        Bundle data = new Bundle();
        data.putString(KEY_TYPE, zodiac);
        intent.putExtras(data);
        startActivity(intent);
    }
}