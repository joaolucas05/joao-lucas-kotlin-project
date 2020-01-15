package br.com.joaolucas.estacaohack

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler().postDelayed({


            //Criando minha Intent
            startActivity(Intent(this@SplashActivity, LoginActivity::class.java))
            finish()
        },3000)
    }
}
