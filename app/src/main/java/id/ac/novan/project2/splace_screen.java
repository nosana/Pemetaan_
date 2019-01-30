package id.ac.novan.project2;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class splace_screen extends AppCompatActivity {
    private static int Splace_time_out =2000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splace_screen);

        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
        .setDefaultFontPath("fonts/Cocogoose.ttf")
        .setFontAttrId(R.attr.fontPath)
        .build()
        );

        new Handler(). postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent home =new Intent(splace_screen.this, menu.class);
                startActivity(home);
                finish();
                }
        },Splace_time_out);

    }

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }
}
