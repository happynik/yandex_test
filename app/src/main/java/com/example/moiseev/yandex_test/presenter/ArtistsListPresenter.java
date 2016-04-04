package com.example.moiseev.yandex_test.presenter;

import com.example.moiseev.yandex_test.model.IModel;
import com.example.moiseev.yandex_test.model.ModelImpl;
import com.example.moiseev.yandex_test.model.api.Artist;
import com.example.moiseev.yandex_test.view.ArtistsListView;
import com.example.moiseev.yandex_test.view.View;

import java.util.List;

import rx.Observer;
import rx.Subscription;
import rx.subscriptions.Subscriptions;

/**
 * Created by moise on 05.04.2016.
 */
public class ArtistsListPresenter implements IPresenter {

    private IModel _model = new ModelImpl();
    private Subscription subscription = Subscriptions.empty();

    private ArtistsListView _view;

    public ArtistsListPresenter(ArtistsListView view){
        _view = view;
    }

    public void OnLoaded() {
        if (!subscription.isUnsubscribed()) {
            subscription.unsubscribe();
        }

        subscription = _model.getArtistList().subscribe(
                new Observer<List<Artist>>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        _view.showError(e.getMessage());
                    }

                    @Override
                    public void onNext(List<Artist> data) {
                        if (data != null && !data.isEmpty()) {
                            _view.showArtists(data);
                        } else {
                            _view.showEmptyList();
                        }
                    }
                });
    }

    @Override
    public void OnStop() {

    }
}
