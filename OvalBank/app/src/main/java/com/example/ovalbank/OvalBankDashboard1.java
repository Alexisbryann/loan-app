package com.example.ovalbank;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.navigation.NavigationView;

public class OvalBankDashboard1 extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private Toolbar mToolbar;
    private DrawerLayout mDrawer;
    private OnBoardingDashboard1ActivityRecyclerAdapter mOnBoardingDashboard1ActivityRecyclerAdapter;
    private RecyclerView mRecyclerItems;
    private LinearLayoutManager mMainLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ovalbank_dashboard1);

        mToolbar = findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);
        mDrawer = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, mDrawer, mToolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        mDrawer.bringToFront();
        toggle.syncState();

        mDrawer = findViewById(R.id.drawer_layout);

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

    }
    @Override
    protected void onResume() {
        super.onResume();

        mDrawer.closeDrawer(GravityCompat.START);
        updateNavHeader();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
    @Override
    public void onBackPressed() {
        if (mDrawer.isDrawerOpen(GravityCompat.START)) {
            mDrawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }
    private void updateNavHeader() {

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        if (item.getItemId()==R.id.nav_home){

        }

        return false;
    }
}