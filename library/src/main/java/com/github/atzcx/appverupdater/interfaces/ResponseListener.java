package com.github.atzcx.appverupdater.interfaces;


import com.github.atzcx.appverupdater.enums.AppVerUpdaterError;
import com.github.atzcx.appverupdater.models.UpdateModel;

public interface ResponseListener {
    void onSuccess(UpdateModel update);
    void onFailure(AppVerUpdaterError error);
}
