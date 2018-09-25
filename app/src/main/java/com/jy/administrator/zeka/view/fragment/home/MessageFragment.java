package com.jy.administrator.zeka.view.fragment.home;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.jy.administrator.zeka.R;
import com.jy.administrator.zeka.view.fragment.BaseFragment;

/**
 * Created by JY on 2018/9/25 0025.
 */
public class MessageFragment extends BaseFragment implements View.OnClickListener {

    /**
     * UI
     */
    private View mContentView;
    private RelativeLayout mMessageLayout;
    private RelativeLayout mZanLayout;
    private RelativeLayout mImoocLayout;
    private TextView mTipView;
    private TextView mTipZanView;
    private TextView mTipMsgView;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mContext = getActivity();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        mContentView = inflater.inflate(R.layout.fragment_message_layout, container, false);
        initView();
        return mContentView;
    }

    private void initView() {
        mMessageLayout = (RelativeLayout) mContentView.findViewById(R.id.message_layout);
        mImoocLayout = (RelativeLayout) mContentView.findViewById(R.id.imooc_layout);
        mZanLayout = (RelativeLayout) mContentView.findViewById(R.id.zan_layout);
        mTipView = (TextView) mContentView.findViewById(R.id.tip_view);
        mTipZanView = (TextView) mContentView.findViewById(R.id.zan_tip_view);
        mTipMsgView = (TextView) mContentView.findViewById(R.id.unread_tip_view);

        mImoocLayout.setOnClickListener(this);
        mZanLayout.setOnClickListener(this);
        mMessageLayout.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

    }
}
