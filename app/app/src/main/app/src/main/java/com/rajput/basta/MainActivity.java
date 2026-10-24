package com.rajput.basta;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.view.View;
import android.graphics.Color;

public class MainActivity extends Activity {
  @Override public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    getWindow().setStatusBarColor(Color.rgb(7,94,84));
    WebView web = new WebView(this);
    web.setBackgroundColor(Color.rgb(243,246,245));
    WebSettings settings = web.getSettings();
    settings.setJavaScriptEnabled(true);
    settings.setDomStorageEnabled(true);
    settings.setAllowFileAccess(true);
    settings.setAllowContentAccess(true);
    web.setWebViewClient(new WebViewClient());
    web.loadUrl("file:///android_asset/index.html");
    setContentView(web);
  }
  @Override public void onBackPressed() {
    View v=findViewById(android.R.id.content);
    if(v instanceof WebView && ((WebView)v).canGoBack()) ((WebView)v).goBack(); else super.onBackPressed();
  }
}
