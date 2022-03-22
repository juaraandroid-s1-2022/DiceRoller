package dev.witheredflowers.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)
		
		// Find the button
		val rollButton: Button = findViewById(R.id.button)
		
		// Set the onClickListener for the Button
		rollButton.setOnClickListener { rollDice() }
	}
	
	/**
	 * Roll the dice and update the screen with the result.
	 */
	private fun rollDice() {
		// Create new Dice object with 6 sides and roll it
		val dice = Dice(6)
		val diceRoll = dice.roll()
		
		// Update the screen with the dice roll
		// val resultTextView: TextView = findViewById(R.id.textView)
		// resultTextView.text = diceRoll.toString()
		
		// Update the screen with the image of dice roll number 2
		val diceImage: ImageView = findViewById(R.id.imageView)
		// diceImage.setImageResource(R.drawable.dice_2)
		
		// Adding logic
		val drawableResource = when (diceRoll) {
			1 -> R.drawable.dice_1
			2 -> R.drawable.dice_2
			3 -> R.drawable.dice_3
			4 -> R.drawable.dice_4
			5 -> R.drawable.dice_5
			// need to add else to use when
			else -> R.drawable.dice_6
		}
		
		// set the image resource
		diceImage.setImageResource(drawableResource)
		
		// set the content description
		diceImage.contentDescription = diceRoll.toString()
	}
}

class Dice(val numSides: Int) {
	fun roll(): Int {
		return (1..numSides).random()
	}
}