package com.example.trabajo2t.Inicio

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.trabajo2t.databinding.LoginActivityBinding

class LoginActivity : AppCompatActivity() {

    lateinit var binding: LoginActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = LoginActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val misPreferencias = getSharedPreferences("myprefs", MODE_PRIVATE)
        val usuario = misPreferencias.getString("user", "")


        if(usuario == "Invitado"){
            binding.user.setText("")
        } else{
            binding.user.setText(usuario)
        }


        binding.button.setOnClickListener {
            val userText = binding.user.text.toString()
            val passText = binding.password.text.toString()

            val editor = misPreferencias.edit()

            if(userText == "directivo" || userText == "jugador" || userText == "aficionado"){
                editor.putString("user", userText)
                editor.apply()
            }

            compLogin(userText, passText)
        }

        //openMain("")

        binding.button2.setOnClickListener {
            val editor = misPreferencias.edit()
            editor.putString("user", "Invitado")
            editor.apply()
            openMain()
        }
    }

    private fun compLogin(user: String, password: String) {
        if (user.isEmpty()) {
            binding.user.error = "El campo está vacío"
            return
        }

        if (password.isEmpty()) {
            binding.password.error = "El campo está vacío"
            return
        }

        if ((binding.user.text.toString() == "directivo" && binding.password.text.toString() == "asdfasdf") || (binding.user.text.toString() == "jugador" && binding.password.text.toString() == "qwerasdf") || (binding.user.text.toString() == "aficionado" && binding.password.text.toString() == "123456")) {
            openMain()

        } else {
            Toast.makeText(this, "Contraseña y / o usuario incorrecto", Toast.LENGTH_SHORT).show()
            return
        }
    }

    private fun openMain(){
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }
}