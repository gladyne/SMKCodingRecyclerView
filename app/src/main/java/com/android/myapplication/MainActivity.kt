package com.android.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_toast.setOnClickListener{
            Log.i("Main Acticity", "Button has clicked")
            Toast.makeText(this,"button has clicked",Toast.LENGTH_SHORT).show()
        }

        button2.setOnClickListener{
            var message = user_input.text.toString()
            Log.i("Main Acticity","Button2 has click and you get a data")
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("input_from_user",message)
            Toast.makeText(this,message, Toast.LENGTH_SHORT).show()
            startActivity(intent)
        }

        to_recyclerview.setOnClickListener{
            val intent = Intent(this,HobbiesActivity::class.java)
            startActivity(intent)
        }

    }

}
