package mx.tecnm.chihuahua2.lanzardado01;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageView imageView_lado;
    TextView textView_resultado;
    Button button_lanzar;
    TextView textView_lado1;
    TextView textView_lado2;
    TextView textView_lado3;
    TextView textView_lado4;
    TextView textView_lado5;
    TextView textView_lado6;
    TextView textView_lado1_porcentaje;
    TextView textView_lado2_porcentaje;
    TextView textView_lado3_porcentaje;
    TextView textView_lado4_porcentaje;
    TextView textView_lado5_porcentaje;
    TextView textView_lado6_porcentaje;
    ProgressBar progressBar_lado1;
    ProgressBar progressBar_lado2;
    ProgressBar progressBar_lado3;
    ProgressBar progressBar_lado4;
    ProgressBar progressBar_lado5;
    ProgressBar progressBar_lado6;
    int totales;
    int lado1,lado2,lado3,lado4,lado5,lado6;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView_lado = findViewById(R.id.imageView_lado);
        textView_resultado = findViewById(R.id.textView_resultado);
        button_lanzar = findViewById(R.id.button_lanzar);
        textView_lado1 = findViewById(R.id.textView_lado1);
        textView_lado2 = findViewById(R.id.textView_lado2);
        textView_lado3 = findViewById(R.id.textView_lado3);
        textView_lado4 = findViewById(R.id.textView_lado4);
        textView_lado5 = findViewById(R.id.textView_lado5);
        textView_lado6 = findViewById(R.id.textView_lado6);
        textView_lado1_porcentaje = findViewById(R.id.textView_lado1_porcentaje);
        textView_lado2_porcentaje = findViewById(R.id.textView_lado2_porcentaje);
        textView_lado3_porcentaje = findViewById(R.id.textView_lado3_porcentaje);
        textView_lado4_porcentaje = findViewById(R.id.textView_lado4_porcentaje);
        textView_lado5_porcentaje = findViewById(R.id.textView_lado5_porcentaje);
        textView_lado6_porcentaje = findViewById(R.id.textView_lado6_porcentaje);
        progressBar_lado1 = findViewById(R.id.progressBar_lado1);
        progressBar_lado2 = findViewById(R.id.progressBar_lado2);
        progressBar_lado3 = findViewById(R.id.progressBar_lado3);
        progressBar_lado4 = findViewById(R.id.progressBar_lado4);
        progressBar_lado5 = findViewById(R.id.progressBar_lado5);
        progressBar_lado6 = findViewById(R.id.progressBar_lado6);

        totales=0;
        agregarEscucharBoton();
    }

    public void agregarEscucharBoton() {
        button_lanzar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random aleatorio = new Random();
                int numero = aleatorio.nextInt(6)+1;

                String update_str;
                update_str = getResources().getString (R.string.textView_resultado);
                textView_resultado.setText(update_str + numero);

                totales++;
                switch(numero){
                    case 1:
                        imageView_lado.setImageResource(R.drawable.dado1);
                        lado1++;
                        break;
                    case 2:
                        imageView_lado.setImageResource(R.drawable.dado2);
                        lado2++;
                        break;
                    case 3:
                        imageView_lado.setImageResource(R.drawable.dado3);
                        lado3++;
                        break;
                    case 4:
                        imageView_lado.setImageResource(R.drawable.dado4);
                        lado4++;
                        break;
                    case 5:
                        imageView_lado.setImageResource(R.drawable.dado5);
                        lado5++;
                        break;
                    case 6:
                        imageView_lado.setImageResource(R.drawable.dado6);
                        lado6++;
                        break;
                }
            }
        });
    }

    public void mostrarEstadisticas(){
        String str_lado1;
        str_lado1 = getResources().getString(R.string.textView_lado1);
        textView_lado1.setText(str_lado1 + lado1);
        String str_lado2;
        str_lado2 = getResources().getString(R.string.textView_lado2);
        textView_lado2.setText(str_lado1 + lado2);
        String str_lado3;
        str_lado3 = getResources().getString(R.string.textView_lado3);
        textView_lado3.setText(str_lado1 + lado3);
        String str_lado4;
        str_lado4 = getResources().getString(R.string.textView_lado4);
        textView_lado4.setText(str_lado1 + lado4);
        String str_lado5;
        str_lado5 = getResources().getString(R.string.textView_lado5);
        textView_lado5.setText(str_lado1 + lado5);
        String str_lado6;
        str_lado6 = getResources().getString(R.string.textView_lado6);
        textView_lado6.setText(str_lado1 + lado6);


        String str_lado1_porcentaje;
        str_lado1_porcentaje = "%";
        int lado1_porcentaje = (lado1*100)/totales;
        textView_lado1_porcentaje.setText(lado1_porcentaje + str_lado1_porcentaje);
        progressBar_lado1.setProgress(lado1_porcentaje);






    }

}