package com.config.pad.content.libding.rerxmvp.interfaceUtils.proxy;

import com.config.pad.content.libding.rerxmvp.base.AWanBasePresenter;
import com.config.pad.content.libding.rerxmvp.interfaceUtils.factory.IWanPresenterFactory;

/**
 * Function: 定义一个代理接口提供设置工厂、获取工厂、获取Presenter的方法,子类可以不使用
 *           注解创建工厂，可以自己实现创建工厂的方法
 */

public interface IPresenterProxy <V,P extends AWanBasePresenter<V>> {

    /**
     * 设置创建Presenter的工厂
     * @param wanPresenterFactory 类型
     */
    void setPresenterFactory(IWanPresenterFactory<V,P> wanPresenterFactory);

    /**
     * 获取Presenter的工厂类
     * @return IWanPresenterFactory
     */
    IWanPresenterFactory<V,P> getPresenterFactory();

    /**
     * 获取创建的Presenter
     * @return 指定类型的Presenter
     */
    P getPresenter();

}
