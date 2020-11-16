package com.alexis.e_loan;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class HomeActivity extends AppCompatActivity {

    int progress = 0;
    private FirebaseAuth mAuth;
    private FirebaseUser mCurrentUser;
    private ProgressBar mProgressBar;
    private TextView mCongratulations;
    private Button mCheckLimit;
    private Handler hdlr = new Handler();
    private CardView mTermsAndConditions;
    private Button mPayFee;
    private AdView mAdView;
    private CardView mPrivacy;
    private Button mRead;
    private CardView mCardCheckLimit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        mAuth = FirebaseAuth.getInstance();
        mCurrentUser = mAuth.getCurrentUser();

        mProgressBar = findViewById(R.id.progressBar3);
        mCongratulations = findViewById(R.id.text_view_congratulations);
        mTermsAndConditions = findViewById(R.id.card_view_terms_and_conditions);
        mPayFee = findViewById(R.id.button_pay_fee);
        mCheckLimit = findViewById(R.id.button_check_limit);
        mCardCheckLimit = findViewById(R.id.card_view_check_limit);
        mPrivacy = findViewById(R.id.card_view_privacy_policy);
        mRead = findViewById(R.id.button_privacy_policy);
//        mCheckLimit.setVisibility(View.INVISIBLE);

//        admob
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        mRead.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, PrivacyPolicy.class);
                startActivity(intent);
            }
        });

        mCheckLimit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCongratulations.setVisibility(View.INVISIBLE);
                mTermsAndConditions.setVisibility(View.INVISIBLE);
                mProgressBar.setVisibility(View.VISIBLE);
                setProgressValue(progress);
            }
        });

        mPayFee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"You currently do not qualify for a loan",Toast.LENGTH_LONG).show();

            }
        });
    }

    private void setProgressValue(final int progress) {
        // set the progress
        mProgressBar.setProgress(progress);
        // thread is used to change the progress value
        final Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                hdlr.post(new Runnable() {
                    public void run() {
                        if (progress == 30) {
                            mCongratulations.setVisibility(View.VISIBLE);
                            mTermsAndConditions.setVisibility(View.VISIBLE);
                        }
                    }
                });
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                setProgressValue(progress + 10);
            }
        });
        thread.start();
    }
    @Override
    public void onStart() {
        super.onStart();

        if (mCurrentUser == null){
            Intent loginIntent = new Intent(HomeActivity.this,SignUp.class);
            loginIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            loginIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(loginIntent);
            finish();
        }
    }
    @Override
    protected void onResume() {
        super.onResume();
        Intent intent = getIntent();
        int mVal = intent.getIntExtra("ACCEPT", 0);
        if (mVal == 1) {
            mCardCheckLimit.setVisibility(View.VISIBLE);
        } else {
            mCardCheckLimit.setVisibility(View.INVISIBLE);
        }
    }
}