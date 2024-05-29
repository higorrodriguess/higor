package com.exemplo.validadordesistemas;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.webkit.WebView;

public class ViewPopActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pop);

        WebView webView = findViewById(R.id.webview);
        webView.loadUrl("file:///android_asset/seu_template.html");
    }
}
