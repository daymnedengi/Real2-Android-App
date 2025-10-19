package ru.rmzn.real2.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import ru.rmzn.real2.StartActivity
import ru.rmzn.real2.databinding.FragmentInputPhoneNumberBinding

class InputPhoneNumberFragment : Fragment() {
    private lateinit var binding: FragmentInputPhoneNumberBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentInputPhoneNumberBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.submitButton.setOnClickListener {
            (activity as? StartActivity)?.apply {
                navigateToInputCodeFragment()
            }
        }
    }
}