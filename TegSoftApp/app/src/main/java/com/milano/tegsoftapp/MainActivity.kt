package com.milano.tegsoftapp

import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.navigation.NavigationBarView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Fragment References
        val firstF = FirstFragment()
        val secondF = SecondFragment()
        val thirdF = ThirdFragment()
        val fourthF = FourthFragment()
        val fifthF = FifthFragment()



        //Sets Initial View
        setCurrentFragment(firstF)

        //Bottom Navigation Bar
        val bottomNav: NavigationBarView = findViewById(R.id.bottomNavigationView)

        //Navigation Logic
        bottomNav.setOnItemSelectedListener {
            when (it.itemId) {

                R.id.miHome -> setCurrentFragment(FirstFragment())
                R.id.miTime -> setCurrentFragment(SecondFragment())
                R.id.miContact -> setCurrentFragment(ThirdFragment())
                R.id.miMessage -> setCurrentFragment(FourthFragment())
                R.id.miSetting -> setCurrentFragment(FifthFragment())
            }
            true
        }

    }

    //Function to Change Fragments
    private fun setCurrentFragment(frag: Fragment) =
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flFragment, frag)
            commit()
        }

}