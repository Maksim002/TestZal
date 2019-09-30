package com.example.testzal;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;
    private ViewPager viewPager;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar);


        bottomNavigationView = findViewById(R.id.bottomNavigation);
        viewPager = findViewById(R.id.frame_container);


        setupViewPager();
        setupNavigationView();

    }
    private void setupNavigationView() {
        bottomNavigationView.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                        switch (menuItem.getItemId()) {
                            case R.id.e1:
                                viewPager.setCurrentItem(0);
                                return true;
                            case R.id.e2:
                                viewPager.setCurrentItem(1);
                                return true;
                            case R.id.e3:
                                viewPager.setCurrentItem(2);
                                return true;
                        }
                        return false;
                    }
                });
    }

    private void setupViewPager(){
        ViewPegerAdaptor adaptor = new ViewPegerAdaptor(getSupportFragmentManager());
        adaptor.addFragment(new HomeFragment());
        adaptor.addFragment(new ListViewPager());
        adaptor.addFragment(new NewsViewPager());
        viewPager.setAdapter(adaptor);
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {
            }
            @Override
            public void onPageSelected(int i) {
                switch (i){
                    case 0:
                        bottomNavigationView.setSelectedItemId(R.id.e1);
                        break;
                    case 1:
                        bottomNavigationView.setSelectedItemId(R.id.e2);
                        break;
                    case 2:
                        bottomNavigationView.setSelectedItemId(R.id.e3);
                        break;
                }

            }

            @Override
            public void onPageScrollStateChanged(int i) {
            }
        });
    }
}
