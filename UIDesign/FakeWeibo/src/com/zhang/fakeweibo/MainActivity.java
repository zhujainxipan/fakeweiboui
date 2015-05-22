package com.zhang.fakeweibo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.widget.RadioGroup;
import com.zhang.fakeweibo.FragmentAdapter.MainFragmentAdapter;
import com.zhang.fakeweibo.fragments.DiscoverFragment;
import com.zhang.fakeweibo.fragments.HomeFragment;
import com.zhang.fakeweibo.fragments.MeFragmemt;
import com.zhang.fakeweibo.fragments.MessageFrament;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends FragmentActivity implements ViewPager.OnPageChangeListener, RadioGroup.OnCheckedChangeListener {
    private ViewPager pager;
    private List<Fragment> fragmentList;
    private RadioGroup radioGroup;
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        radioGroup= (RadioGroup) findViewById(R.id.main_rg);
        pager= (ViewPager) findViewById(R.id.main_pager);
        pager.setOnPageChangeListener(this);
        fragmentList=new ArrayList<Fragment>();
        fragmentList.add(new HomeFragment());
        fragmentList.add(new MessageFrament());
        fragmentList.add(new DiscoverFragment());
        fragmentList.add(new MeFragmemt());
        MainFragmentAdapter adapter=new MainFragmentAdapter(getSupportFragmentManager(),fragmentList);
        pager.setAdapter(adapter);
        radioGroup.setOnCheckedChangeListener(this);
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        switch (position){
            case 0:
                radioGroup.check(R.id.main_min);
                break;
            case 1:
                radioGroup.check(R.id.main_mess);
                break;
            case 2:
                radioGroup.check(R.id.main_find);
                break;
            case 3:
                radioGroup.check(R.id.main_me);
        }

    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }

    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int i) {
        switch (i){
            case R.id.main_min:
                pager.setCurrentItem(0);
                break;
            case R.id.main_mess:
                pager.setCurrentItem(1);
                break;
            case R.id.main_find:
                pager.setCurrentItem(2);
                break;
            case R.id.main_me:
                pager.setCurrentItem(3);
                break;
        }
    }
}
