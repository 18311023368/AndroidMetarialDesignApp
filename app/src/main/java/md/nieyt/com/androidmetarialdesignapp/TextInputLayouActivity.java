package md.nieyt.com.androidmetarialdesignapp;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

/**
 * 在MD中，使用TextInputLayout将EditText进行了封装，提示信息会变成一个显示在EditText之上的floating label，
 * 这样用户就始终知道他们现在输入的是什么，而且过度动画是平滑的。
 * 还可以在下方通过setError设置Error提示，使用比较简单，所以不做过多说明，
 */
public class TextInputLayouActivity extends AppCompatActivity {

    private android.support.design.widget.TextInputLayout username;
    private android.support.design.widget.TextInputLayout password;
    private android.widget.Button button;
    private LinearLayout view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_input_layou);
        view = (LinearLayout) findViewById(R.id.rootview);
        this.button = (Button) findViewById(R.id.button);
        this.username = (TextInputLayout) findViewById(R.id.username);
        this.password = (TextInputLayout) findViewById(R.id.password);
        setonClick();
    }

    private void setonClick() {
        username.getEditText().addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.length() > 6) {
                    username.setErrorEnabled(false);
                } else {
                    username.setErrorEnabled(true);
                    username.setError("用户名不能小于6位数");
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        password.getEditText().addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.length() > 6) {
                    password.setErrorEnabled(false);
                } else {
                    password.setErrorEnabled(true);
                    password.setError("密码不能小于6位数");
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (username.getEditText().getText().toString().length() < 6) {
                    username.setErrorEnabled(true);
                    username.setError("用户名不能小于6位数");
                }
                if (password.getEditText().getText().toString().length() < 6) {
                    password.setErrorEnabled(true);
                    password.setError("密码不能小于6位数");
                }
                
            }
        });
    }
}
