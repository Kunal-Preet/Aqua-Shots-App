package kunal.example.aquashots

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ProgressBar
import android.widget.Toast
import java.lang.Integer.parseInt

class SettingsActivity : AppCompatActivity() {


    lateinit var weightET: EditText
    lateinit var workoutET: EditText
    lateinit var customET: EditText
    lateinit var updateBtn: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)
        weightET = findViewById(R.id.weightET)
        workoutET = findViewById(R.id.workoutET)
        customET = findViewById(R.id.customTargetET)
        updateBtn = findViewById(R.id.updateBtn)


    }

    fun onClickUpdate(view: View) {
        if (!TextUtils.isEmpty(customET.text.toString())){
           // MainUserScreen.totalIntake = parseInt(customET.text.toString())

        }
        else{
            MainUserScreen.totalIntake = (parseInt(weightET.text.toString())*100/3.0).toInt() + parseInt(workoutET.text.toString())/6*7

        }

    }
}