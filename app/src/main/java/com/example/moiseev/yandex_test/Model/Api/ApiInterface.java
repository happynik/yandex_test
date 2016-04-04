package com.example.moiseev.yandex_test.model.api;

import java.util.List;

import retrofit.http.GET;
import rx.Observable;

/**
 * Created by Daniil on 28.03.2016.
 */
public interface ApiInterface {
    @GET("artists.json")
    Observable<List<Artist>> getArtists();
}
