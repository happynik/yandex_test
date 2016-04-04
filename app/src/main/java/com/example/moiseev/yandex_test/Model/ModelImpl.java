package com.example.moiseev.yandex_test.model;

import com.example.moiseev.yandex_test.model.api.ApiInterface;
import com.example.moiseev.yandex_test.model.api.ApiModule;
import com.example.moiseev.yandex_test.model.api.Artist;
import com.example.moiseev.yandex_test.other.Consts;

import java.util.List;

import rx.Observable;

/**
 * Created by moise on 05.04.2016.
 */
public class ModelImpl implements IModel {
    ApiInterface _api = ApiModule.getApiInterface(Consts.BASE_URL);

    @Override
    public Observable<List<Artist>> getArtistList() {
        return _api.getArtists();
    }
}
