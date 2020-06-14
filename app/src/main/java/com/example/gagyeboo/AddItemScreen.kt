package com.example.gagyeboo

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class AddItemScreen: AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.spend_fillout_screen)
        var yourEditPrice = findViewById<TextView>(R.id.newItemPrice)


        val currencyTextWatcher = object : TextWatcher {
            override fun afterTextChanged(editable: Editable?) {
                when {
                    editable.isNullOrEmpty() -> return
                    Regex("\\$\\d+").matches(editable.toString()) -> return
                    editable.toString() == "$" -> editable.clear()
                    editable.startsWith("$").not() -> editable.insert(0, "$")
                }
            }
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) = Unit
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) = Unit
        }
    }
    }


}