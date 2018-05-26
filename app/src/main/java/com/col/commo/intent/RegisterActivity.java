package com.col.commo.intent;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by commo on 2017/3/13.
 */

public class RegisterActivity extends Activity {

    private TextView reg_textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.thrid);

        reg_textView = (TextView) findViewById(R.id.textView3);
    }
}
