package md.nieyt.com.androidmetarialdesignapp;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

/***
 * 侧滑
 */
public class NavigationViewActivity extends AppCompatActivity {

    protected TextView idTvContent;
    protected NavigationView navigationView;
    protected DrawerLayout drawerlayout;
    private int currentNavigationId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_navigation_view);
        initView();
    }

    private void initView() {
        idTvContent = (TextView) findViewById(R.id.id_tv_content);
        navigationView = (NavigationView) findViewById(R.id.navigationView);
        drawerlayout = (DrawerLayout) findViewById(R.id.drawerlayout);
        // 我们可以用setNavigationItemSelectedListener方法来设置当导航项被点击时的回调。
        // OnNavigationItemSelectedListener会提供给我们被选中的MenuItem，
        // 这与Activity的onOptionsItemSelected非常类似。通过这个回调方法，我们可以处理点击事件，
        // 改变item的选中状态，更新页面内容，关闭导航菜单，以及任何我们需要的操作。
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.hot:
                        menuItem.setChecked(true);
                        idTvContent.setText("热门分享");
                        break;
                    case R.id.collection:
                        menuItem.setChecked(true);
                        idTvContent.setText("我的收藏");
                        break;
                }
                drawerlayout.closeDrawers(); // 关闭导航菜单
                return false;
            }
        });

    }
}
