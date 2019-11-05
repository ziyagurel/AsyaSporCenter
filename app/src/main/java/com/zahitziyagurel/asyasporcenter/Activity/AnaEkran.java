package com.zahitziyagurel.asyasporcenter.Activity;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.zahitziyagurel.asyasporcenter.R;

public class AnaEkran extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ana_ekran);

        Button btn_satis = findViewById(R.id.btn_satis);
        Button btn_stok = findViewById(R.id.btn_stok);
        Button btn_rapor = findViewById(R.id.btn_rapor);
        Button btn_kasa = findViewById(R.id.btn_kasa);

        btn_satis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), SatisEkrani.class ));
            }
        });
    }
}
