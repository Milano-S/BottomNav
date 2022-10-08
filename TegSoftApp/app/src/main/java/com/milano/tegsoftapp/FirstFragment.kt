package com.milano.tegsoftapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.TextView
import androidx.fragment.app.Fragment

class FirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_first, container, false)

        //Buttons
        val backspace = view.findViewById<ImageButton>(R.id.btnBack)

        backspace.setOnClickListener {
            val tv = view.findViewById<TextView>(R.id.tvNumbers)
            if (tv.length() > 0) {
                tv.text = tv.text.subSequence(0, tv.length() - 1)
            }
        }

        return view
    }

    /*private fun backSpace() {
        val tv = view.findViewById<TextView>(R.id.tvNumbers)
        if (tv.length() > 0) {
            tv.text = tv.text.subSequence(0, tv.length() - 1)
        }
    }
    private fun numberAction(btnId: Button) {
        val tv = findViewById<TextView>(R.id.tvNumbers)
        tv.text.subSequence(0, btnId.text.length)
    }*/
}