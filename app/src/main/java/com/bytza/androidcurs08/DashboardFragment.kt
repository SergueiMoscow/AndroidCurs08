package com.bytza.androidcurs08

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.bytza.androidcurs08.databinding.FragmentDashboardBinding

class DashboardFragment : Fragment() {
    private lateinit var binding: FragmentDashboardBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentDashboardBinding.inflate(layoutInflater)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.accountBtn.setOnClickListener() {
            Navigation.findNavController(it).navigate(R.id.action_dashboardFragment_to_account_graph)
        }
        binding.listBtn.setOnClickListener() {
            Navigation.findNavController(it).navigate(R.id.action_dashboardFragment_to_listFragment)
        }
        binding.settingsBtn.setOnClickListener() {
            Navigation.findNavController(it).navigate(R.id.action_dashboardFragment_to_settingsFragment)
        }
    }

}