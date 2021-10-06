package com.example.task10image

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.viewpager2.widget.ViewPager2
import me.relex.circleindicator.CircleIndicator3

class MainActivity : AppCompatActivity() {


    private var titlesList = mutableListOf<String>()
    private var descList = mutableListOf<String>()
    private var imagesList = mutableListOf<Int>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


postToList()
        view_pager2.adapter = ViewPagerAdapter (titlesList, descList, imagesList)

        val indicator :CircleIndicator3! = findViewById<CircleIndicator3>(R.id.indicator)
        with(indicator) {
            setViewPager(view_pager2)
        }


    }


    private fun addToList(title: String, description: String, image: Int) {
titlesList.add(title)
      descList.add(description)
 imagesList.add(image)

    }

    private fun postToList() {
        for (i in 1..5)
            addToList("Title $i,", "Description $i", R.mipmap.ic_launcher_round)


        }

    }    }

