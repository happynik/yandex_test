package com.example.moiseev.yandex_test.model;

import com.example.moiseev.yandex_test.model.api.Artist;

import java.util.List;

import rx.Observable;

/**
 * Created by Daniil on 28.03.2016.
 */
public interface IModel {
    Observable<List<Artist>> getArtistList();
}
