package com.hello.xut.tulingapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.os.Handler;

import java.util.logging.LogRecord;

/**
 * Created by Administrator on 2015/7/14.
 */
public class PageTurn extends MainActivity{
    Handler handler=new Handler(){

        public void handleMessage(android.os.Message msg){
         switch (msg.what){
             case 1:
                 Intent intent=new Intent(PageTurn.this,MainActivity.class);
                 startActivity(intent);
                 PageTurn.this.finish();
                 break;
             default:
                 break;
         }
        };
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome_page);
        handler.sendEmptyMessageDelayed(1,6000);
    }

}
