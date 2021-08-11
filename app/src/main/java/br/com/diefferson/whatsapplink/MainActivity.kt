package br.com.diefferson.whatsapplink

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val text = intent
            .getCharSequenceExtra(Intent.EXTRA_PROCESS_TEXT)
        // process the text
        val readonly = intent
            .getBooleanExtra(Intent.EXTRA_PROCESS_TEXT_READONLY, false)

        val uri = Uri.parse("http://api.whatsapp.com/send?phone=+55$text")
        startActivity(Intent(Intent.ACTION_VIEW).setData(uri))
        finish()
    }
}
