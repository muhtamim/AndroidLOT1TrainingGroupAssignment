package com.example.muhtamimnahid.androidlot_1traininggroup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class Facebook_Group extends AppCompatActivity {
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facebook__group);

        webView = (WebView) findViewById(R.id.webview);
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webView.loadUrl("https://web.facebook.com/groups/247436752504923/?multi_permalinks=259198224662109&notif_id=1531150900939121&notif_t=group_activity&ref=notif");
    }
}
