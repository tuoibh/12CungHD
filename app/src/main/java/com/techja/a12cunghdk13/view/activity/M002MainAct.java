package com.techja.a12cunghdk13.view.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.techja.a12cunghdk13.R;
import com.techja.a12cunghdk13.databinding.ActM002MainBinding;

public class M002MainAct extends BaseAct<ActM002MainBinding> {
    @Override
    protected void initView() {
        Intent intent = getIntent();
        if(intent == null) return;
        Bundle data = intent.getExtras();
        String type = data.getString(M001MainAct.KEY_TYPE);

        switch (type){
            case M001MainAct.CU_GIAI:
                display(R.string.cu_giai_title1, R.string.cu_giai_text, R.drawable.ic_cu_giai);
                break;
            case M001MainAct.SU_TU:
                display(R.string.su_tu_title1, R.string.su_tu_text, R.drawable.ic_su_tu);
                break;
            case M001MainAct.BACH_DUONG:
                display(R.string.bach_duong_title1, R.string.bach_duong_text, R.drawable.ic_bach_duong);
                break;
            case M001MainAct.KIM_NGUU:
                display(R.string.kim_nguu_title1, R.string.kim_nguu_text, R.drawable.ic_kim_nguu);
                break;
            case M001MainAct.SONG_TU:
                display(R.string.song_tu_title1, R.string.song_tu_text, R.drawable.ic_song_tu);
                break;
            case M001MainAct.XU_NU:
                display(R.string.xu_nu_title1, R.string.xu_nu_text, R.drawable.ic_xu_nu);
                break;
            case M001MainAct.THIEN_BINH:
                display(R.string.thien_binh_title1, R.string.thien_binh_text, R.drawable.ic_thien_binh);
                break;
            case M001MainAct.BO_CAP:
                display(R.string.bo_cap_title1, R.string.bo_cap_text, R.drawable.ic_bocap);
                break;
            case M001MainAct.NHAN_MA:
                display(R.string.nhan_ma_title1, R.string.nhan_ma_text, R.drawable.ic_nhan_ma);
                break;
            case M001MainAct.MA_KET:
                display(R.string.ma_ket_title1, R.string.ma_ket_text, R.drawable. ic_ma_ket);
                break;
            case M001MainAct.BAO_BINH:
                display(R.string.bao_binh_title1, R.string.bao_binh_text, R.drawable.ic_bao_binh);
                break;
            case M001MainAct.SONG_NGU:
                display(R.string.song_ngu_title1, R.string.song_ngu_text, R.drawable.ic_song_ngu);
                break;
        }

        binding.btQuayLai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }

    private void display(int title, int text, int ic) {
        binding.tvTitle.setText(title);
        binding.tvDetail.setText(text);
        binding.ivTitle.setImageResource(ic);
    }

    @Override
    protected ActM002MainBinding getViewBinding() {
        return ActM002MainBinding.inflate(getLayoutInflater());
    }
}
