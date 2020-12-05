package com.c2r.navigationwithfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.c2r.navigationwithfragment.databinding.FragmentFinalBinding

class FinalFragment : Fragment(R.layout.fragment_final) {

    private lateinit var binding: FragmentFinalBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentFinalBinding.bind(view)

        binding.txtFragFin.setOnClickListener {
            findNavController().navigate(R.id.action_finalFragment_to_inicioFragment)
        }
    }
}
