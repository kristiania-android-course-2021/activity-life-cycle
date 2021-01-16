package no.shortcut.activity_life_cycle

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(this.javaClass.simpleName, "onCreate")

        var button = findViewById<Button>(R.id.btn_open_second)

        button.setOnClickListener {
            Intent(this, SecondActivity::class.java).apply {
                startActivity(this)
            }
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(this.javaClass.simpleName, "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(this.javaClass.simpleName, "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(this.javaClass.simpleName, "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(this.javaClass.simpleName, "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(this.javaClass.simpleName, "onDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(this.javaClass.simpleName, "onRestart")
    }
}
