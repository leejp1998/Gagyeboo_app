package com.example.gagyeboo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_insert.*
import java.text.SimpleDateFormat
import java.util.*

class Insert : AppCompatActivity() {

    //val BACK_TO_MAIN_CODE = 123
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_insert)

        val today = Calendar.getInstance().time
        val formatter = SimpleDateFormat("MM.dd.yyyy")
        val date = formatter.format(today)
        val autoInsertStartDateTextView = findViewById<TextView>(R.id.autoInsertStartDateTextView)
        autoInsertStartDateTextView.text = date

        InsertSaveTextView.setOnClickListener{
            setResult(Code.INSERT_TO_MAIN_CODE)
            update()
            finish()
        }
    }

    fun update(){

        if(autoInsertOutRadioButton.isSelected){

        } else if (autoInsertInRadioButton.isSelected){

        } else {

        }
    }
}