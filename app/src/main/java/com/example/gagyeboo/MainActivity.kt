package com.example.gagyeboo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_insert.*
import kotlinx.android.synthetic.main.activity_main.*
import org.w3c.dom.Text
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {

    val INSERT_REQUEST_CODE = 100
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainInsertView.setOnClickListener{
            val intent: Intent = Intent(this, Insert::class.java)
            startActivityForResult(intent, INSERT_REQUEST_CODE)
        }


    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        when(resultCode){
            Code.INSERT_TO_MAIN_CODE -> update()
        }
        super.onActivityResult(requestCode, resultCode, data)

    }

    fun update(){

    }
}
