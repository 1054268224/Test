package com.example.rubbishcleanerdemo.Adapter;

import com.example.rubbishcleanerdemo.modle.DataBean;

public interface ItemClickListener {

    void onExpandChildren(DataBean dataBean);

    void onHideChildren(DataBean dataBean);
}
