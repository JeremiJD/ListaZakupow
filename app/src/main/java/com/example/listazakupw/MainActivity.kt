package com.example.listazakupw

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // var Ziemniaki = (CheckBox) findViewById(R.id.Potato);
        findViewById<CheckBox>(R.id.Potato).setOnClickListener {
           if ( findViewById<CheckBox>(R.id.Potato).isChecked){
               findViewById<TextView>(R.id.List).text ="Zieminiaki \n"
           }
        }
        findViewById<CheckBox>(R.id.Milk).setOnClickListener {
            if ( findViewById<CheckBox>(R.id.Milk).isChecked){
                findViewById<TextView>(R.id.List).text ="Mleko \n"
            }
        }
        findViewById<CheckBox>(R.id.Choco).setOnClickListener {
            if ( findViewById<CheckBox>(R.id.Choco).isChecked){
                findViewById<TextView>(R.id.List).text ="Czekolada \n"
            }
        }
        findViewById<CheckBox>(R.id.Whisky).setOnClickListener {
            if ( findViewById<CheckBox>(R.id.Whisky).isChecked){
                findViewById<TextView>(R.id.List).text ="Ballantines \n"
            }
        }
        findViewById<CheckBox>(R.id.Icey).setOnClickListener {
            if ( findViewById<CheckBox>(R.id.Icey).isChecked){
                findViewById<TextView>(R.id.List).text ="Lód"
            }
        }
    }

}