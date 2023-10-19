package xyz.anubhav.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val tvNormal = findViewById<TextView>(R.id.textView)
        val tvCounter = findViewById<TextView>(R.id.counter)
        val btnMinus = findViewById<Button>(R.id.minus)
        val btnPlus = findViewById<Button>(R.id.plus)
        tvNormal.text = "People Counter App"
        tvCounter.text = "0"
        btnMinus.text = "-"
        btnPlus.text = "+"
        var num = 0
        btnPlus.setOnClickListener {
            num++
            tvCounter.text = num.toString()
        }
        btnMinus.setOnClickListener {
            num--
            tvCounter.text = num.toString()
        }







//        val buttonClickMe = findViewById<Button>(R.id.counter_button)
//        val maintext = findViewById<TextView>(R.id.textView)
//        buttonClickMe.text = "Click"
//        var times = 0
//        maintext.text = times.toString()
//        buttonClickMe.setOnClickListener {
//            buttonClickMe.text = "Click Fasterrr!"
//            times++
//            maintext.text = times.toString()
//            Toast.makeText(this, "Joe mama",Toast.LENGTH_SHORT).show()
//        }
    }
}