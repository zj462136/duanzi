package com.example.lenovo.zhoukaoyi.net;

import com.example.lenovo.zhoukaoyi.bean.DuanziBean;

import io.reactivex.Observable;

public class DuanziApi {
    private static DuanziApi duanziApi;
    private DuanziApiService duanZiApiService;

    public DuanziApi(DuanziApiService duanZiApiService) {
        this.duanZiApiService = duanZiApiService;
    }
    public static DuanziApi getDuanziApi(DuanziApiService duanZiApiService){
        if (duanziApi==null) {
            duanziApi = new DuanziApi(duanZiApiService);
        }
        return duanziApi;
    }
    public Observable<DuanziBean> getDuanzi(String page){
        return duanZiApiService.geteDuanzi(page);
    }
}
