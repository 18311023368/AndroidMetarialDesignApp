package md.nieyt.com.androidmetarialdesignapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 *
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    protected Button demo;
    private Button textInputLayout;
    private Button floatingActionButton;
    private Button snackbar;
    private Button tablayout;
    private Button navigationView;
    private Button appBarLayout;
    private Button CollapsingToolbarLayout;
    private Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_main);
        mContext = this;
        initViews();
        initView();
    }

    private void initViews() {
        this.CollapsingToolbarLayout = (Button) findViewById(R.id.CollapsingToolbarLayout);
        this.appBarLayout = (Button) findViewById(R.id.appBarLayout);
        this.navigationView = (Button) findViewById(R.id.navigationView);
        this.tablayout = (Button) findViewById(R.id.tablayout);
        this.snackbar = (Button) findViewById(R.id.snackbar);
        this.floatingActionButton = (Button) findViewById(R.id.floatingActionButton);
        this.textInputLayout = (Button) findViewById(R.id.textInputLayout);
        setOnClick();
    }

    private void setOnClick() {
        textInputLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //输入框
                mContext.startActivity(new Intent(mContext, TextInputLayouActivity.class));
            }
        });
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //悬浮按钮
                mContext.startActivity(new Intent(mContext, FloatingActionActivity.class));

            }
        });
        snackbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ///Toast升级版
                mContext.startActivity(new Intent(mContext, SnackBarActivity.class));
            }
        });
        tablayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ///Tab+ViewPager
                mContext.startActivity(new Intent(mContext, TabLayoutActivity.class));
            }
        });
        navigationView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ///官方侧滑
                mContext.startActivity(new Intent(mContext, NavigationViewActivity.class));
            }
        });
        appBarLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mContext.startActivity(new Intent(mContext, AppBarLayoutActivity.class));
            }
        });
        CollapsingToolbarLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mContext.startActivity(new Intent(mContext, CollapsingToolbarLayoutActivity.class));


            }
        });
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.demo) {
            mContext.startActivity(new Intent(mContext, AllMaterialDesignActivity.class));
        }
    }

    private void initView() {
        textInputLayout = (Button) findViewById(R.id.textInputLayout);
        floatingActionButton = (Button) findViewById(R.id.floatingActionButton);
        snackbar = (Button) findViewById(R.id.snackbar);
        tablayout = (Button) findViewById(R.id.tablayout);
        navigationView = (Button) findViewById(R.id.navigationView);
        appBarLayout = (Button) findViewById(R.id.appBarLayout);
        CollapsingToolbarLayout = (Button) findViewById(R.id.CollapsingToolbarLayout);
        demo = (Button) findViewById(R.id.demo);
        demo.setOnClickListener(MainActivity.this);
    }
}
