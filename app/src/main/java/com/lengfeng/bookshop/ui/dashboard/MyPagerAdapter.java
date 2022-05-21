package com.lengfeng.bookshop.ui.dashboard;


import android.view.View;
import android.view.ViewGroup;

import androidx.viewpager.widget.PagerAdapter;

import java.util.ArrayList;

public class MyPagerAdapter extends PagerAdapter {
    private ArrayList<View> mData;
    private ArrayList<String> mTitle;

    public MyPagerAdapter() {
    }

    public MyPagerAdapter(ArrayList<View> view_list,ArrayList<String> title) {
        super();
        this.mData = view_list;
        this.mTitle = title;
    }

    @Override
    public int getCount() {
        return mData.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        container.addView(mData.get(position));
        return mData.get(position);
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView(mData.get(position));
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mTitle.get(position);
    }
}
