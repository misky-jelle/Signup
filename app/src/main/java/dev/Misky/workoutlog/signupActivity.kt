package dev.Misky.workoutlog

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class signupActivity : AppCompatActivity() {
    lateinit var etpassword:TextInputEditText
    lateinit var etfirstname:TextInputEditText
    lateinit var etsecondname:TextInputEditText
    lateinit var etconfirm:TextInputEditText
    lateinit var btnSignup:Button
    lateinit var tilPASSWORD:TextInputLayout
    lateinit var tilfirstname:TextInputLayout
    lateinit var tilsecondname:TextInputLayout
    lateinit var tilconfirm:TextInputLayout
    lateinit var tvlogin: TextView








    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        tvlogin = findViewById(R.id.tvlogin)
        etpassword = findViewById(R.id.etpassword)
        etfirstname = findViewById(R.id.etfirstname)
        etsecondname = findViewById(R.id.etsecondname)
        etconfirm = findViewById(R.id.etconfirm)
        btnSignup = findViewById(R.id.btnSignup)
        tilPASSWORD = findViewById(R.id.tilPASSWORD)
        tilfirstname = findViewById(R.id.tilfirstname)
        tilsecondname = findViewById(R.id.tilsecondname)
        tilconfirm = findViewById(R.id.tilconfirm)



        tvlogin.setOnClickListener {
            val intent = Intent(this, signupActivity::class.java)
            startActivity(intent)
        }
        btnSignup.setOnClickListener {
            validateSignup()
        }
    }
        fun validateSignup(){
            var password=etpassword.text.toString()
            var confirm=etconfirm.text.toString()
            var firstname=etfirstname.text.toString()
            var secondname=etsecondname.text.toString()
            if (password.isBlank()){
                tilPASSWORD.error=" Password is required"
            }
            if (confirm.isBlank()){
                tilconfirm.error="Confirmation is required"
            }
            if (firstname.isBlank()){
                tilfirstname.error="First Name is required"
            }
            if (secondname.isBlank()){
                tilsecondname.error="Secoond Name is required"
            }
        }

    }

