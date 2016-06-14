package md.nieyt.com.androidmetarialdesignapp;

import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

import md.nieyt.com.androidmetarialdesignapp.fragment.BlankFragment;
import md.nieyt.com.androidmetarialdesignapp.fragment.ItemFragment;
import md.nieyt.com.androidmetarialdesignapp.fragment.dummy.DummyContent;

public class AppBarLayoutActivity extends AppCompatActivity implements ItemFragment.OnListFragmentInteractionListener {

    protected TabLayout tablayout;
    protected AppBarLayout appbarlayout;
    protected ViewPager viewpager;
    protected CoordinatorLayout coordinatorlayout;
    private List<String> mTitle = new ArrayList<>();
    public List<ItemFragment> listFragment = new ArrayList<ItemFragment>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_app_bar_layout);
        mTitle.add("热门帖子热门帖子热门帖子热门帖子");
        mTitle.add("今日");
        mTitle.add("本月热榜榜榜榜榜榜榜榜榜榜");
        mTitle.add("我的收藏收藏收藏收藏收藏收藏");
        listFragment.add(new ItemFragment());
        listFragment.add(new ItemFragment());
        listFragment.add(new ItemFragment());
        listFragment.add(new ItemFragment());
        initView();
    }

    private void initView() {
        tablayout = (TabLayout) findViewById(R.id.tablayout);
        appbarlayout = (AppBarLayout) findViewById(R.id.appbarlayout);
        viewpager = (ViewPager) findViewById(R.id.viewpager);
        coordinatorlayout = (CoordinatorLayout) findViewById(R.id.coordinatorlayout);
        //设置TabLayout的  模式
        tablayout.setTabMode(TabLayout.GRAVITY_FILL);
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
    public void onListFragmentInteraction(DummyContent.DummyItem item) {

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
