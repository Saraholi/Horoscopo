package br.com.senaijandira.horoscopo.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import br.com.senaijandira.horoscopo.R;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView  = findViewById(R.id.aries);
        imageView  = findViewById(R.id.touro);
        imageView  = findViewById(R.id.gemeos);
        imageView  = findViewById(R.id.cancer);
        imageView  = findViewById(R.id.leao);
        imageView  = findViewById(R.id.virgem);
        imageView  = findViewById(R.id.libra);
        imageView  = findViewById(R.id.escorpiao);
        imageView  = findViewById(R.id.sagitario);
        imageView  = findViewById(R.id.capricornio);
        imageView  = findViewById(R.id.aquario);
        imageView  = findViewById(R.id.peixes);


    }
    //instanciar o Adapter
   // adapter = new previsaoAdapter(this);



    public void Aries(View view) {

        Intent intent = new Intent(this, PrevisaoActivity.class);

        intent.putExtra("nomeSigno", "aries");
        intent.putExtra("idSigno", "1");

        startActivity(intent);
    }

    public void Touro(View view) {
        Intent intent = new Intent(this, PrevisaoActivity.class);
        intent.putExtra("nomeSigno", "touro");
        intent.putExtra("idSigno", "2");
        startActivity(intent);
    }


    public void Gemeos(View view) {
        Intent intent = new Intent(this, PrevisaoActivity.class);
        intent.putExtra("nomeSigno", "gemeos");
        intent.putExtra("idSigno", "3");
        startActivity(intent);
    }

    public void Cancer(View view) {
        Intent intent = new Intent(this, PrevisaoActivity.class);
        intent.putExtra("nomeSigno", "cancer");
        intent.putExtra("idSigno", "4");
        startActivity(intent);
    }

    public void leao(View view) {
        Intent intent = new Intent(this, PrevisaoActivity.class);
        intent.putExtra("nomeSigno", "leao");
        intent.putExtra("idSigno", "5");
        startActivity(intent);
    }


    public void Virgem(View view) {
        Intent intent = new Intent(this, PrevisaoActivity.class);
        intent.putExtra("nomeSigno", "virgem");
        intent.putExtra("idSigno", "6");
        startActivity(intent);
    }

    public void Libra(View view) {
        Intent intent = new Intent(this, PrevisaoActivity.class);
        intent.putExtra("nomeSigno", "libra");
        intent.putExtra("idSigno", "7");
        startActivity(intent);
    }

    public void Escorpiao(View view) {
        Intent intent = new Intent(this, PrevisaoActivity.class);
        intent.putExtra("nomeSigno", "escorpiao");
        intent.putExtra("idSigno", "8");
        startActivity(intent);

    }


    public void Sagitario(View view) {
        Intent intent = new Intent(this, PrevisaoActivity.class);
        intent.putExtra("nomeSigno", "sagitario");
        intent.putExtra("idSigno", "9");
        startActivity(intent);

    }

    public void Capricornio(View view) {
        Intent intent = new Intent(this, PrevisaoActivity.class);
        intent.putExtra("nomeSigno", "capricornio");
        intent.putExtra("idSigno", "10");
        startActivity(intent);

    }

    public void Aquario(View view) {
        Intent intent = new Intent(this, PrevisaoActivity.class);
        intent.putExtra("nomeSigno", "aquario");
        intent.putExtra("idSigno", "11");
        startActivity(intent);

    }

    public void Peixes(View view) {
        Intent intent = new Intent(this, PrevisaoActivity.class);
        intent.putExtra("nomeSigno", "peixes");
        intent.putExtra("idSigno", "12");
        startActivity(intent);

    }
}
