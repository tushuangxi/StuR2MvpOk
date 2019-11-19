package com.config.pad.content.libding.rerxmvp.presenter;

import com.config.pad.content.libding.entry.MoiveListRsp;
import com.config.pad.content.libding.http.ApiManager.ApiRetrofit;
import com.config.pad.content.libding.rerxmvp.base.AWanBasePresenter;
import com.config.pad.content.libding.rerxmvp.interfaceUtils.interfaceUtilsAll;

//MoiveList
public  class MoiveListPresenter extends AWanBasePresenter<interfaceUtilsAll.IMoiveListView> {

    public void getMoiveList(){
        getView().onLoading();
        apiService.getMoiveList()
                .compose(ApiRetrofit.getScheduler())
                .subscribe( new ApiRetrofit.ApiSubscriber<MoiveListRsp>() {
                    @Override
                    public void onNext(MoiveListRsp moiveListRsp) {
                        if(moiveListRsp != null) {
                            getView().onLoadSucess(moiveListRsp);
                        }
                    }

                    @Override
                    public void onError(Throwable t) {
                        getView().onLoadFail(t.getMessage());
                    }
                });
    }
}