package com.aplicativo.ecommand.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.aplicativo.ecommand.R
import kotlinx.android.synthetic.main.fragment_home_client.*

/**
 * A simple [Fragment] subclass.
 */
class HomeClientFragment : Fragment() {

    var isExpand = false

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home_client, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        button_expand.setOnClickListener {
            isExpand = !isExpand
            val resource  = if (isExpand) {
                recyclerView_last_orders.visibility = View.VISIBLE
                R.drawable.ic_expand_less
            } else {
                recyclerView_last_orders.visibility = View.GONE
                R.drawable.ic_expand_more
            }
            button_expand.setBackgroundResource(resource)
        }
    }

}
