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
public class MainActivity extends AppCompatActivity  {

    private Button textInputLayout;
    private Button floatingActionButton;
    private Button snackbar;
    private Button tablayout;
    private Button navigationView;
    private Button coordinatorLayout;
    private Button appBarLayout;
    private Button CollapsingToolbarLayout;
    private Context mContext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContext=this;
        initViews();
    }
    private void initViews(){
        this.CollapsingToolbarLayout = (Button) findViewById(R.id.CollapsingToolbarLayout);
        this.appBarLayout = (Button) findViewById(R.id.appBarLayout);
        this.coordinatorLayout = (Button) findViewById(R.id.coordinatorLayout);
        this.navigationView = (Button) findViewById(R.id.navigationView);
        this.tablayout = (Button) findViewById(R.id.tablayout);
        this.snackbar = (Button) findViewById(R.id.snackbar);
        this.floatingActionButton = (Button) findViewById(R.id.floatingActionButton);
        this.textInputLayout = (Button) findViewById(R.id.textInputLayout);
        setOnClick();
    }
    private void setOnClick(){
        textInputLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mContext.startActivity(new Intent(mContext,TextInputLayouActivity.class));
            }
        });
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        snackbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        tablayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        navigationView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        coordinatorLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        appBarLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        CollapsingToolbarLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
