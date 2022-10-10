package kunal.example.aquashots

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

class MainUserScreen : AppCompatActivity(), View.OnClickListener {

    lateinit var settingsImgView: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_user_screen)

        settingsImgView = findViewById(R.id.settingImgView)
        settingsImgView.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        when (view?.id) {
            R.id.settingImgView -> {
                val intent = Intent(this, SettingsActivity::class.java).apply {  }
                startActivity(intent)
            }
        }
    }
}