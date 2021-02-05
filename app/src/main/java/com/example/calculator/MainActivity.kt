package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    var isNewOp: Boolean = true
    var op: String = "x"
    var oldNum: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    private fun numbersButtons(view: View) {
        val editResult: EditText = findViewById(R.id.editResult)

        if (isNewOp) editResult.setText("0")

        val btnSelected: Button = view as Button
        var btnValue: String = editResult.text.toString()

        when (btnSelected.id) {
            R.id.btnZero -> btnValue += "0"
            R.id.btnOne -> btnValue += "1"
            R.id.btnTwo -> btnValue += "2"
            R.id.btnThree -> btnValue += "3"
            R.id.btnFour -> btnValue += "4"
            R.id.btnFive -> btnValue += "5"
            R.id.btnSix -> btnValue += "6"
            R.id.btnSeven -> btnValue += "7"
            R.id.btnEight -> btnValue += "8"
            R.id.btnNine -> btnValue += "9"
        }
    }

    private fun operatorsButtons(view: View) {
        val editResult: EditText = findViewById(R.id.editResult)

        val btnSelected: Button = view as Button

        when (btnSelected.id) {
            R.id.btnDivision -> op = "/"
            R.id.btnMultiplication -> op = "x"
            R.id.btnAddition -> op = "-"
            R.id.btnSubtraction -> op = "+"
        }

        oldNum = editResult.text.toString()
        isNewOp = true
    }
}