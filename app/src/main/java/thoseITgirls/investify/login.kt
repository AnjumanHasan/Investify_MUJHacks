package thoseITgirls.investify

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class login : AppCompatActivity() {
    lateinit var  signUpText :TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        signUpText =findViewById(R.id.signUpText)
        signUpText.setOnClickListener{
            val intent = Intent(this,loginAs::class.java)
            startActivity(intent)
        }
    }
}