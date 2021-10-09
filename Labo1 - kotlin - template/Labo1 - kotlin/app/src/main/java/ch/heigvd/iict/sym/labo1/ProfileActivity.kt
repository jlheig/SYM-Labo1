package ch.heigvd.iict.sym.labo1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.widget.TextView
import android.widget.ImageView
import ch.heigvd.iict.sym.labo1.network.ImageDownloader

class ProfileActivity : AppCompatActivity() {

    private lateinit var tvEmail:TextView
    private lateinit var ivProfilePic:ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        tvEmail = findViewById(R.id.profile_tvEmail);
        ivProfilePic = findViewById(R.id.profile_ivProfilePic);

        // Get the Intent that started this activity and extract the email
        val email = intent.getStringExtra(EXTRA_MESSAGE)

        // Capture the layout's TextView and set the email as its text
        tvEmail.text = email

        //Profile picture
        ImageDownloader(ivProfilePic, "https:thispersondoesnotexist.com/image").show()
    }
}