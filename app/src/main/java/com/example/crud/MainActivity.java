package com.example.crud;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

// Importa el R correcto
import com.example.crud.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Context context;
    Button btnListar, btnRegistar, btnBuscar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        init();

    }

    private void init(){
        context = getApplicationContext();
        btnRegistar = findViewById(R.id.btnregistrar);
        btnBuscar = findViewById(R.id.btnbuscar);
        btnListar = findViewById(R.id.btnlistar);


    }

    //@SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View view) {
        switch (view.getId() ){
            case R.id.btnregistrar:
                Toast.makeText(context, "Registrar", Toast.LENGTH_LONG).show();
                Intent i = new Intent(context, GestionarLibroActivity.class);
                startActivity(i);
                break;
            case R.id.btnlistar:
                Toast.makeText(context, "Listar", Toast.LENGTH_LONG).show();
                Intent i2 = new Intent(context, GestionarLibroActivity.class);
                startActivity(i2);
                break;
            case R.id.btnbuscar:
                Toast.makeText(context, "Buscar", Toast.LENGTH_LONG).show();
                Intent i3 = new Intent(context, GestionarLibroActivity.class);
                startActivity(i3);
                break;
        }
    }


}