package md.nieyt.com.androidmetarialdesignapp;

import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class SnackBarActivity extends AppCompatActivity implements View.OnClickListener {

    protected Button show;
    protected Button showAction;
    protected Button dimss;
    protected RelativeLayout rootview;
    protected CoordinatorLayout container;
    private Snackbar mSnack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_snack_bar);
        initView();
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.show) {
            mSnack = Snackbar.make(container, "我是来展示snackBar的", Snackbar.LENGTH_SHORT);
            mSnack.show();
        } else if (view.getId() == R.id.showAction) {
            mSnack = Snackbar.make(container, "带action的snack", Snackbar.LENGTH_SHORT);
            mSnack.setAction("点我消失", new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mSnack.dismiss();
                }
            });
            setShackBarLayout();
            mSnack.show();
        } else if (view.getId() == R.id.dimss) {
            if (mSnack != null) {
                mSnack.dismiss();
            }

        }
    }

    /**
     * 修改字体颜色
     */
    private void setShackBarLayout() {
        View view = mSnack.getView();
        TextView snackView = (TextView) view.findViewById(R.id.snackbar_text);
        snackView.setTextColor(getResources().getColor(R.color.colorAccent));
        TextView snackActionView = (TextView) view.findViewById(R.id.snackbar_action);
        snackActionView.setTextColor(getResources().getColor(R.color.colorPrimary));
    }

    private void initView() {
        show = (Button) findViewById(R.id.show);
        show.setOnClickListener(SnackBarActivity.this);
        showAction = (Button) findViewById(R.id.showAction);
        showAction.setOnClickListener(SnackBarActivity.this);
        dimss = (Button) findViewById(R.id.dimss);
        dimss.setOnClickListener(SnackBarActivity.this);
        rootview = (RelativeLayout) findViewById(R.id.rootview);
        container = (CoordinatorLayout) findViewById(R.id.container);
    }
}
