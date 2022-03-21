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

		// Find the button
		val rollButton: Button = findViewById(R.id.button);

		// Set the onClickListener for the Button
		rollButton.setOnClickListener { rollDice() }
	}

    /**
     * Roll the dice and update the screen with the result.
     */
	private fun rollDice() {
		// Create new Dice object with 6 sides and roll it
		val dice = Dice(6);
		val diceRoll = dice.roll()
		
		// Update the screen with the dice roll
		val resultTextView: TextView = findViewById(R.id.textView)
		resultTextView.text = diceRoll.toString()
	}
}

class Dice(val numSides: Int) {
	fun roll(): Int {
		return (1..numSides).random()
	}
}