package ca.ulaval.ima.tp1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.graphics.Color

class UlavalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ulaval)

        title = "Ulaval"

        //Gestion du bouton fermer
        val btnFermerUlavalClick = findViewById<Button>(R.id.btnFermerUlaval)
        btnFermerUlavalClick.setBackgroundColor(Color.parseColor("#ED232A"))
        btnFermerUlavalClick.setOnClickListener{
            finish()
        }
    }
}