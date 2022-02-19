package com.example.uipractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*How to access components*/
        /* create a final variable using val*/
        /*access the components with id myButton & textView*/
        val addBtn = findViewById<Button>(R.id.addButton)
        val mainText = findViewById<TextView>(R.id.textView)
        val subBtn = findViewById<Button>(R.id.subtractButton)
        val resetBtn = findViewById<Button>(R.id.resetButton)

        /*create general variable using var*/
        /*button clicked counter*/
        var timesClicked = 0

        /*Adding actions to Buttons when pressed */
        /*use onClickListener{} - now button is waiting to be clicked*/
        /*write actions/code in {}*/

        /*Add to counter*/
        addBtn.setOnClickListener{
            /*everytime addButton is clicked add 1*/
            timesClicked += 1
            /*show timesClicked in textView*/
            /*timesClicked is an int - use .toString() to convert to string*/
            /*now timesClicked will be seen as a text*/
            mainText.text = timesClicked.toString()
            /*Create a Toast - creates a message for user when component is interacted by user*/
            /*text the user will see*/
            val text = "Gotcha!"
            /*how long will message display on user screen*/
            val duration = Toast.LENGTH_SHORT
            /*using the Toast & makeText to display message - must add .show() to display*/
            Toast.makeText(this, text, duration).show()


        }
        /*Subtract from counter*/
        subBtn.setOnClickListener{
            /*everytime subButton is clicked subtract 1*/
            timesClicked -= 1
            /*show timesClicked in textView*/
            /*timesClicked is an int - use .toString() to convert to string*/
            /*now timesClicked will be seen as a text*/
            mainText.text = timesClicked.toString()
            /*Create a Toast - creates a message for user when component is interacted by user*/
            /*text the user will see*/
            val text = "Oops!"
            /*how long will message display on user screen*/
            val duration = Toast.LENGTH_SHORT
            /*using the Toast & makeText to display message - must add .show() to display*/
            Toast.makeText(this, text, duration).show()
        }
        /*Reset Counter*/
        resetBtn.setOnClickListener {
            /*everytime subButton is clicked subtract 1*/
            timesClicked = 0
            /*show timesClicked in textView*/
            /*timesClicked is an int - use .toString() to convert to string*/
            /*now timesClicked will be seen as a text*/
            mainText.text = timesClicked.toString()
            /*Create a Toast - creates a message for user when component is interacted by user*/
            /*text the user will see*/
            val text = "Starting Over!"
            /*how long will message display on user screen*/
            val duration = Toast.LENGTH_SHORT
            /*using the Toast & makeText to display message - must add .show() to display*/
            Toast.makeText(this, text, duration).show()
        }

    }

}