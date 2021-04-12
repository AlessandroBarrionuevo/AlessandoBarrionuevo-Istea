package com.istea.myapplication

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import org.w3c.dom.Text

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        //enlazamos nuestro layout con el Activity

        val txtIngresado: EditText = findViewById(R.id.txt_Ingresado)
        val confirmacion: TextView = findViewById(R.id.txt_Confirmacion)
        val btnPalindromo: Button = findViewById(R.id.btn_Palindromo)
        val btnVolverAtras: Button = findViewById(R.id.btn_VolverA2)
        val im: ImageView = findViewById(R.id.imageView)

        btnPalindromo.setOnClickListener {
            //Al presionar el boton
            verificarPalindromo(btnPalindromo, txtIngresado, confirmacion, im)

        }

        btnVolverAtras.setOnClickListener {
            val int2 = Intent(this, indexActivity::class.java)
            startActivity(int2)
        }
    }

    //Funcion que va a verificar si el palindromo es correcto o no
    fun verificarPalindromo(btn: Button, txt: EditText, mostrar: TextView, img: ImageView){
            //capturamos el string del layout
            var textoIngresado: String = txt.text.toString().toLowerCase()

            //si este no es vacio ejecutamos la logica
            if (textoIngresado != null){
                //sacamos los espacios en blanco
                textoIngresado = textoIngresado.replace("\\s".toRegex(),"")//Esto lo googlee ya que no sabia como hacer para sacar los espacios

                //Damos vuelta el string para compararlo con el texto ingresado, si las letras son iguales de principio a fin
                var dadoVuelta = textoIngresado.reversed()

                if(textoIngresado == dadoVuelta){
                    //Mostramos la confirmacion al usuario
                    mostrar.setText("Es un palindromo")
                    img.setBackgroundResource(R.mipmap.fondocorrect)
                }else{
                    //Mostramos un mensaje para dar a saber al usuario que no es un palindromo
                    mostrar.setText("No es un palindromo")
                    img.setBackgroundResource(R.mipmap.fondowrong)
                    //linear.setBackgroundResource(R.mipmap.fondoindex)
                }
            }
            //En caso de estar vacio, ejecutamos un mensaje de error
            else{
                mostrar.setText("Error, datos ingresados de forma incorrecta")
            }
    }
}