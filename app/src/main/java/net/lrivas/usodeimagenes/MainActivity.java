package net.lrivas.usodeimagenes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {
    // Se declarán los objetos necesitados
    // del enunciado.
    ImageView Visualizar;
    Button Bton1, Bton2, Bton3, Bton4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Se referencas los objetos
        Visualizar = findViewById(R.id.Mostrar_Imagen);
        Bton1 = findViewById(R.id.btn_Imagen1);
        Bton2 = findViewById(R.id.btn_Imagen2);
        Bton3 = findViewById(R.id.btn_Imagen3);
        Bton4 = findViewById(R.id.btn_Imagen4);
        // El primer botón
        Bton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Picasso.get().load(R.drawable.argentina).into(Visualizar);
            }
        });
        // El segundo botón
        Bton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Picasso.get()
                        .load(R.drawable.programador)
                        .resize(512, 512)
                        .centerCrop()
                        .into(Visualizar);
            }
        });
        // El tercer botón
        Bton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Picasso.get()
                        .load(R.drawable.redes_info)
                        .into(Visualizar);
            }
        });
        // El cuarto botón
        Bton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Picasso.get()
                        .load("https://www.solingest.com/wp-content/uploads/2020/01/programador_freelance.jpg")
                        .resize(512,512)
                        .centerCrop()
                        .into(Visualizar);
            }
        });
    }
}