package com.config.pad.content.libding.rerxmvp.presenter;

import android.util.Log;
import com.config.pad.content.libding.entry.GetListRsp;
import com.config.pad.content.libding.http.ApiManager.ApiRetrofit;
import com.config.pad.content.libding.http.ServiceMapParams;
import com.config.pad.content.libding.rerxmvp.base.AWanBasePresenter;
import com.config.pad.content.libding.rerxmvp.interfaceUtils.interfaceUtilsAll;

//GetListRsp
public class GetListRspPresenter extends AWanBasePresenter<interfaceUtilsAll.IGetListRspView> {

    public void requestGetListRspList(){
        getView().onLoading();
        apiService.requestGetListRspList(ServiceMapParams.getGetListRspMapParams())
                .compose(ApiRetrofit.getScheduler())
                .subscribe( new ApiRetrofit.ApiSubscriber<GetListRsp>() {
                    @Override
                    public void onNext(GetListRsp getListRsp) {
                        if(getListRsp != null) {
                            getView().onLoadSucess(getListRsp);
                        }
                    }

                    @Override
                    public void onError(Throwable t) {
                        Log.e("tag",Log.getStackTraceString(t));
                        getView().onLoadFail(t.getMessage());
                    }
                });
    }
}
