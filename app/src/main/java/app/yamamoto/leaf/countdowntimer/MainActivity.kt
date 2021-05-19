package app.yamamoto.leaf.countdowntimer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var second: Int = 10

    val timer: CountDownTimer = object : CountDownTimer(10000, 1000){

        override fun onFinish() {
            startButton.isVisible = true

            second = 10

            secondText.text = second.toString()
        }

        override fun onTick(millisUntilFinished: Long) {
            second = second -1
            secondText.text = second.toString()

            timer.start()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        secondText.text =second.toString()

        startButton.setOnClickListener{
            startButton.isVisible = false
        }
    }
}