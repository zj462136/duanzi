package com.example.lenovo.zhoukaoyi.net;

import com.example.lenovo.zhoukaoyi.bean.DuanziBean;

import io.reactivex.Observable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface DuanziApiService {
    @FormUrlEncoded
    @POST("quarter/getJokes")
    Observable<DuanziBean> geteDuanzi(@Field("page") String page);

}
