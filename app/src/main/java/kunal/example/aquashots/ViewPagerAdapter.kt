package kunal.example.aquashots

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RelativeLayout
import androidx.viewpager.widget.PagerAdapter
import java.util.*

class ViewPagerAdapter(val context: Context, val imageList: List<Int>) : PagerAdapter() {

    override fun getCount(): Int {
        return imageList.size
    }


    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view === `object` as RelativeLayout
    }


    override fun instantiateItem(container: ViewGroup, position: Int): Any {

        val mLayoutInflater =
            context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater


        val itemView: View = mLayoutInflater.inflate(R.layout.benefits_layout, container, false)


        val imageView: ImageView = itemView.findViewById<View>(R.id.idIVImage) as ImageView


        imageView.setImageResource(imageList.get(position))

        Objects.requireNonNull(container).addView(itemView)

        return itemView
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {

        container.removeView(`object` as RelativeLayout)
    }
}
