package kunal.example.aquashots

import android.content.Intent
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import java.lang.Integer.parseInt


class SettingsActivity : AppCompatActivity() {


    lateinit var weightET: EditText
    lateinit var workoutET: EditText
    lateinit var customET: EditText
    lateinit var updateBtn: Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        supportActionBar?.hide()

        setContentView(R.layout.activity_settings)
        weightET = findViewById(R.id.weightET)
        workoutET = findViewById(R.id.workoutET)
        customET = findViewById(R.id.customTargetET)
        updateBtn = findViewById(R.id.updateBtn)
    }



    fun onClickUpdate(view: View) {
        if (!TextUtils.isEmpty(customET.text.toString())){
            MainUserScreen.totalIntake = parseInt(customET.text.toString())  //User can set their own target here

            finish()
        }
        else{
            MainUserScreen.totalIntake = (parseInt(weightET.text.toString())*100/3.0).toInt() + parseInt(workoutET.text.toString())/6*7
            finish()
        }

    }

    fun onClickNotify(view: View) {
        val intent = Intent(this, NotificationSettingsActivity::class.java).apply {  }
        startActivity(intent)
    }
}