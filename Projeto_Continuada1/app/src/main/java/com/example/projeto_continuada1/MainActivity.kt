package com.example.projeto_continuada1

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun calculo(componente: View) {
        if (ed_vitorias >= 0) {
            tv_frase.text = "Valor Valido"

            if (ed_vitorias <= 10) {
                tv_frase.text = "Vai brigar pra não cair!!"
                tv_frase.setTextColor(Color.RED)
            } else {
                tv_frase.text = "Pode brigar pelo Titulo!!"
                tv_frase.setTextColor(Color.GREEN)
            }
        } else{
            tv_frase.text = "Valor Invalido"
        }

        if (ed_derrotas <= 38) {
            tv_frase.text = "Valor Valido"

            if (ed_derrotas >= 10) {
                tv_frase.text = "Vai brigar pra não cair!!"
                tv_frase.setTextColor(Color.RED)
            } else {
                tv_frase.text = "Vai brigar pelo Titulo!!"
                tv_frase.setTextColor(Color.GREEN)
            }
        } else{
            tv_frase.text = "Valor Invalido"
        }


        if (ed_empates >=0 ) {
            tv_frase.text = "Valor Valido"

            if (ed_empates >=17) {
                tv_frase.text = "Vai brigar pra não cair!!"
                tv_frase.setTextColor(Color.RED)
            } else {
                tv_frase.text = "Vai brigar pelo Titulo!!"
                tv_frase.setTextColor(Color.GREEN)
            }
        } else{
            tv_frase.text = "Valor Invalido"
        }
    }
}

private operator fun Any.compareTo(i: Int): Int {

}
