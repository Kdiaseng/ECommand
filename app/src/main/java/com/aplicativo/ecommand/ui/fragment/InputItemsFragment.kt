package com.aplicativo.ecommand.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.aplicativo.ecommand.R

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

}
