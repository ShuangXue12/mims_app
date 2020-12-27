package com.example.mims_apps.Utils.Net;

public interface CallBack<I> {
    void onSuccess(I i);

    void onFail(String error);
}
