package com.example.candradinatha.iakbeginner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class DetailActivity extends AppCompatActivity {

    private TextView tvJudul, tvContent, tvPrice;
    private Button btnBeli;

    private ImageView ivAvatar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);


        Intent intent = getIntent();

        String judul = intent.getStringExtra("judul");
        String content = intent.getStringExtra("content");
        String price = intent.getStringExtra("price");
        int avatar = intent.getIntExtra("avatar",R.drawable.women_7);

        tvJudul = (TextView) findViewById(R.id.tv_judul_detail);
        tvContent = (TextView) findViewById(R.id.tv_content_detail);
        tvPrice = (TextView) findViewById(R.id.tv_harga_detail);
        ivAvatar = (ImageView) findViewById(R.id.iv_avatar_detail);
        btnBeli = (Button) findViewById(R.id.btn_beli);

        tvJudul.setText(judul);
        tvContent.setText(content);
        tvPrice.setText(price);
        ivAvatar.setImageResource(avatar);

        btnBeli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(DetailActivity.this, "Maaf, Opsi Terkait Belum Tersedia", Toast.LENGTH_SHORT).show();
            }
        });

    }

//    public void submitAdd(View view) {
//        Toast.makeText(this, "Maaf, Opsi Terkait Belum Tersedia", Toast.LENGTH_SHORT).show();
//    }

}
