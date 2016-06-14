package md.nieyt.com.androidmetarialdesignapp;

import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

import md.nieyt.com.androidmetarialdesignapp.fragment.BlankFragment;

public class TabLayoutActivity extends AppCompatActivity implements BlankFragment.OnFragmentInteractionListener {

    protected TabLayout tablayout;
    protected ViewPager viewpager;
    private List<String> mTitle = new ArrayList<>();
    public List<BlankFragment> listFragment = new ArrayList<BlankFragment>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_tab_layout);
        mTitle.add("热门帖子");
        mTitle.add("今日最新");
        mTitle.add("本月热榜");
        mTitle.add("我的收藏");
        listFragment.add(new BlankFragment());
        listFragment.add(new BlankFragment());
        listFragment.add(new BlankFragment());
        listFragment.add(new BlankFragment());
        initView();
    }

    private void initView() {
        tablayout = (TabLayout) findViewById(R.id.tab);
        viewpager = (ViewPager) findViewById(R.id.viewpager);
        setTablayout();
    }

    private void setTablayout() {
        //设置TabLayout的  模式
        tablayout.setTabMode(TabLayout.MODE_FIXED);
        //标题
        tablayout.addTab(tablayout.newTab().setText(mTitle.get(0)));
        tablayout.addTab(tablayout.newTab().setText(mTitle.get(1)));
        tablayout.addTab(tablayout.newTab().setText(mTitle.get(2)));
        tablayout.addTab(tablayout.newTab().setText(mTitle.get(3)));
        MyViewPager my = new MyViewPager(getSupportFragmentManager());
        viewpager.setAdapter(my);
        tablayout.setupWithViewPager(viewpager);
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }


    class MyViewPager extends FragmentPagerAdapter {


        public MyViewPager(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {

            return listFragment.get(position);
        }

        @Override
        public int getCount() {
            return listFragment.size();
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mTitle.get(position);
        }
    }
}
