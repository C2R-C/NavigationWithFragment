package com.c2r.navigationwithfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.c2r.navigationwithfragment.databinding.FragmentInicioBinding

class InicioFragment : Fragment(R.layout.fragment_inicio) {

    private lateinit var binding: FragmentInicioBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentInicioBinding.bind(view)

        binding.txtFragIni.setOnClickListener {
            val bundle = bundleOf("nombre" to "Robinnsson")
            findNavController().navigate(R.id.action_inicioFragment_to_intermedioFragment, bundle)
        }
    }

}