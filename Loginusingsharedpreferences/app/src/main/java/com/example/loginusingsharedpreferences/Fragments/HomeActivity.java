package com.example.loginusingsharedpreferences.Fragments;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.loginusingsharedpreferences.R;
public class HomeActivity extends AppCompatActivity {

    Fragment mCategories;
    Fragment mBlackFriday;
    FragmentManager mManager;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mCategories = new CategoriesFragment();
        mBlackFriday = new BlackFridayDealsFragment();
//        Fragment categories = new CategoriesFragment();

        mManager = getSupportFragmentManager();
        FragmentTransaction transaction = mManager.beginTransaction();
        transaction.add(R.id.container1,mCategories);
        transaction.add(R.id.container2,mBlackFriday);

        transaction.commit();


    }
}