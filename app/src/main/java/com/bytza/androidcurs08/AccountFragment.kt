package com.bytza.androidcurs08

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.bytza.androidcurs08.databinding.FragmentAccountBinding

class AccountFragment : Fragment() {
    private lateinit var binding: FragmentAccountBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAccountBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.accountSettingsBtn.setOnClickListener() {
            Navigation.findNavController(it).navigate(R.id.action_accountFragment_to_accountSettingsFragment)
        }

    }
}