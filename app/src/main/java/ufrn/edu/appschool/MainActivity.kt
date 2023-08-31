package ufrn.edu.appschool

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editLogin:EditText = findViewById(R.id.editLogin)
        val editPassword:EditText = findViewById(R.id.editPassword)
        val button:Button = findViewById(R.id.button)
        val textViewError:TextView = findViewById(R.id.textViewErro)

        button.setOnClickListener {
            val login:String = editLogin.text.toString()
            val password:String = editPassword.text.toString()

            if(login.equals("bruno") && password.equals("bruno123")){
                Toast.makeText(this, "BEM VINDO!", Toast.LENGTH_SHORT).show()
                textViewError.error = ""
            }else{
                textViewError.error = "LOGIN OU SENHA ERRADA"
            }
        }

    }
}