package com.example.bottomsheetexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.bottomsheet.BottomSheetDialog

class MainActivity : AppCompatActivity() {
    lateinit var btnShowBottomSheet : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnShowBottomSheet = findViewById(R.id.btnShowBottomSheet)

        btnShowBottomSheet.setOnClickListener {

            val dialog = BottomSheetDialog(this)

            val view = layoutInflater.inflate(R.layout.bottom_sheet_dialog,null)

            val btnClose = view.findViewById<Button>(R.id.btnDismiss)

            btnClose.setOnClickListener {
                dialog.dismiss()
            }
            //ekranda boş bir alana tıklandığında dialog penceresinin kapanmasını engellemek için kullanılır.
            //closing of dialog box when clicking on the screen.
            dialog.setCancelable(false)

            dialog.setContentView(view)

            dialog.show()


        }

    }


}