package md.nieyt.com.androidmetarialdesignapp;

import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class FloatingActionActivity extends AppCompatActivity implements View.OnClickListener {

    protected FloatingActionButton floatingActionButton;
    protected CoordinatorLayout container;
    protected Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_floating_action);
        container = (CoordinatorLayout) findViewById(R.id.container);
        initView();
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.submit) {
            Snackbar.make(container,"余罪余罪余罪余罪余罪余罪余罪余罪余罪余罪余罪余罪余罪余罪余罪",Snackbar.LENGTH_SHORT).show();
        }
        if(view.getId()==R.id.floatingActionButton){

        }
    }

    private void initView() {
        floatingActionButton = (FloatingActionButton) findViewById(R.id.floatingActionButton);
        floatingActionButton.setOnClickListener(FloatingActionActivity.this);
        submit = (Button) findViewById(R.id.submit);
        submit.setOnClickListener(this);
    }
}
