package ca.ulaval.ima.tp1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import java.text.SimpleDateFormat
import java.util.*

class MonProfilActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.monprofil)

        title = "Profil"

        val profil = intent.getParcelableExtra<Profil>("profil")

        //val dateFormat = SimpleDateFormat("dd/MM/yyyy", Locale.getDefault())
        //val formattedDate = dateFormat.format(profil?.dateNaissance?.time)

        val calendar = profil?.dateNaissance
        val formattedDate = if (calendar != null) {
            val dateOfBirth = calendar.time
            val dateFormat = SimpleDateFormat("dd/MM/yyyy", Locale.getDefault())
            dateFormat.format(dateOfBirth)
        } else {
            "Unknown Date"
        }


        // Affichage des éléments dans l'interface utilisateur
        val tvPrenom = findViewById<TextView>(R.id.tvPrenom)
        tvPrenom.text = "Prénom : ${profil?.prenom}"

        val tvNom = findViewById<TextView>(R.id.tvNom)
        tvNom.text = "Nom : ${profil?.nom}"

        val tvDateNaissance = findViewById<TextView>(R.id.tvDateNaissance)
        tvDateNaissance.text = "Date de naissance : ${formattedDate}"

        val tvIdul = findViewById<TextView>(R.id.tvIdul)
        tvIdul.text = "IDUL : ${profil?.idul}"

    }
}