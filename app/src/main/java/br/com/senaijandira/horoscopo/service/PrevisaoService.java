package br.com.senaijandira.horoscopo.service;

import java.util.List;

import br.com.senaijandira.horoscopo.model.signo;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by 17259209 on 03/12/2018.
 */

public interface PrevisaoService {
    String URL_BASE = "http://10.0.2.2:5001/";

    @GET("/signos")
    retrofit2.Call<List<signo>> obterSigno();

    @GET("/signos/{id}")
    Call<signo> obterSignoPorId(@Path("id")String id);

}
