package com.hello.xut.tulingapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
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
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }
    private void initView(){
        lists=new ArrayList<ListData>();
        lv=(ListView)findViewById(R.id.lv);
        sendText=(EditText)findViewById(R.id.sendText);
        sendButton=(Button)findViewById(R.id.sendBtn);
        sendButton.setOnClickListener(this);
        adapter=new TextAdapter(lists,this);
        lv.setAdapter(adapter);
        ListData listData=new ListData(getRandomWelcomeTips(),ListData.RECEIVER);
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
        System.out.println(data);
        parseText(data);
    }
    public void parseText(String str){
        try {
            JSONObject jb=new JSONObject(str);
//            System.out.println(jb.getString("code"));
//            System.out.println(jb.getString("text"));
            ListData listData=new ListData(jb.getString("text"),ListData.RECEIVER);
            lists.add(listData);
            adapter.notifyDataSetChanged();
        } catch (JSONException e) {
            e.printStackTrace();
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
        context_str=sendText.getText().toString();
        mHttpData=(HttpData) new HttpData("http://www.tuling123.com/openapi/api?key=30300060386df68316cb66e15b8a930b&info="+context_str,this).execute();
        ListData listData=new ListData(context_str,ListData.SEND);
        lists.add(listData);
        adapter.notifyDataSetChanged();
    }
}
