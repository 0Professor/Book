package com.lengfeng.bookshop.ui.booklist;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class BookListViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public BookListViewModel() {
        mText = new MutableLiveData<>();

    }

    public LiveData<String> getText() {
        return mText;
    }
}