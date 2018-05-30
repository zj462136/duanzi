package com.example.lenovo.zhoukaoyi.ui.base;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lenovo.zhoukaoyi.inter.IBase;

import javax.inject.Inject;

public abstract class BaseFragment<T extends BaseContract.BasePresenter> extends Fragment implements IBase,BaseContract.BaseView {
    @Inject
    protected T mPresenter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        inject();
        View view=inflater.inflate(getContentLayout(),null);
        mPresenter.attachView(this);
        initView(view);
        return view;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mPresenter.detachView();
    }

    @Override
    public void showLoading() {

    }

    @Override
    public void dismissLoading() {

    }
}
