package com.example.lenovo.zhoukaoyi.ui.base;

public class BasePresenter<T extends BaseContract.BaseView> implements BaseContract.BasePresenter<T> {
    protected T mView;
    @Override
    public void attachView(T view) {
        if (view!=null){
            this.mView=view;
        }
    }

    @Override
    public void detachView() {
        if (mView!=null){
            this.mView=null;
        }
    }
}
