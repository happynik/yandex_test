package com.example.moiseev.yandex_test;

import android.database.Observable;

import java.util.List;

import retrofit.http.GET;

/**
 * Created by Daniil on 28.03.2016.
 */
public interface ApiInterface {
    @GET("")
    Observable<List<Artist>> getArtists();
}
