package com.example.lenovo.zhoukaoyi.dao;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.example.lenovo.zhoukaoyi.bean.MyDataBean;

import com.example.lenovo.zhoukaoyi.dao.MyDataBeanDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig myDataBeanDaoConfig;

    private final MyDataBeanDao myDataBeanDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        myDataBeanDaoConfig = daoConfigMap.get(MyDataBeanDao.class).clone();
        myDataBeanDaoConfig.initIdentityScope(type);

        myDataBeanDao = new MyDataBeanDao(myDataBeanDaoConfig, this);

        registerDao(MyDataBean.class, myDataBeanDao);
    }
    
    public void clear() {
        myDataBeanDaoConfig.clearIdentityScope();
    }

    public MyDataBeanDao getMyDataBeanDao() {
        return myDataBeanDao;
    }

}
