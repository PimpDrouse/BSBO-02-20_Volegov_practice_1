package ru.mirea.volegovaa.buttonclicker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val text: TextView = findViewById<TextView>(R.id.tvOut)
        val checkBox: CheckBox = findViewById(R.id.checkBox)
        val btnWho: Button = findViewById(R.id.btnWhoAmI)
        val btnIt: Button = findViewById(R.id.btnItIsNotMe)
        btnWho.setOnClickListener { text.setText("Мой номер по списку 3 (по журналу)"); checkBox.isChecked = true;}
        btnIt.setOnClickListener {  text.setText("Это не я сделал"); checkBox.isChecked = true; }
    }

    fun onClick(savedInstanceState: Bundle?){

    }
}