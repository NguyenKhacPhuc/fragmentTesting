package com.example.fragmenttesting;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {
    BottomNavigationView bottom;
    Toolbar toolbar;
    ViewPager viewPager;
    ViewPagerAdapter viewPagerAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottom = findViewById(R.id.bottomNav);
        viewPager = findViewById(R.id.fragment);
        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager(),0);
        //if(savedInstanceState == null){
            //getSupportFragmentManager().beginTransaction().replace(R.id.fragment,new RedFragment()).commit();
    //}
        viewPager.setAdapter(viewPagerAdapter);
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                switch (position){
                    case 0:
                        bottom.getMenu().findItem(R.id.red).setChecked(true);
                        break;
                    case 1:
                        bottom.getMenu().findItem(R.id.green).setChecked(true);
                        break;
                    case 2:
                        bottom.getMenu().findItem(R.id.blue).setChecked(true);
                        break;
                    case 3:
                        bottom.getMenu().findItem(R.id.yellow).setChecked(true);
                        break;
                    case 4:
                        bottom.getMenu().findItem(R.id.brown).setChecked(true);
                        break;
                    default:
                        break;
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        Fragment k = null;
        switch (item.getItemId()){
            case R.id.blue:
              viewPager.setCurrentItem(2);
                break;
            case R.id.red:
               viewPager.setCurrentItem(0);
                break;
            case R.id.green:
             viewPager.setCurrentItem(1);
                break;
            case R.id.yellow:
               viewPager.setCurrentItem(3);
                break;
            case R.id.brown:
               viewPager.setCurrentItem(4);
                break;
            default:
                break;
        }
        return true;
    }
}