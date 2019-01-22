package com.example.soulapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
/**
 * Created by 郝德琛 haodechen
 */
public class LoginActivity extends AppCompatActivity {
    private TextView textViewLoginCancel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        textViewLoginCancel = findViewById(R.id.text_view_login_cancel);
        textViewLoginCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this, MainActivity.class));
            }
        });


    }
}
