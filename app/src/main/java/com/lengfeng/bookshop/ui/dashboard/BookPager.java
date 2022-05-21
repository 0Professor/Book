package com.lengfeng.bookshop.ui.dashboard;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.lengfeng.bookshop.R;

import java.util.ArrayList;

public class BookPager extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_pager);

        ViewPager viewpaper =  findViewById(R.id.viewpager);
        Log.i("TAG","------>");
        ArrayList<String> titles = new ArrayList();

        titles.add("Page One");
        titles.add("Page Two");
        titles.add("Page Three");

        ArrayList<View> view_list = new ArrayList<View>();

        LayoutInflater li = getLayoutInflater();

        view_list.add(li.inflate(R.layout.activity_book_pager_view_one,null,false));
        view_list.add(li.inflate(R.layout.activity_book_pager_view_two,null,false));
        view_list.add(li.inflate(R.layout.activity_book_pager_view_three,null,false));

        MyPagerAdapter mAdapter =  new MyPagerAdapter(view_list,titles);
        viewpaper.setAdapter(mAdapter);
    }
}