package id.smartup.counterwithkotlin

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity() : Activity() {

    private lateinit var counter: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        counter = findViewById(R.id.counter)
    }

    fun increment(view: View) {
        counter.text = (counter.text.toString().toInt() + 1).toString()
    }

    fun decrement(view: View) {
        if (counter.text.toString().toInt() > 0) {
            counter.text = (counter.text.toString().toInt() - 1).toString()
        }
    }

    fun order(view: View) {
        val amount: TextView = findViewById(R.id.amount)
        amount.text = (counter.text.toString().toInt() * 15000).toString()
    }
}
