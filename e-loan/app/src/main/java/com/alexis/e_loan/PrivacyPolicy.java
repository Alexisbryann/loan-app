package com.alexis.e_loan;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class PrivacyPolicy extends AppCompatActivity {

    private Button mBtnAccept;
    private Button mDecline;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.privacy_policy);

        mBtnAccept = findViewById(R.id.btn_accept_terms);

        mDecline = findViewById(R.id.btn_decline);

        mBtnAccept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(PrivacyPolicy.this,HomeActivity.class);
                intent.putExtra("ACCEPT",1);
                startActivity(intent);
                finish();

            }
        });
        mDecline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PrivacyPolicy.this,HomeActivity.class);
                intent.putExtra("DECLINE",0);
                startActivity(intent);
                finish();
            }
        });

    }
}
