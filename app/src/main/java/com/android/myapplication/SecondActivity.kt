package com.android.myapplication

import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.second_activity.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_activity)

        val bundle = intent.extras
        val msg = bundle!!.getString("input_from_user")
        Log.i("Main Acticity","Button2 has click and you get a data 2")

        Toast.makeText(this,msg, Toast.LENGTH_SHORT).show()

        get_input.text = msg
    }
}