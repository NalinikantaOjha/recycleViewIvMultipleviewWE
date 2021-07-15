package com.example.recyclervie4wmultiplewe;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class SenderViewHolder extends RecyclerView.ViewHolder {
    private TextView mTvSenderSendMessage;
    public SenderViewHolder(@NonNull  View itemView) {
        super(itemView);
        initView(itemView);

    }

    private void initView(View itemView) {
        mTvSenderSendMessage=itemView.findViewById(R.id.tvSenderMessage);
    }

    public void setData(SenderModel senderModel){
        mTvSenderSendMessage.setText(senderModel.getSendermessage());

    }
}
