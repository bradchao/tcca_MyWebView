package tw.brad.android.games.mywebview;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView = (WebView)findViewById(R.id.webview);
        initWebView();
    }

    private void initWebView(){
        WebViewClient client = new WebViewClient();
        webView.setWebViewClient(client);

        WebSettings setting = webView.getSettings();
        setting.setJavaScriptEnabled(true);

        // 1.
        //webView.loadUrl("http://www.tcca.org.tw");
        // 2.
        webView.loadUrl("file:///android_asset/mymap.html");
    }

    public void test1(View view){
        webView.loadUrl("javascript:test2('Brad')");
    }
    public void test2(View view){
        webView.goBack();
    }
}
