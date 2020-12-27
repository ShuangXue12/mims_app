package com.example.mims_apps.Utils;

import android.database.Observable;

import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface ApiService {
    String BaseUrl = "https://cdplay.cn/";

    @GET
    Observable<ResponseBody> get(@Url String baseUrl);
}
