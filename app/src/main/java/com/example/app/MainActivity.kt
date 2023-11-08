package com.example.app

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var myButton: Button
    private lateinit var TextView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myButton=findViewById(R.id.myButton)
        TextView=findViewById(R.id.textView)

        myButton.text=getString(R.string.button_text)
    }
    fun showMEssage(view:View){
        TextView.visibility= View.VISIBLE
        TextView.text="Hello Keshav"
    }
}