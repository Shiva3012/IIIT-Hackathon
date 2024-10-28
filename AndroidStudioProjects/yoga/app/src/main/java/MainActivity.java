package com.example.yogainstructor;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Create a WebView programmatically
        webView = new WebView(this);
        setContentView(webView);

        // Enable JavaScript (if needed)
        webView.getSettings().setJavaScriptEnabled(true);

        // Set a WebViewClient to handle loading URLs
        webView.setWebViewClient(new WebViewClient());

        // Load a URL
        webView.loadUrl("https://www.example.com"); // Replace with your desired URL
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        // Clean up the WebView resources
        if (webView != null) {
            webView.destroy();
        }
    }
}
