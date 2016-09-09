package com.example.pedro.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import com.example.pedro.login.core.controllers.ControllerMainActivity;

public class secondActivity extends AppCompatActivity {

    private TextView tvWelcome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tvWelcome = (TextView)findViewById(R.id.tvWelcome);

        tvWelcome.setText(ControllerMainActivity.getInstance().getLogin());
    }
}
