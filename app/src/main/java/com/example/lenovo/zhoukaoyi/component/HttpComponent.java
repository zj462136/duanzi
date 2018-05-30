package com.example.lenovo.zhoukaoyi.component;

import com.example.lenovo.zhoukaoyi.module.HttpModule;
import com.example.lenovo.zhoukaoyi.ui.duanzi.DuanziFragment;

import dagger.Component;

@Component(modules = HttpModule.class)
public interface HttpComponent {
    void inject(DuanziFragment duanziFragment);
}
