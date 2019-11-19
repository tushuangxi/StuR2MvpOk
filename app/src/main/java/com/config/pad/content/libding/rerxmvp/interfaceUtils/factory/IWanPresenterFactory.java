package com.config.pad.content.libding.rerxmvp.interfaceUtils.factory;

import com.config.pad.content.libding.rerxmvp.base.AWanBasePresenter;

/**
 * Function: 工厂接口，提供了创建Presenter的接口方法
 */

public interface IWanPresenterFactory<V, P extends AWanBasePresenter<V>> {

    P createPresenter();
}
