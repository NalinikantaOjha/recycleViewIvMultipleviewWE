package com.example.recyclervie4wmultiplewe;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ReceveViewHolder extends RecyclerView.ViewHolder {
    private TextView mTvReceverSendMessage;

    public ReceveViewHolder(@NonNull View itemView) {
        super(itemView);
        intitView(itemView);
        
    }

    private void intitView(View itemView) {
        mTvReceverSendMessage=itemView.findViewById(R.id.tvReceiverMessag);
    }

    public void setData(ReceverModel receverModel){
        mTvReceverSendMessage.setText(receverModel.getRecevermessage());

    }
}
