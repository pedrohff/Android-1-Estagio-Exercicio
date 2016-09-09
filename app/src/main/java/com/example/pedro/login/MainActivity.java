package com.example.pedro.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.pedro.login.core.controllers.ControllerMainActivity;

public class MainActivity extends AppCompatActivity {

    private EditText eLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eLogin = (EditText)findViewById(R.id.eLogin);
    }

    public void click (View v){
        ControllerMainActivity.getInstance()
                            .setLogin(eLogin.getText().toString());
        Intent i = new Intent(this, secondActivity.class);
        startActivity(i);
        finish();
    }

}
