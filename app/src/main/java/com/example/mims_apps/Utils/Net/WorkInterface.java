package com.example.mims_apps.Utils.Net;

public interface WorkInterface {
    <I> void get(String url, CallBack<I> callBack);
}
