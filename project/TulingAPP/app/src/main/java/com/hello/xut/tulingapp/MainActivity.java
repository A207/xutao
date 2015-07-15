package com.hello.xut.tulingapp;

import android.app.Activity;
import android.graphics.Picture;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.PictureDrawable;
import android.media.Image;
import android.os.Bundle;
import android.text.Layout;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.File;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class MainActivity extends Activity implements HttpGetDataListener,View.OnClickListener {
     private HttpData mHttpData;
     private List<ListData> lists;
     private ListView lv;
     private EditText sendText;
     private Button sendButton;
     private String context_str;
     private TextAdapter adapter;
     private String[] welcome_array;
     private ImageButton cClick;
     private View mian;
     private int currentImage=0;
     private int[] images={R.drawable.back5,R.drawable.back4,R.drawable.back3, R.drawable.background1,
             R.drawable.background3,R.drawable.background4,
             R.drawable.background5, R.drawable.background6,R.drawable.background7,
             R.drawable.background8,R.drawable.background9,R.drawable.background10};
     private long currentTime;
     private long oldTime=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        cClick= (ImageButton) findViewById(R.id.cClick);
        mian=(View)findViewById(R.id.mian);
        cClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             mian.setBackgroundResource(images[++currentImage%images.length]);
            }
        });
    }
    private void initView(){
        lists=new ArrayList<ListData>();
        lv=(ListView)findViewById(R.id.lv);
        sendText=(EditText)findViewById(R.id.sendText);
        sendButton=(Button)findViewById(R.id.sendBtn);
        sendButton.setOnClickListener(this);
        adapter=new TextAdapter(lists,this);
        lv.setAdapter(adapter);
        ListData listData=new ListData(getRandomWelcomeTips(),ListData.RECEIVER,getTime());
        lists.add(listData);

    }
    private String getRandomWelcomeTips(){
        String welcome_tip=null;
        welcome_array=this.getResources().getStringArray(R.array.welcome_tip);
        int index= (int) (Math.random()*(welcome_array.length-1));
        welcome_tip=welcome_array[index];
        return welcome_tip;
    }


    @Override
    public void getDataUrl(String data) {
//        System.out.println(data);
        parseText(data);
    }
    public void parseText(String str){
        try {
            JSONObject jb=new JSONObject(str);
//            System.out.println(jb.getString("code"));
//            System.out.println(jb.getString("text"));
            ListData listData=new ListData(jb.getString("text"),ListData.RECEIVER,getTime());
            lists.add(listData);
            adapter.notifyDataSetChanged();
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
    public String getTime(){
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日HH:mm:ss");
        Date curData=new Date();
        String string=sdf.format(curData);
        currentTime=System.currentTimeMillis();
        if(currentTime-oldTime>=5*60*1000){
            oldTime=currentTime;
            return string;
        }else {
            return "";
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    @Override
    public void onClick(View v) {
        getTime();
        context_str=sendText.getText().toString();
        sendText.setText("");
        String a=context_str.replace(" ","");
        String str=a.replace("\n","");
        if(str.isEmpty()) {
            Toast.makeText(MainActivity.this,"请输入内容",Toast.LENGTH_SHORT).show();
        }
        else {
        mHttpData=(HttpData) new HttpData("http://www.tuling123.com/openapi/api?key=30300060386df68316cb66e15b8a930b&info="+str,this).execute();

        ListData listData=new ListData(context_str,ListData.SEND,getTime());
        lists.add(listData);
        adapter.notifyDataSetChanged();
        }
    }

}
