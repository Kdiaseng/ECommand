package com.aplicativo.ecommand.ui.fragment

import android.app.AlertDialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.aplicativo.ecommand.R
import kotlinx.android.synthetic.main.fragment_input_items.*
import kotlinx.android.synthetic.main.input_item_dialog.*

/**
 * A simple [Fragment] subclass.
 * Use the [InputItemsFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class InputItemsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_input_items, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        floatingActionButtonAddItem.setOnClickListener {

            val dialog = AlertDialog.Builder(requireContext()).create().apply {
                setView(layoutInflater.inflate(R.layout.input_item_dialog, null))
                window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
                show()
            }
            val btn = dialog.outlinedButton_save

            btn.setOnClickListener {
                Toast.makeText(requireContext(), "teste", Toast.LENGTH_SHORT).show()
            }

        }
    }

}
