package br.com.senaijandira.horoscopo.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import br.com.senaijandira.horoscopo.R;
import br.com.senaijandira.horoscopo.model.signo;
import br.com.senaijandira.horoscopo.service.PrevisaoService;
import br.com.senaijandira.horoscopo.service.ServiceFactory;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by 17259209 on 03/12/2018.
 */

public class PrevisaoActivity extends AppCompatActivity {

    String nomeSigno, idSigno, dataSigno;

    TextView TituloSigno, DescricaoSigno;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.previsao_main);
        setTitle("Previsão de:");

        nomeSigno = getIntent().getStringExtra("nomeSigno");
        idSigno = getIntent().getStringExtra("idSigno");


        TituloSigno = findViewById(R.id.TituloSigno);
        DescricaoSigno = findViewById(R.id.DescricaoSigno);




        //Chamada API
        PrevisaoService api = ServiceFactory.create();

        api.obterSignoPorId(idSigno).enqueue(new Callback<signo>() {
            @Override
            public void onResponse(Call<signo> call, Response<signo> response) {

                signo s = response.body();
                preencherTela(s);
            }

            @Override
            public void onFailure(Call<signo> call, Throwable t) {
                //Se deu erro
            }
        });

    }


    private void preencherTela(signo s){

        TituloSigno.setText(s.getNome());
        DescricaoSigno.setText(s.getDescricao());


    }

}
