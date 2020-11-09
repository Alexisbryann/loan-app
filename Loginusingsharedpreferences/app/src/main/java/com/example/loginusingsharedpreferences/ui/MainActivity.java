package com.example.loginusingsharedpreferences.ui;

        import androidx.appcompat.app.AppCompatActivity;
        import androidx.viewpager.widget.ViewPager;

        import android.os.Bundle;

        import com.example.loginusingsharedpreferences.Adapters.ViewPagerAdapter;
        import com.example.loginusingsharedpreferences.R;
        import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager viewPager = findViewById(R.id.viewPager);
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(viewPagerAdapter);

        TabLayout tabLayout = findViewById(R.id.tabLayout);
        tabLayout.setupWithViewPager(viewPager);
    }
}