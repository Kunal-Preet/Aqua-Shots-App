package kunal.example.aquashots

import android.app.TimePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ProgressBar
import android.widget.Toast
import java.lang.Integer.parseInt
import java.util.*

class SettingsActivity : AppCompatActivity() {


    lateinit var weightET: EditText
    lateinit var workoutET: EditText
    lateinit var customET: EditText
    lateinit var updateBtn: Button
    lateinit var wakeTimeBtn: Button
    lateinit var sleepTimeBtn: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_settings)
        weightET = findViewById(R.id.weightET)
        workoutET = findViewById(R.id.workoutET)
        customET = findViewById(R.id.customTargetET)
        updateBtn = findViewById(R.id.updateBtn)
        wakeTimeBtn = findViewById(R.id.wakeTimeBtn)
        sleepTimeBtn = findViewById(R.id.sleepTimeBtn)


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

    fun onClickWakeUp(view: View) {
        val c = Calendar.getInstance()
        val hour = c.get(Calendar.HOUR_OF_DAY)
        val minute = c.get(Calendar.MINUTE)

        val timePickerDialog = TimePickerDialog(
            this,
            { view, hourOfDay, minute ->
                wakeTimeBtn.text = "Wake Time : \n$hourOfDay:$minute"
            },
            hour,
            minute,
            false
        )
        timePickerDialog.show()

    }
    fun onClickSleep(view: View) {
        val c = Calendar.getInstance()
        val hour = c.get(Calendar.HOUR_OF_DAY)
        val minute = c.get(Calendar.MINUTE)

        val timePickerDialog = TimePickerDialog(
            this,
            { view, hourOfDay, minute ->
                sleepTimeBtn.text = "Sleep Time :\n$hourOfDay:$minute"
            },
            hour,
            minute,
            false
        )
        timePickerDialog.show()

    }


}