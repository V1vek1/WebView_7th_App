package com.example.webview7thapp

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi

//Isko "INTERNET" chaiye hoga kyuki Site Load lena h, issiliye mujhe "manifest" me jakar user permission
//dena hoga Internet Keliye, joki mai de rakha hu "Application" ke uper me

class MainActivity : AppCompatActivity() {

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Maine ek variable bnaya "webViewVariable" joki "webView" ki Id ki help se yha per uske
        // Design ko le rha h
        val webViewVariable= findViewById<WebView>(R.id.webView)

        webViewSetup(webViewVariable)   //yha maine "webviewVariable" ko Call kiya

    }

    @RequiresApi(Build.VERSION_CODES.O)

    private fun webViewSetup(a: WebView) {  //maine yha ek "method" bnaya joki Private h, Phir maine ek
                                            // Function(fun) "webViewSetUp" bnaya, phir maine jo
                                            //"parameter/Type" pass karna h uska name diya joki "a" h phir
                                            //usko Type diya joki "WebView" h

            //Yeh "WebView" ka Syntax h
            a.webViewClient= WebViewClient()

            a.apply {     //Yha mai "a" per kuch settings Apply kar rha hu

            settings.javaScriptEnabled= true     //Setting 1
            settings.safeBrowsingEnabled= true   //Setting 2

                loadUrl("https://spotrental.in/")  //Yha wo url dedo jisko Open karwana h

        }
    }
}