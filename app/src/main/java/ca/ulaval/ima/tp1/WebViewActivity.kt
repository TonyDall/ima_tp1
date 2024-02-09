package ca.ulaval.ima.tp1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button

class WebViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view)

        title = "WebView"

        // Récupération de l'URL à charger depuis l'Intent
        val url = intent.getStringExtra("url")!!

        // Find the WebView by its unique ID
        val myWebView: WebView = findViewById(R.id.webView)

        // Charge http://www.google.ca dans le webview.
        myWebView.loadUrl(url)

        // Enable le javascript.
        myWebView.settings.javaScriptEnabled = true

        // WebViewClient allows you to handle
        // onPageFinished and override Url loading.
        myWebView.webViewClient = WebViewClient()

        //Gestion du bouton fermer
        val btnFermerClick = findViewById<Button>(R.id.btnFermer)
        btnFermerClick.setOnClickListener{
            finish()
        }
    }
}