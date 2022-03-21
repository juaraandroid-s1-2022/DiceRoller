package dev.witheredflowers.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//      Find the button
        val rollButton: Button = findViewById(R.id.button);

//      Set the onClickListener for the Button
        rollButton.setOnClickListener {
//      Create the toast and show it
//          Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT).show()
            val resultTextView: TextView = findViewById(R.id.textView)
            resultTextView.text = "6"
        }
    }
}