package dev.Misky.workoutlog

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class logInActivity : AppCompatActivity() {
    lateinit var tvsignup:TextView
    lateinit var etEmail:TextInputEditText
    lateinit var etpassword:TextInputEditText
    lateinit var tilEmail: TextInputLayout
    lateinit var tilpassword: TextInputLayout
    lateinit var btnLogin:Button





    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in)
        tvsignup=findViewById(R.id.tvsignup)
        etEmail=findViewById(R.id.etEmail)
        etpassword=findViewById(R.id.etpassword)
        btnLogin=findViewById(R.id.btnLogIn)
        tilEmail=findViewById(R.id.tilEmail)
        tilpassword=findViewById(R.id.tilpassword)




        tvsignup.setOnClickListener {
            val intent=Intent(this,signupActivity::class.java)
            startActivity(intent)
        }
        btnLogin.setOnClickListener {
            validateLogin()
        }

    }
    fun validateLogin(){
        var email=etEmail.text.toString()
        var password=etpassword.text.toString()
        if (email.isBlank()){
            tilEmail.error="Email is required"
        }
        if (password.isBlank()){
            tilpassword.error="Password is required"
        }
    }
}