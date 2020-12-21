package e.vatsal.kesarwani.motionlayout_example

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Motion4Activity : AppCompatActivity() {

    companion object {
        fun start(context : Context) {
            context.startActivity(Intent(context, Motion4Activity::class.java))
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_motion4)
    }
}