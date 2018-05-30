package com.example.lenovo.zhoukaoyi.ui.duanzi.contract;

import com.example.lenovo.zhoukaoyi.bean.DuanziBean;
import com.example.lenovo.zhoukaoyi.ui.base.BaseContract;

import java.util.List;

public interface DuanziContract {
    interface View extends BaseContract.BaseView{
        void onSuccess(List<DuanziBean.DataBean> list);
    }
    interface Presenter extends BaseContract.BasePresenter<View>{
        void getDuanzi(String page);
    }
}
