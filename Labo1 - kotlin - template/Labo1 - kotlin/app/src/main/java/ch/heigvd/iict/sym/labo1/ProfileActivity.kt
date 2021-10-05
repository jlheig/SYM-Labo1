package ch.heigvd.iict.sym.labo1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.widget.TextView
import android.widget.ImageView
import ch.heigvd.iict.sym.labo1.network.ImageDownloader

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        // Get the Intent that started this activity and extract the email
        val email = intent.getStringExtra(EXTRA_MESSAGE)

        // Capture the layout's TextView and set the email as its text
        val textView = findViewById<TextView>(R.id.emailTxt).apply {
            text = email
        }

        //Profile picture
        val profileImage = findViewById<ImageView>(R.id.profileImage)
        ImageDownloader(profileImage, "https:thispersondoesnotexist.com/imaage").show()
    }
}