package com.scc.rightbackactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends BaseActivity {


    @Override
    protected String setTitleText() {
        return "今日事今日毕";
    }
    @Override
    protected void eventAndData() {

    }
    @Override
    protected int getLayout() {
        return R.layout.activity_main;
    }
    public void jump(View view) {
        startActivity(new Intent(this, Main2Activity.class));
    }
}
