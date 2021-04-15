package com.example.rubbishcleanerdemo.Adapter;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.example.rubbishcleanerdemo.modle.DataBean;
import com.example.rubbishcleanerdemo.R;

import java.util.List;

public class ChildViewHolder extends BaseViewHolder {

    private Context mContext;
    private View view;
    private TextView childLeftText;
    private TextView childRightText;

    public ChildViewHolder(Context context, View itemView) {
        super(itemView);
        mContext = context;
        view = itemView;
    }

    public void bindView(final DataBean dataBean, final int pos){
        childLeftText = (TextView) view.findViewById(R.id.child_left_text);
        childRightText = (TextView) view.findViewById(R.id.child_right_text);
        childLeftText.setText(dataBean.getChildLeftTxt());
        childRightText.setText(dataBean.getChildRightTxt());
    }

}
