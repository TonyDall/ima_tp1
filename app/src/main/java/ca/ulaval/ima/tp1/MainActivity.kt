package ca.ulaval.ima.tp1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import java.util.Calendar
import android.net.Uri
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : AppCompatActivity() {
    private lateinit var profil: Profil

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //URL à charger
        val urlToLoad = "https://www.google.ca"

        //Instance profil
        val dateNaissance = Calendar.getInstance()
        dateNaissance.set(2000, Calendar.JUNE, 7)
        val profil = Profil("Dallaire", "Anthony", dateNaissance, "111 288 945")

        //Bouton mon profil
        val btnProfilClick = findViewById<Button>(R.id.btnMonProfil)
        btnProfilClick.setOnClickListener {
            val intent = Intent(this, MonProfilActivity::class.java)
            intent.putExtra("profil", profil) //transfert de l'instance profile
            startActivity(intent)
        }

        //Bouton site web ext
        val btnExtClick = findViewById<Button>(R.id.btnExt)
        btnExtClick.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(urlToLoad))
            startActivity(intent)
        }

        //Bouton site web en web view
        val btnWvClick = findViewById<Button>(R.id.btnWv)
        btnWvClick.setOnClickListener {
            val intent = Intent(this, WebViewActivity::class.java)
            intent.putExtra("url", urlToLoad)
            startActivity(intent)
        }

        //Bouton Ulaval
        val btnUlavalClick = findViewById<Button>(R.id.btnUlaval)
        btnUlavalClick.setOnClickListener {
            val intent = Intent(this, UlavalActivity::class.java)
            startActivity(intent)
        }
    }
}