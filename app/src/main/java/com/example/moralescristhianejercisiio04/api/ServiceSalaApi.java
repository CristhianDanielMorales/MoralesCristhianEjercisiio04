package com.example.moralescristhianejercisiio04.api;

import com.example.moralescristhianejercisiio04.entity.Sala;

import java.util.List;
import java.util.Optional;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface ServiceSalaApi {

    @GET("sala")
    public abstract Call<List<Sala>> listaSala();

    @GET("sala/{id}")
    public abstract  Call<Optional<Sala>> buscaSala(String id);

    @POST("sala")
    public abstract Call<Sala> insertaSala(@Body Sala obj);

    @PUT("sala")
    public abstract Call<Sala> actualizaSala(@Body Sala obj);

    @DELETE("sala/{id}")
    public abstract Call<Sala> eliminaSala(@Path("id")String id);
}
