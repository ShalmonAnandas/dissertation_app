package com.example.chatapptrial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

class SignUp : AppCompatActivity() {

    private lateinit var edt_name_usr: EditText
    private lateinit var edt_email: EditText
    private lateinit var edt_pass: EditText
    private lateinit var edt_signUp: Button
    private lateinit var mAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        supportActionBar?.hide()

        mAuth = FirebaseAuth.getInstance()

        edt_name_usr = findViewById(R.id.edt_name_usr)
        edt_email = findViewById(R.id.edt_email)
        edt_pass = findViewById(R.id.edt_pass)
        edt_signUp = findViewById(R.id.edt_signUp)

        edt_signUp.setOnClickListener {
            val email = edt_email.text.toString()
            val password = edt_pass.text.toString()

            signUp(email,password);
        }
    }

    private fun signUp(email: String, password: String){
        mAuth.createUserWithEmailAndPassword(email, password)
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    // code for jumping to home activity

                    val intent = Intent(this@SignUp, MainActivity::class.java)
                    startActivity(intent)

                } else {

                    Toast.makeText(this@SignUp, "Some error occurred", Toast.LENGTH_SHORT).show()

                }
            }
    }
}