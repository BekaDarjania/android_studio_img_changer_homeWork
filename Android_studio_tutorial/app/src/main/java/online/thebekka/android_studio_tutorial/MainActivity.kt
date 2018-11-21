package online.thebekka.android_studio_tutorial

import android.content.Intent
import android.content.res.Resources
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    //var imageView: ImageView = findViewById(R.id.imgView)
    //var btn: Button = findViewById(R.id.other_btn)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()
    }

    private fun init() {
        other_btn.setOnClickListener {

            //Toast.makeText(applicationContext,,Toast.LENGTH_SHORT).show()

            if (imgView.tag.toString().equals("active")) {
                imgView.setImageDrawable(getDrawable(R.drawable.ic_hole))
                imgView.tag = "deActive"
            } else {
                imgView.setImageDrawable(getDrawable(R.drawable.ic_mobile))
                imgView.tag = "active"
            }
        }
    }
}
