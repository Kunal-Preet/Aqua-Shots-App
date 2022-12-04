package kunal.example.aquashots

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager

class BenefitsActivity : AppCompatActivity() {
    lateinit var viewPager: ViewPager
    lateinit var viewPagerAdapter: ViewPagerAdapter
    lateinit var imageList: List<Int>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_benefits)
        supportActionBar?.hide()
        viewPager = findViewById(R.id.idViewPager)


        imageList = ArrayList<Int>()
        imageList = imageList + R.drawable.benefit1
        imageList = imageList + R.drawable.benefit2
        imageList = imageList + R.drawable.benefit3
        imageList = imageList + R.drawable.benefit4
        imageList = imageList + R.drawable.benefit5
        imageList = imageList + R.drawable.benefit6
        imageList = imageList + R.drawable.benefit7
        imageList = imageList + R.drawable.benefit8
        imageList = imageList + R.drawable.benefit9

        viewPagerAdapter = ViewPagerAdapter(this, imageList)

        viewPager.adapter = viewPagerAdapter

    }
}