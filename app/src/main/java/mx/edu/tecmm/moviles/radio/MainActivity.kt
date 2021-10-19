package mx.edu.tecmm.moviles.radio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    lateinit var txtResultado: TextView
    lateinit var edNum1:EditText
    lateinit var edNum2: EditText
    lateinit var rdSuma: RadioButton
    lateinit var rdResta: RadioButton //Cuando se utiliza onListenner se inicializa

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txtResultado= findViewById(R.id.txtResultado);
        edNum1= findViewById(R.id.edNum1);
        edNum2= findViewById(R.id.edNum2);
        rdResta= findViewById(R.id.rdResta);
        rdSuma= findViewById(R.id.rdSuma);


    }

    fun presiono (view: View){
        Log.e("Boton", "Se presionó el botón")
        val num1= edNum1.text.toString().toInt();
        val num2= edNum2.text.toString().toInt();
        var res:Int =0;
        if (rdSuma.isChecked){
            res= num1+num2;
        }else if (rdResta.isChecked){
            res= num1-num2;
        }
        txtResultado.text= "$res";


    }
}