package com.example.cashsavings.ui.eqalize;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class EqalizeViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public EqalizeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is eqalize fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}