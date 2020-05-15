package com.harjas.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    WebView w;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        w=findViewById(R.id.webview);
        w.loadUrl("https://www.hackveda.in/");
        w.getSettings().setJavaScriptEnabled(true);
        w.setWebViewClient(new WebViewClient(){
            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                super.onPageStarted(view, url, favicon);
            }
        });
    }

    @Override
    public void onBackPressed() {
        if(w.canGoBack()&&w.isFocused())
        {
            w.goBack();
        }
        else{
            super.onBackPressed();
        }
    }
}
