package kunal.example.aquashots

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.*
import androidx.appcompat.app.AlertDialog
import androidx.core.view.isVisible
import java.lang.Integer.parseInt

class MainUserScreen : AppCompatActivity(), View.OnClickListener {

    companion object{
        var totalIntake: Int = 0
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
    var progress: Double = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_user_screen)

        settingsImgView = findViewById(R.id.settingImgView)
        settingsImgView.setOnClickListener(this)
        totalTV = findViewById(R.id.totalTV)
        intakeTV = findViewById(R.id.intakeTV)
        iv50 = findViewById(R.id.iV50)
        iv50.setOnClickListener(this)
        iv100 = findViewById(R.id.iV100)
        iv150 = findViewById(R.id.iV150)
        iv300 = findViewById(R.id.iV300)
        iv500 = findViewById(R.id.iV500)
        ivCustom = findViewById(R.id.iVcustom)
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

    override fun onClick(view: View?) {
        when (view?.id) {
            R.id.settingImgView -> {
                val intent = Intent(this, SettingsActivity::class.java).apply {  }
                startActivity(intent)
            }
            R.id.iV50 -> {
                iv50.animate().apply {
                    duration = 1000
                    rotationYBy(360f)
                }.withEndAction {

                }.start()
                intakeTV.text = (parseInt(intakeTV.text.toString()) + 50).toString()
               // progressBar.progress = (((intakeTV.text.toString()).toDouble()/(totalTV.text.toString()).toDouble())*100).toInt()
                progress += (((intakeTV.text.toString()).toDouble() / (totalTV.text.toString()).toDouble()) * 100)
                progressBar.progress = progress.toInt()
                Toast.makeText(this, progressBar.progress.toString(),
                    Toast.LENGTH_SHORT).show();
            }
            R.id.iV100 -> {
                iv100.animate().apply {
                    duration = 1000
                    rotationYBy(360f)
                }.withEndAction {

                }.start()
                intakeTV.text = (parseInt(intakeTV.text.toString()) + 100).toString()
                // progressBar.progress = (((intakeTV.text.toString()).toDouble()/(totalTV.text.toString()).toDouble())*100).toInt()
                progress += (((intakeTV.text.toString()).toDouble() / (totalTV.text.toString()).toDouble()) * 100)
                progressBar.progress = progress.toInt()
                Toast.makeText(this, progressBar.progress.toString(),
                    Toast.LENGTH_SHORT).show();
            }
            R.id.iV150 -> {
                iv150.animate().apply {
                    duration = 1000
                    rotationYBy(360f)
                }.withEndAction {

                }.start()
                intakeTV.text = (parseInt(intakeTV.text.toString()) + 150).toString()
                // progressBar.progress = (((intakeTV.text.toString()).toDouble()/(totalTV.text.toString()).toDouble())*100).toInt()
                progress += (((intakeTV.text.toString()).toDouble() / (totalTV.text.toString()).toDouble()) * 100)
                progressBar.progress = progress.toInt()
                Toast.makeText(this, progressBar.progress.toString(),
                    Toast.LENGTH_SHORT).show();
            }
            R.id.iV300 -> {
                iv300.animate().apply {
                    duration = 1000
                    rotationYBy(360f)
                }.withEndAction {

                }.start()
                intakeTV.text = (parseInt(intakeTV.text.toString()) + 300).toString()
                // progressBar.progress = (((intakeTV.text.toString()).toDouble()/(totalTV.text.toString()).toDouble())*100).toInt()
                progress += (((intakeTV.text.toString()).toDouble() / (totalTV.text.toString()).toDouble()) * 100)
                progressBar.progress = progress.toInt()
                Toast.makeText(this, progressBar.progress.toString(),
                    Toast.LENGTH_SHORT).show();
            }
            R.id.iV500 -> {
                iv500.animate().apply {
                    duration = 1000
                    rotationYBy(360f)
                }.withEndAction {

                }.start()
                intakeTV.text = (parseInt(intakeTV.text.toString()) + 500).toString()
                // progressBar.progress = (((intakeTV.text.toString()).toDouble()/(totalTV.text.toString()).toDouble())*100).toInt()
                progress += (((intakeTV.text.toString()).toDouble() / (totalTV.text.toString()).toDouble()) * 100)
                progressBar.progress = progress.toInt()
                Toast.makeText(this, progressBar.progress.toString(),
                    Toast.LENGTH_SHORT).show();
            }
            R.id.iVcustom ->{
            }
        }
    }
}