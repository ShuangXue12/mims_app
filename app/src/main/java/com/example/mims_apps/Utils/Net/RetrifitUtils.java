package com.example.mims_apps.Utils.Net;

import com.example.mims_apps.Utils.ApiService;

import io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

public class RetrifitUtils implements WorkInterface{
    private RetrifitUtils retrifitUtils;
    private ApiService apiService;

    private RetrifitUtils(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(ApiService.BaseUrl)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
        apiService = retrofit.create(ApiService.class);
    }

    public RetrifitUtils(RetrifitUtils retrifitUtils) {
        if (retrifitUtils==null){
            synchronized (RetrifitUtils.class){
                if (retrifitUtils==null){
                    retrifitUtils = new RetrifitUtils();
                }
            }
        }
        this.retrifitUtils = retrifitUtils;
    }

    @Override
    public <I> void get(String url, CallBack<I> callBack) {
        apiService.get(url)
                .subscribeOn(Schedulers.io())


    }
}
