package com.example.loginusingsharedpreferences.ui;

        import androidx.appcompat.app.AppCompatActivity;
        import androidx.fragment.app.Fragment;
        import androidx.fragment.app.FragmentManager;
        import androidx.fragment.app.FragmentTransaction;
        import androidx.viewpager.widget.ViewPager;

        import android.os.Bundle;

        import com.example.loginusingsharedpreferences.Adapters.ViewPagerAdapter;
        import com.example.loginusingsharedpreferences.Fragments.BlackFridayDealsFragment;
        import com.example.loginusingsharedpreferences.Fragments.CategoriesFragment;
        import com.example.loginusingsharedpreferences.R;
        import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    Fragment mCategories;
    Fragment mBlackFriday;
    FragmentManager mManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        mCategories = new CategoriesFragment();
//        mBlackFriday = new BlackFridayDealsFragment();
////        Fragment categories = new CategoriesFragment();
//
//        mManager = getSupportFragmentManager();
//        FragmentTransaction transaction = mManager.beginTransaction();
//        transaction.add(R.id.container1,mCategories);
//        transaction.add(R.id.container2,mBlackFriday);
//
//        transaction.commit();

        ViewPager viewPager = findViewById(R.id.viewPager);
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(viewPagerAdapter);

        TabLayout tabLayout = findViewById(R.id.tabLayout);
        tabLayout.setupWithViewPager(viewPager);
    }
}