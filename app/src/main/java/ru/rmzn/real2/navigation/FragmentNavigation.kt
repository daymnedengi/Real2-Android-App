package ru.rmzn.real2.navigation

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity

class FragmentNavigation (
    private val fragmentActivity: FragmentActivity,
    private val fragmentContainerId: Int
) {
    var currentFragment: Fragment? = null
        private set

    fun navigate(fragment: Fragment): Boolean {
        if (fragment == currentFragment) {
            return false
        }

        val transaction = fragmentActivity.supportFragmentManager.beginTransaction()

        fragmentActivity.supportFragmentManager.fragments.forEach { f ->
            f.takeIf { f.isAdded }?.let { transaction.hide(f) }
        }

        if (fragment.isAdded) {
            transaction.show(fragment)
        } else {
            transaction.add(fragmentContainerId, fragment)
        }

        transaction.commit()
        currentFragment = fragment

        return true
    }
}