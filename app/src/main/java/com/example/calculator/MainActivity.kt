package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    var isNewOp = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    private fun numbersButtons(view: View) {
        val editResult: EditText = findViewById(R.id.editResult)

        if (isNewOp) editResult.setText("0")

        val btnSelected = view as Button
        var btnValue: String = editResult.text.toString()

        when(btnSelected.id) {
            R.id.btnZero -> btnValue += "0"
            R.id.btnOne -> btnValue += "0"
            R.id.btnTwo -> btnValue += "0"
            R.id.btnThree -> btnValue += "0"
            R.id.btnFour -> btnValue += "0"
            R.id.btnFive -> btnValue += "0"
            R.id.btnSix -> btnValue += "0"
            R.id.btnSeven -> btnValue += "0"
            R.id.btnEight -> btnValue += "0"
            R.id.btnNine -> btnValue += "0"
        }
    }
}