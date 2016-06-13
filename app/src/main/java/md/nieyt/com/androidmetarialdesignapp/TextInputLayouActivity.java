package md.nieyt.com.androidmetarialdesignapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * 在MD中，使用TextInputLayout将EditText进行了封装，提示信息会变成一个显示在EditText之上的floating label，
 * 这样用户就始终知道他们现在输入的是什么，而且过度动画是平滑的。
 * 还可以在下方通过setError设置Error提示，使用比较简单，所以不做过多说明，详情见Demo源码。
 */
public class TextInputLayouActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_input_layou);
    }
}
