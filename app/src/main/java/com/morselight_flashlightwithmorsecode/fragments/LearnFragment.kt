package com.morselight_flashlightwithmorsecode.app.fragments

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.morselight_flashlightwithmorsecode.app.R
import com.morselight_flashlightwithmorsecode.app.screens.MorseDetailActivity
import com.morselight_flashlightwithmorsecode.app.screens.MorseTutorialActivity
import com.morselight_flashlightwithmorsecode.app.utils.contactMail
import com.morselight_flashlightwithmorsecode.app.utils.launchWeb
import com.morselight_flashlightwithmorsecode.app.utils.rateApp
import com.morselight_flashlightwithmorsecode.app.utils.shareApp
import kotlinx.android.synthetic.main.fragment_learn.*


class LearnFragment : Fragment(R.layout.fragment_learn) {

    private var callback: FragmentCallbacks? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        learn_about.setOnClickListener {
            startActivity(Intent(requireContext(), MorseDetailActivity::class.java))
        }
        }
    }

