package com.c2r.navigationwithfragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.c2r.navigationwithfragment.databinding.FragmentIntermedioBinding

class IntermedioFragment : Fragment(R.layout.fragment_intermedio) {

    private lateinit var binding: FragmentIntermedioBinding
    private var nombre:String? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentIntermedioBinding.bind(view)

        arguments.let {
            nombre = it?.getString("nombre")
        }

        binding.txtDatoRecibido.text = nombre

        binding.txtFragInter.setOnClickListener {
            findNavController().navigate(R.id.action_intermedioFragment_to_finalFragment2)
        }

        binding.txtDatoRecibido.setOnClickListener {
            findNavController().navigate(R.id.action_intermedioFragment_to_inicioFragment)
        }
    }

}