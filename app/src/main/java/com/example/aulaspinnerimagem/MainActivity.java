package com.example.aulaspinnerimagem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final String[] img = {"Bichos","Cachorro", "Gato", "Leão", "Elefante"};
    ArrayAdapter<String> imgspn;
    int aux=0;
    Spinner spn;
    TextView txtView;
    ImageView imgView;
    int vetImagem[];



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spn = findViewById(R.id.spn);
        imgspn = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,img);
        spn.setAdapter(imgspn);
        txtView = findViewById(R.id.txtView);
        imgView = findViewById(R.id.imgView);
        vetImagem = new int[]{
                R.drawable.bichos,
                R.drawable.leao,
                R.drawable.gatinho,
                R.drawable.fante,
                R.drawable.cachorro,
                                    };
        spn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int Posicao, long l) {
                aux = Posicao;

                switch(aux)
                {
                    case 0: imgView.setImageResource(R.drawable.bichos);txtView.setText("Nome\nRaça\nIdade\nEndereço");break;
                    case 1: imgView.setImageResource(R.drawable.cachorro);txtView.setText("Tristonho\nVira-lata\n2 anos\nCangaiba");break;
                    case 2: imgView.setImageResource(R.drawable.gatinho);txtView.setText("Gaspar\nMimado\n3 anos\nCocaia");break;
                    case 3: imgView.setImageResource(R.drawable.leao);txtView.setText("Aslan\n10 anos\nRei da Selva\nAmazonas");break;
                    case 4: imgView.setImageResource(R.drawable.fante);txtView.setText("Tomate\nGigante\n20 anos\nSul da Africa");break;

                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        imgView.setImageResource(R.drawable.bichos);
    }

    }
