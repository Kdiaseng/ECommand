package com.aplicativo.ecommand.ui.fragment

import android.app.AlertDialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.aplicativo.ecommand.R
import kotlinx.android.synthetic.main.fragment_input_items.*

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
            val builder = AlertDialog.Builder(requireContext())
            val layoutInflater = requireActivity().layoutInflater
            val view = layoutInflater.inflate(R.layout.input_item_dialog, null)

            builder.setView(view)
            val dialog = builder.create()
            dialog.show()
        }
    }

}
