package com.example.hongchen.Activity;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ViewFlipper;

import com.example.hongchen.Adapter.MainViewPagerAdapter;
import com.example.hongchen.Fragment.Fragment_HomePage;
import com.example.hongchen.Fragment.Fragment_Search;
import com.example.hongchen.R;
import com.google.android.material.tabs.TabLayout;

public class HomePage extends AppCompatActivity {

    ViewPager viewPager;
    TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homepage);

        anhxa();

        init();

    }

    public void init() {
        MainViewPagerAdapter mainViewPagerAdapter = new MainViewPagerAdapter(getSupportFragmentManager());
        mainViewPagerAdapter.addFragment(new Fragment_HomePage(),"Trang Chu");
        mainViewPagerAdapter.addFragment(new Fragment_Search(),"Tim kiem");
        viewPager.setAdapter(mainViewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
    }

    public void anhxa() {

        viewPager = findViewById(R.id.myViewPager);
        tabLayout = findViewById(R.id.myTabLayout);
    }
}