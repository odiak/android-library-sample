package net.odiak.androidlibrarysample.app;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import net.odiak.androidlibrarysample.lib.CustomView;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView tv = new TextView(this);
        tv.setText("hello");
        setContentView(tv);

        System.out.println(new CustomView(this));
    }
}
