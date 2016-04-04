package com.example.moiseev.yandex_test.view;

import com.example.moiseev.yandex_test.model.api.Artist;

import java.util.List;

/**
 * Created by moise on 05.04.2016.
 */
public interface ArtistsListView extends View{
    void showArtists(List<Artist> data);
}
