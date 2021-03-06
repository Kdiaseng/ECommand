package com.aplicativo.ecommand.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.aplicativo.ecommand.R
import kotlinx.android.synthetic.main.fragment_reader_qr_code.*

/**
 * A simple [Fragment] subclass.
 */
class ReaderQrCodeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_reader_qr_code, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        buttonListar.setOnClickListener {
            it.findNavController().navigate(R.id.action_readerQrCodeFragment_to_listItemsFragment)
        }
    }

}
