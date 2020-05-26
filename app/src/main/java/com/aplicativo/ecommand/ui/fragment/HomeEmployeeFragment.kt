package com.aplicativo.ecommand.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.aplicativo.ecommand.R
import kotlinx.android.synthetic.main.fragment_home_employee.*

/**
 * A simple [Fragment] subclass.
 */
class HomeEmployeeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home_employee, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        cardView_add_item_menu.setOnClickListener {
            it.findNavController().navigate(R.id.action_homeEmployeeFragment_to_inputItemsFragment)
        }

        cardView_pay_menu.setOnClickListener {
            it.findNavController().navigate(R.id.action_homeEmployeeFragment_to_readerQrCodeFragment)
        }
    }

}
