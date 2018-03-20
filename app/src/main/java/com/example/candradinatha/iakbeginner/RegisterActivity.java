package com.example.candradinatha.iakbeginner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    public EditText etName, etUsername, etEmail, etPhone, etPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        etName = (EditText) findViewById(R.id.et_name);
        etUsername = (EditText) findViewById(R.id.et_username);
        etEmail = (EditText) findViewById(R.id.et_email);
        etPhone = (EditText) findViewById(R.id.et_phone);
        etPassword = (EditText) findViewById(R.id.et_password);
    }

    public void submitSignUp(View view) {

        boolean isError = false;
        String name = etName.getText().toString();
        String uname = etUsername.getText().toString();
        String email = etEmail.getText().toString();
        String phone = etPhone.getText().toString();
        String pass = etPassword.getText().toString();

        if (name.isEmpty()){
            isError = true;
            etName.setError("Nama masih kosong");
        }
        if (uname.isEmpty()){
            isError = true;
            etUsername.setError("Username masih kosong");
        }
        if (email.isEmpty()){
            isError = true;
            etEmail.setError("Email masih kosong");
        }
        if (phone.isEmpty()){
            isError = true;
            etPhone.setError("Telepon masih kosong");
        }
        if (pass.isEmpty()){
            isError = true;
            etPassword.setError("Password masih kosomg");
        }
        if (isError){
            Toast.makeText(this, "Data belum lengkap", Toast.LENGTH_SHORT).show();
        } else {
            Intent intent = new Intent(this, LoginActivity.class);

            intent.putExtra("name", name);
            intent.putExtra("username", uname);
            intent.putExtra("email", email);
            intent.putExtra("phone", phone);
            intent.putExtra("password", pass);

            RegisterActivity.this.startActivity(intent);
        }
    }
}
