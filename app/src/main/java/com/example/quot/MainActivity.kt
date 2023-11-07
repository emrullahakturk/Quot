package com.example.quot

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import com.example.quot.ui.viewModels.QuoteViewModel

class MainActivity : AppCompatActivity() {

    val viewModel :QuoteViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        handleTextFromAnotherApp(intent)
    }


fun handleTextFromAnotherApp(intent: Intent){
    intent.let {
        if(intent.action == Intent.ACTION_SEND
            && intent.type =="text/plain"){
            intent.getStringExtra(Intent.EXTRA_TEXT)?.let {
               viewModel.onIntentWithTextExtra(it)
            }
        }
    }
}

}