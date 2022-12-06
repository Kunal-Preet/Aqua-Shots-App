package kunal.example.aquashots

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
    lateinit var enterBtn: Button
    lateinit var benefitsBtn: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        enterBtn = findViewById(R.id.enterBtn)
        enterBtn.setOnClickListener(this)
        benefitsBtn = findViewById(R.id.benefitsBtn)
        benefitsBtn.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        when (view?.id) {
            R.id.enterBtn -> {
                val intent = Intent(this, MainUserScreen::class.java).apply {  }
                startActivity(intent)
            }
            R.id.benefitsBtn -> {
                val intent = Intent(this, BenefitsActivity::class.java).apply {  }
                startActivity(intent)
            }
        }
    }
}