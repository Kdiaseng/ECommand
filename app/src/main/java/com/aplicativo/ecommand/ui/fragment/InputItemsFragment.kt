package com.aplicativo.ecommand.ui.fragment

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.aplicativo.ecommand.R
import com.aplicativo.ecommand.databinding.FragmentInputItemsBinding
import com.aplicativo.ecommand.model.Item
import com.aplicativo.ecommand.ui.dialog.GenericDialog
import com.aplicativo.ecommand.ui.recyclerview.adapter.ListItemsOrderAdapter
import kotlinx.android.synthetic.main.fragment_input_items.*
import kotlinx.android.synthetic.main.input_item_dialog.*
import org.koin.android.ext.android.inject

/**
 * A simple [Fragment] subclass.
 * Use the [InputItemsFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class InputItemsFragment : Fragment() {

   var items = ArrayList<Item>()
  private lateinit var viewBinding: FragmentInputItemsBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        Log.e("size", items.size.toString())
        viewBinding = FragmentInputItemsBinding.inflate(inflater, container, false)
        viewBinding.listener = View.OnClickListener {
            when (it.id) {
                R.id.floatingActionButtonAddItem -> openDialog(requireContext())
                R.id.outlinedButton_generate_code -> generateQRCode()
            }
        }
        viewBinding.items = items
        viewBinding.buttonClicked = false
        return viewBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loadRecyclerView()
    }

    private fun loadRecyclerView() {
        if (items.isNotEmpty()) {
            recyclerView_orders_input.adapter = ListItemsOrderAdapter(items)
            val layoutManager = StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.VERTICAL)
            recyclerView_orders_input.layoutManager = layoutManager
        }
    }


    private fun generateQRCode() {
        viewBinding.buttonClicked = true
    }

    private fun openDialog(context: Context) {
       val dialog = GenericDialog.showDialog(context)
        dialog?.outlinedButton_cancel?.setOnClickListener {
            dialog.dismiss()
        }

        dialog?.outlinedButton_save?.setOnClickListener {
            val item = Item(
                dialog.textInput_description.text.toString(),
                dialog.textInput_value.text.toString().toDouble(),
                dialog.textView_dialog_input_quantity.text.toString().toInt()
            )

            items.add(item)
            loadRecyclerView()
            viewBinding.items = items
        }
    }

}
