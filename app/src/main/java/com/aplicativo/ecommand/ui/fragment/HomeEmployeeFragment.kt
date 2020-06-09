package com.aplicativo.ecommand.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.aplicativo.ecommand.R
import com.aplicativo.ecommand.databinding.FragmentHomeEmployeeBinding
import kotlinx.android.synthetic.main.fragment_home_employee.*

/**
 * A simple [Fragment] subclass.
 */
class HomeEmployeeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val viewBinding = FragmentHomeEmployeeBinding.inflate(inflater, container, false)
        viewBinding.listener = View.OnClickListener {
            when(it.id){
                R.id.cardView_add_item_menu -> addItem(it)
                R.id.cardView_pay_menu -> doPayment(it)
                R.id.cardView_increment_item_menu -> incrementItem(it)
                R.id.cardView_prorate_menu -> prorateItem(it)
            }
        }
        return viewBinding.root
    }

    private fun prorateItem(it: View?) {
        Toast.makeText(requireContext(), "RATEAR ITEM", Toast.LENGTH_SHORT).show()
    }

    private fun incrementItem(it: View?) {
        Toast.makeText(requireContext(), "INCREMENT ITEM", Toast.LENGTH_SHORT).show()
    }

    private fun doPayment(view: View) {
        view.findNavController()
            .navigate(R.id.action_homeEmployeeFragment_to_readerQrCodeFragment)
    }

    private fun addItem(view: View) {
        view.findNavController().navigate(R.id.action_homeEmployeeFragment_to_inputItemsFragment)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

}
