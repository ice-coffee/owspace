package com.github.baby.owspace.presenter;

import com.github.baby.owspace.model.entity.Item;

import java.util.List;

/**
 * Created by Mr.Yangxiufeng
 * DATE 2016/8/2
 * owspace
 */
public interface ListBaseContract {
    interface ListBasePresenter{
        void getListByPage(int page, int model, String pageId,String deviceId,String createTime);
    }
    interface ListBaseView{
        void showLoading();
        void dismissLoading();
        void showNoData();
        void showNoMore();
        void updateListUI(List<Item> itemList);
        void showOnFailure();
    }
}
