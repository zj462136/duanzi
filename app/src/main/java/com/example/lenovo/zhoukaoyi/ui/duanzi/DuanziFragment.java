package com.example.lenovo.zhoukaoyi.ui.duanzi;

import android.support.v7.widget.LinearLayoutManager;
import android.view.View;

import com.example.lenovo.zhoukaoyi.R;
import com.example.lenovo.zhoukaoyi.adapter.DuanziAdapter;
import com.example.lenovo.zhoukaoyi.application.MyApplication;
import com.example.lenovo.zhoukaoyi.bean.DuanziBean;
import com.example.lenovo.zhoukaoyi.bean.MyDataBean;
import com.example.lenovo.zhoukaoyi.component.DaggerHttpComponent;
import com.example.lenovo.zhoukaoyi.dao.MyDataBeanDao;
import com.example.lenovo.zhoukaoyi.ui.base.BaseFragment;
import com.example.lenovo.zhoukaoyi.ui.duanzi.contract.DuanziContract;
import com.example.lenovo.zhoukaoyi.ui.duanzi.presenter.DuanziPresenter;
import com.jcodecraeer.xrecyclerview.XRecyclerView;

import java.util.ArrayList;
import java.util.List;

public class DuanziFragment extends BaseFragment<DuanziPresenter> implements DuanziContract.View {
    private View view;
    private XRecyclerView xrl;
    private List<DuanziBean.DataBean> list=new ArrayList<>();
    private DuanziAdapter adapter;
    private int page=1;
    private boolean isReftesh=true;

    @Override
    public int getContentLayout() {
        return R.layout.fragment_duanzi;
    }

    @Override
    public void initView(View view) {
        xrl = (XRecyclerView) view.findViewById(R.id.xrl);
        xrl.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter = new DuanziAdapter(getActivity(), list);
        xrl.setAdapter(adapter);
        MyDataBeanDao myDataBeanDao = MyApplication.getDaoSession().getMyDataBeanDao();
        List<MyDataBean> list = myDataBeanDao.queryBuilder().build().list();
        if (list!=null&&list.size()>0){

        }else {
            mPresenter.getDuanzi(page+"");
        }
        xrl.setLoadingListener(new XRecyclerView.LoadingListener() {
            @Override
            public void onRefresh() {
                page=1;
                isReftesh=true;
                mPresenter.getDuanzi(page+"");
            }

            @Override
            public void onLoadMore() {
                page++;
                isReftesh=false;
                mPresenter.getDuanzi(page+"");
            }
        });
    }

    @Override
    public void inject() {
        DaggerHttpComponent.builder()
                .build()
                .inject(this);
    }

    @Override
    public void onSuccess(List<DuanziBean.DataBean> list) {
        if (isReftesh){
            adapter.refresh(list);
            xrl.refreshComplete();
        }else {
            adapter.loadMore(list);
            int listNum = adapter.getListNum();
            xrl.loadMoreComplete();
            int size = list.size();
            int count = listNum + size;
            if (count>=20){
                xrl.setLoadingMoreEnabled(false);
            }
        }
    }

}
