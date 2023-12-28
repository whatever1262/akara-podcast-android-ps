package com.example.akarapodcast.view.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.akarapodcast.adapter.PodcastsAdapter
import com.example.akarapodcast.databinding.FragmentTrendingBinding
import com.example.akarapodcast.model.api.model.Status
import com.example.akarapodcast.viewmodel.PodcastsViewModel

class TrendingFragment : Fragment() {
    private lateinit var binding: FragmentTrendingBinding

    // try to...
    private val viewModel = PodcastsViewModel()
    private val adapter = PodcastsAdapter()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentTrendingBinding.inflate(inflater, container, false)

        return binding.root
    }





    }





