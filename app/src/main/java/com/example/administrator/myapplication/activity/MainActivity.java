package com.example.administrator.myapplication.activity;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.example.administrator.myapplication.R;
import com.example.administrator.myapplication.fragment.FuWuFragment;
import com.example.administrator.myapplication.fragment.MainPageFragment;
import com.example.administrator.myapplication.fragment.OrderFragment;
import com.example.administrator.myapplication.fragment.PaiHangFragment;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    List<Fragment> fragmentList = new ArrayList<>();
    ViewPager vpMain;
    RadioGroup radioGMain;
        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        vpMain = (ViewPager) findViewById(R.id.vp_main);
        radioGMain = (RadioGroup) findViewById(R.id.radioG_main);
        fragmentList.add(new MainPageFragment());
        fragmentList.add(new OrderFragment());
        fragmentList.add(new PaiHangFragment());
        fragmentList.add(new FuWuFragment());

        vpMain.setAdapter(new MyFragmentAdapterextends(getSupportFragmentManager()));

        //页面切换
        vpMain.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                //改变radio选择状态
                RadioButton radioButton = (RadioButton) radioGMain.getChildAt(position);
                radioButton.setChecked(true);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        //radiogroup 点击事件
        radioGMain.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                int nowIndex = 0;
                switch (checkedId) {
                    case R.id.rbtn_shou:
                        nowIndex = 0;
                        break;
                    case R.id.rbtn_orde:
                        nowIndex = 1;
                        break;
                    case R.id.rbtn_paihang:
                        nowIndex = 2;
                        break;
                    case R.id.rbtn_fuwu:
                        nowIndex = 3;
                        break;
                }

                vpMain.setCurrentItem(nowIndex);
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    //菜单设计
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    //右菜单点击点击事件
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override

    //item 点击事件
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_personal ){
            // Handle the camera action
            Log.i("ming", "onNavigationItemSelected: 11");
        } else if (id == R.id.nav_address) {
            Log.i("ming", "onNavigationItemSelected: 22");
        } else if (id == R.id.nav_worker) {
            Log.i("ming", "onNavigationItemSelected: 33");
        } else if (id == R.id.nav_set) {
            Log.i("ming", "onNavigationItemSelected: 44");
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    class MyFragmentAdapterextends extends FragmentPagerAdapter {

        public MyFragmentAdapterextends(FragmentManager f) {
            super(f);
        }

        @Override
        public Fragment getItem(int position) {
            return fragmentList.get(position);
        }

        @Override
        public int getCount() {
            return fragmentList.size();
        }
    }
}
