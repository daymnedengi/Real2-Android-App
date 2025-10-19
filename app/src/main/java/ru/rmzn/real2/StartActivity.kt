package ru.rmzn.real2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import ru.rmzn.real2.databinding.ActivityStartBinding
import ru.rmzn.real2.fragment.InputCodeFragment
import ru.rmzn.real2.fragment.InputPhoneNumberFragment
import ru.rmzn.real2.fragment.SplashFragment
import ru.rmzn.real2.navigation.FragmentNavigation

class StartActivity : AppCompatActivity() {
    private lateinit var binding: ActivityStartBinding

    private val fragmentNavigation by lazy { FragmentNavigation(this, R.id.fragmentContainerView) }
    private val splashFragment by lazy { SplashFragment() }
    private val inputPhoneNumberFragment by lazy { InputPhoneNumberFragment() }
    private val inputCodeFragment by lazy { InputCodeFragment() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityStartBinding.inflate(layoutInflater)
        setContentView(binding.root)

        navigateToSplashFragment()

        lifecycleScope.launch(Dispatchers.Main) {
            delay(3000)
            if (!isDestroyed) {
                navigateToInputPhoneNumberFragment()
            }
        }
    }

    fun navigateToSplashFragment() {
        fragmentNavigation.navigate(splashFragment)
    }

    fun navigateToInputPhoneNumberFragment() {
        fragmentNavigation.navigate(inputPhoneNumberFragment)
    }

    fun navigateToInputCodeFragment() {
        fragmentNavigation.navigate(inputCodeFragment)
    }
}