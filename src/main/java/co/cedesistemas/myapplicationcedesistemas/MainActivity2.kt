package co.cedesistemas.myapplicationcedesistemas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val user = intent.extras?.getString("user")
        Toast.makeText(this, "$user", Toast.LENGTH_SHORT).show()
    }
}
