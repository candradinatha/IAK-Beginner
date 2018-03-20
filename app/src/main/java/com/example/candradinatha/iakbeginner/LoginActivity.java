package com.example.candradinatha.iakbeginner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private EditText etUsername, etPassword;

    String name, username, email, phone, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etUsername = (EditText) findViewById(R.id.et_username);
        etPassword = (EditText) findViewById(R.id.et_password);
    }

    public void submitLogin(View view) {
        name = getIntent().getStringExtra("name");
        username = getIntent().getStringExtra("username");
        email = getIntent().getStringExtra("email");
        phone = getIntent().getStringExtra("phone");
        password = getIntent().getStringExtra("password");

        String uname, pass;
        boolean isError = false;

        uname = etUsername.getText().toString();
        pass = etPassword.getText().toString();

        if (uname.isEmpty()){
            isError = true;
            etUsername.setError("Username masih kosong");
        }
        if (pass.isEmpty()){
            isError = true;
            etPassword.setError("Password masih kosong");
        }
        if (isError){
            Toast.makeText(this, "Data belum lengkap", Toast.LENGTH_SHORT).show();
        } else {
            if (uname.equals(uname) && pass.equals(password)){
                Toast.makeText(this, "Anda Berhasil Login", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(this, HomeActivity.class);

                intent.putExtra("name", name);
                intent.putExtra("username", username);
                intent.putExtra("email", email);
                intent.putExtra("phone", phone);
                intent.putExtra("password", password);

                LoginActivity.this.startActivity(intent);
                finish();
            } else {
                Toast.makeText(this, "Username atau password salah", Toast.LENGTH_SHORT).show();
            }
        }
    }

    public void submitSignUp(View view) {
        Intent intent = new Intent(this, RegisterActivity.class);
        startActivity(intent);
    }


    public void submitSkip(View view) {
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }

}
