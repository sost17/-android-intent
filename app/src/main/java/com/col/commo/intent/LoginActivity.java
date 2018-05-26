package com.col.commo.intent;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by commo on 2017/3/13.
 */

public class LoginActivity extends Activity {

    private TextView log_textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);

        log_textView = (TextView) findViewById(R.id.textView2);


    }
}
