package com.example.candradinatha.iakbeginner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {

    private TextView tvName, tvUsername, tvEmail, tvPhone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        String name, username, email, phone, password;

        tvName = (TextView) findViewById(R.id.tv_value_name);
        tvUsername = (TextView) findViewById(R.id.tv_value_username);
        tvEmail = (TextView) findViewById(R.id.tv_value_email);
        tvPhone = (TextView) findViewById(R.id.tv_value_phone);

        Intent intent = getIntent();

        name = intent.getStringExtra("name");
        tvName.setText(name);
        username = intent.getStringExtra("username");
        tvUsername.setText(username);
        email = intent.getStringExtra("email");
        tvEmail.setText(email);
        phone = intent.getStringExtra("phone");
        tvPhone.setText(phone);
        password = intent.getStringExtra("password");

        intent.putExtra("name", name);
        intent.putExtra("username", username);
        intent.putExtra("email", email);
        intent.putExtra("phone", phone);
        intent.putExtra("password", password);


    }
}
