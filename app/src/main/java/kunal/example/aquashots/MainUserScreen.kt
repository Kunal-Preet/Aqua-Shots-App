package kunal.example.aquashots

import android.annotation.SuppressLint
import android.content.DialogInterface
import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.InputType
import android.util.Log
import android.view.View
import android.widget.*
import androidx.appcompat.app.AlertDialog
import androidx.core.view.isVisible
import java.lang.Integer.parseInt

class MainUserScreen : AppCompatActivity(), View.OnClickListener {

    companion object{
        var totalIntake: Int = 0
        var progressBarProgress = 0
    }
    lateinit var settingsImgView: ImageView
    lateinit var totalTV: TextView
    lateinit var intakeTV: TextView
    lateinit var progressBar: ProgressBar
    lateinit var iv50: ImageView
    lateinit var iv100: ImageView
    lateinit var iv150: ImageView
    lateinit var iv300: ImageView
    lateinit var iv500: ImageView
    lateinit var ivCustom: ImageView
    lateinit var minusBtn: Button
    var inputVal: Int = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_user_screen)
        supportActionBar?.hide()

        settingsImgView = findViewById(R.id.settingImgView)
        settingsImgView.setOnClickListener(this)
        totalTV = findViewById(R.id.totalTV)
        intakeTV = findViewById(R.id.intakeTV)
        iv50 = findViewById(R.id.iV50)
        iv50.setOnClickListener(this)
        iv100 = findViewById(R.id.iV100)
        iv100.setOnClickListener(this)
        iv150 = findViewById(R.id.iV150)
        iv150.setOnClickListener(this)
        iv300 = findViewById(R.id.iV300)
        iv300.setOnClickListener(this)
        iv500 = findViewById(R.id.iV500)
        iv500.setOnClickListener(this)
        ivCustom = findViewById(R.id.iVcustom)
        ivCustom.setOnClickListener(this)
        minusBtn = findViewById(R.id.minusBtn)
        minusBtn.setOnClickListener(this)
        progressBar = findViewById(R.id.progressBar)
        progressBar.isVisible = true
        progressBar.progress = 0
        progressBar.max = 1000
    }

    override fun onResume() {
        super.onResume()
        if(totalIntake!=0){
            totalTV.text= totalIntake.toString()
            progressBar.max = parseInt(totalTV.text.toString())


        }
        else{



        }
    }

    @SuppressLint("SetTextI18n")
    override fun onClick(view: View?) {
        when (view?.id) {
            R.id.settingImgView -> {
                val intent = Intent(this, SettingsActivity::class.java).apply {  }
                startActivity(intent)
            }
            R.id.iV50 -> {
                iv50.animate().apply {
                    duration = 1500
                    rotationYBy(360f)
                }.withEndAction {

                }.start()
                intakeTV.text = (parseInt(intakeTV.text.toString()) + 50).toString()
                progressBar.progress += 50
            }
            R.id.iV100 -> {
                iv100.animate().apply {
                    duration = 1000
                    rotationYBy(360f)
                }.withEndAction {

                }.start()
                intakeTV.text = (parseInt(intakeTV.text.toString()) + 100).toString()
                progressBar.progress += 100
            }
            R.id.iV150 -> {
                iv150.animate().apply {
                    duration = 1000
                    rotationYBy(360f)
                }.withEndAction {

                }.start()
                intakeTV.text = (parseInt(intakeTV.text.toString()) + 150).toString()
                progressBar.progress += 150
            }
            R.id.iV300 -> {
                iv300.animate().apply {
                    duration = 1000
                    rotationYBy(360f)
                }.withEndAction {

                }.start()
                intakeTV.text = (parseInt(intakeTV.text.toString()) + 300).toString()
                progressBar.progress += 300
            }
            R.id.iV500 -> {
                iv500.animate().apply {
                    duration = 1000
                    rotationYBy(360f)
                }.withEndAction {

                }.start()
                intakeTV.text = (parseInt(intakeTV.text.toString()) + 500).toString()
                progressBar.progress += 500
            }
            R.id.iVcustom ->{
                ivCustom.animate().apply {
                    duration = 1000
                    rotationYBy(360f)
                }.withEndAction {

                }.start()
                val input = EditText(this)
                val builder: AlertDialog.Builder = AlertDialog.Builder(this)
                builder.setTitle("Custom Intake : ")
                input.hint = "Enter amount in ml"
                input.inputType = InputType.TYPE_CLASS_NUMBER
                builder.setView(input)
                builder.setPositiveButton("OK") { _, _ ->
                    input.text.toString()
                    inputVal = parseInt(input.text.toString())
                    intakeTV.text = (parseInt(intakeTV.text.toString()) + inputVal).toString()
                    progressBar.progress += inputVal
                }
                builder.setNegativeButton("CANCEL") { dialog, _ -> dialog.cancel() }
                builder.show()



            }
            R.id.minusBtn -> {
                val minusInput = EditText(this)
                val builder: AlertDialog.Builder = AlertDialog.Builder(this)
                builder.setTitle("Minus Intake : ")
                minusInput.hint = "Enter amount in ml you want to subtract"
                minusInput.inputType = InputType.TYPE_CLASS_NUMBER
                builder.setView(minusInput)
                builder.setPositiveButton("OK") { _, _ ->
                    minusInput.text.toString()
                    inputVal = parseInt(minusInput.text.toString())
                    intakeTV.text = (parseInt(intakeTV.text.toString()) - inputVal).toString()
                    progressBar.progress -= inputVal
                }
                builder.setNegativeButton("CANCEL") { dialog, _ -> dialog.cancel() }
                builder.show()


            }
        }
    }


    }