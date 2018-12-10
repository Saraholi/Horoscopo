package br.com.senaijandira.horoscopo.service;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by 17259209 on 03/12/2018.
 */

public class ServiceFactory  {

    public static PrevisaoService create(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(PrevisaoService.URL_BASE)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        return retrofit.create(PrevisaoService.class);
    }
}
