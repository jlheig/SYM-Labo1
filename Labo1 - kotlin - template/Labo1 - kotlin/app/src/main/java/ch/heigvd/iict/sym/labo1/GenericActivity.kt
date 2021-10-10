package ch.heigvd.iict.sym.labo1

import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

open class GenericActivity : AppCompatActivity()  {
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        Log.i(this::class.toString(), "Activity created");
    }

    override fun onStart() {
        super.onStart()
        Log.i(this::class.toString(), "Activity started");
    }

    override fun onResume() {
        super.onResume()
        Log.i(this::class.toString(), "Activity resumed");
    }

    override fun onPause() {
        super.onPause()
        Log.i(this::class.toString(), "Activity paused");
    }

    override fun onStop() {
        super.onStop()
        Log.i(this::class.toString(), "Activity stopped");
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(this::class.toString(), "Activity destroyed");
    }
}