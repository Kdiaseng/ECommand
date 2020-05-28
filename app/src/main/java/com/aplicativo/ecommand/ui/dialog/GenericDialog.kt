package com.aplicativo.ecommand.ui.dialog

import android.app.AlertDialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import com.aplicativo.ecommand.R

object GenericDialog {

    fun showDialog(context: Context): AlertDialog?{
        return   AlertDialog.Builder(context).create().apply {
            setView(layoutInflater.inflate(R.layout.input_item_dialog, null))
            window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            show()
        }
    }

}