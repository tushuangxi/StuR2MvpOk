package com.config.pad.content.libding.rerxmvp.interfaceUtils;

import com.config.pad.content.libding.entry.GetListRsp;
import com.config.pad.content.libding.entry.MoiveListRsp;

public class interfaceUtilsAll {


    //MoiveList
    public interface IMoiveListView  {

        void onLoading();

        void onLoadSucess(MoiveListRsp moiveListRsp);

        void onLoadFail(String msg);
    }

    //GetListRsp
    public interface IGetListRspView{

        void onLoading();

        void onLoadSucess(GetListRsp getListRsp);

        void onLoadFail(String msg);
    }

}
