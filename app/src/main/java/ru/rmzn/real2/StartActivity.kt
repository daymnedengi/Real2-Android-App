package ru.rmzn.real2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ru.rmzn.real2.databinding.ActivityStartBinding
import ru.rmzn.real2.fragment.SplashFragment
import ru.rmzn.real2.navigation.FragmentNavigation

class StartActivity : AppCompatActivity() {
    private lateinit var binding: ActivityStartBinding

    private val fragmentNavigation by lazy { FragmentNavigation(this, R.id.fragmentContainerView) }
    private val splashFragment by lazy { SplashFragment() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityStartBinding.inflate(layoutInflater)
        setContentView(binding.root)

        navigateToSplashFragment()
    }

    fun navigateToSplashFragment() {
        fragmentNavigation.navigate(splashFragment)
    }
}