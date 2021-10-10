package ch.heigvd.iict.sym.labo1

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class Register : GenericActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
    }

    fun saveNewUser(view : View){
        val userEmail = findViewById<EditText>(R.id.register_email).text?.toString();
        if(!userEmail!!.contains('@')) {
            val errorMessage = "L'email n'est pas au bon format!"
            val duration = Toast.LENGTH_SHORT
            val toast = Toast.makeText(applicationContext, errorMessage, duration)
            toast.show()
            return
        }
        val userPassword = findViewById<EditText>(R.id.register_password).text?.toString();
        val intent = Intent(this, MainActivity::class.java).apply {
            putExtra("newEmail", userEmail);
            putExtra("newPassword", userPassword);
        };
        setResult(Activity.RESULT_OK, intent);
        finish()
    }
}

