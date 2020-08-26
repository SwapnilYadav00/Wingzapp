package com.wingzapp.wingz;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import static android.view.View.GONE;

public class PdfViewer extends AppCompatActivity {
    WebView webView;
    private ProgressBar progressBar;
    String link=null;
    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf_viewer);

        Intent intent= getIntent();
        link= intent.getExtras().getString("id");

        webView = findViewById(R.id.WV);
        progressBar = findViewById(R.id.pb);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setLoadWithOverviewMode(true);
        webView.getSettings().setBuiltInZoomControls(true);
        webView.getSettings().setDisplayZoomControls(false);
        webView.setWebChromeClient(new WebChromeClient());
        webView.setWebViewClient(new WebViewClient() {

            @Override
            public void onPageFinished(WebView view, String url) {

                webView.loadUrl("javascript:(function() { " +
                        "document.querySelector('[role=\"toolbar\"]').remove();})()");
                progressBar.setVisibility(GONE);

            }


        });
        if(link != null) {
            try {
                loadpdf();
            }
            catch (Exception e){
                e.printStackTrace();
                Toast toast= Toast.makeText(getApplicationContext(),"Something went Wrong",Toast.LENGTH_SHORT);
                toast.show();
                super.onBackPressed();
            }
        }
        else{
            Toast toast= Toast.makeText(getApplicationContext(),"Not Available Yet!!",Toast.LENGTH_SHORT);
            toast.show();
            super.onBackPressed();
        }
    }

    private void loadpdf() {
        progressBar.setVisibility(View.VISIBLE);
        webView.setVisibility(View.VISIBLE);
        webView.loadUrl("https://drive.google.com/viewerng/viewer?embedded=true&url=https://drive.google.com/u/1/uc?id="+link+"&export=download");

    }
}