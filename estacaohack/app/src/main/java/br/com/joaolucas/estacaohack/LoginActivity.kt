package br.com.joaolucas.estacaohack

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        //Criando a ação do clique do botão entrar

        btnEntrar.setOnClickListener {

            var usuario = edtNome.text.toString().trim()
            var senha = edtSenha.text.toString().trim()

            var numberTent = 5

            if (usuario.isEmpty()){
                Toast.makeText(this@LoginActivity, "Usuario Vazio", Toast.LENGTH_LONG).show()
            }else if (senha.isEmpty()) {
                Toast.makeText(this@LoginActivity, "Senha Vazia", Toast.LENGTH_LONG).show()
            }else if (usuario=="joaolucas" && senha=="123456"){
                    startActivity(Intent(this@LoginActivity,MainActivity::class.java))
                }else{

                    edtNome.setText("")
                    edtSenha.setText("")

                    var Tent = numberTent - 1

                    AlertDialog.Builder(this@LoginActivity)
                        .setTitle("Erro de Autenticação")
                        .setMessage("Usuario ou senha Incorretos, Tentativas restantes: $Tent")
                        .setPositiveButton("Ok"){ _,_->


                        }
                        .create()
                        .show()
                numberTent = Tent
                }



        }

        btnRegister.setOnClickListener {
            startActivity(Intent(this@LoginActivity,CadastroActivity::class.java))
        }

    }
}
