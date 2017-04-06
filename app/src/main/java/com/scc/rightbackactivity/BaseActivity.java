package com.scc.rightbackactivity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Administrator on 2017/3/19.
 */
public abstract class BaseActivity extends SlidingActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayout());
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        TextView title = (TextView) findViewById(R.id.toolbar_title);
        title.setText(setTitleText());
        setSupportActionBar(toolbar);
        //去掉默认显示的标题
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        if (getSupportActionBar() != null) {
            //设置返回的按钮
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        eventAndData();
    }
    /**
     * 根据返回的字符来设置Activity的title
     *
     * @return
     */
    protected abstract String setTitleText();
    /**
     * 处理事件和数据
     */
    protected abstract void eventAndData();
    /**
     * 返回子类的布局
     *
     * @return
     */
    protected abstract int getLayout();
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            //监听返回的按钮
            case android.R.id.home:
                finish();
                return true;
            //右边more按钮的点击事件.如需要,子类去实现
//            case R.id.more:
//                Toast.makeText(BaseActivity.this, "点击了菜单", Toast.LENGTH_SHORT).show();
//                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //显示右边more按钮
//        getMenuInflater().inflate(R.menu.more, menu);//加载menu文件到布局
        return true;
    }
}
