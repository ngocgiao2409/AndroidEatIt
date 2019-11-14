package com.example.androideatitclient.Callback;

import com.example.androideatitclient.Model.BestDealModel;
import com.example.androideatitclient.Model.PopularCategoryModel;

import java.util.List;

public interface IBestDealCallbackListener {
    void onBestDealLoadSuccess(List<BestDealModel> bestDealModels);
    void onBestDealLoadFailed(String message);
}
