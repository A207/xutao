package com.hello.xut.tulingapp;

/**
 * Created by Administrator on 2015/7/13.
 */
import android.os.AsyncTask;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class HttpData extends AsyncTask<String,Void,String>{
     private HttpClient mHttpClient;
     private HttpGet mHttpGet;
     private HttpResponse mHttpRosponse;
     private HttpEntity mHttpEntity;
     private InputStream in;
     private String url;
     private HttpGetDataListener listener;
     public HttpData(String url,HttpGetDataListener listener){
         this.url=url;
         this.listener=listener;
     }
    @Override
    protected String doInBackground(String... params) {
        try {
            mHttpClient=new DefaultHttpClient();
            mHttpGet=new HttpGet(url);
            mHttpRosponse=mHttpClient.execute(mHttpGet);
            mHttpEntity=mHttpRosponse.getEntity();
            in=mHttpEntity.getContent();
            BufferedReader br=new BufferedReader(new InputStreamReader(in));
            String line=null;
            StringBuffer sb=new StringBuffer();
            while ((line=br.readLine())!=null){
                sb.append(line);
            }
            return sb.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    protected void onPostExecute(String result) {
        listener.getDataUrl(result);
        super.onPostExecute(result);
    }
}