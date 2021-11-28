
package com.example.petcare;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.petcare.R;

public class loginExists extends AppCompatActivity implements View.OnClickListener {
    EditText etUserName, etPassword;
    Button btnSignIn;

    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_login_exists);
        etUserName = (EditText)findViewById(R.id.etUserName);
        etPassword = (EditText)findViewById(R.id.etPassword);
        btnSignIn = (Button)findViewById(R.id.btnSignIn);
        btnSignIn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v==btnSignIn){
            if (etPassword.getText().toString().length()>0 && etUserName.getText().toString().length()>0){
                etUserName.setText("");
                etPassword.setText("");
            }
        }
    }

}
