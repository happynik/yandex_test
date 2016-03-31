package com.example.moiseev.yandex_test;


import android.database.Observable;
import java.util.List;

/**
 * Created by Daniil on 28.03.2016.
 */
public interface Model {
    Observable<List<Artist>> getArtistList();
}
