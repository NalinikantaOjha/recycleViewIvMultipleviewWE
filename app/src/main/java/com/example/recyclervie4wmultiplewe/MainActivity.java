package com.example.recyclervie4wmultiplewe;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity{
    private RecyclerView recyclerView;
    private EditText mEtOption;
    private EditText mEtSendMessage;
    private ImageView mIvSend;
    ArrayList<BaseModel>messagelList=new ArrayList<>();
    private ChatAdapter chatAdapter;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            initView();
            setRecyclerView();



        }

    private void buildList() {
        if (mEtOption.getText().toString().equals("0")){
            messagelList.add(new SenderModel(mEtSendMessage.getText().toString()));

            }else if (mEtOption.getText().toString().equals("1")){
            messagelList.add(new ReceverModel(mEtSendMessage.getText().toString()));
            }
            chatAdapter.notifyDataSetChanged();

    }

    private void setRecyclerView() {
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        chatAdapter=new ChatAdapter(messagelList);
        recyclerView.setAdapter(chatAdapter);

    }

    private void initView() {

            recyclerView=findViewById(R.id.recyclerView);
            mEtOption= findViewById(R.id.etChoice);
            mEtSendMessage=findViewById(R.id.etSendMessage);
            mIvSend=findViewById(R.id.ivSend);
            mIvSend.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    buildList();

                }
            });

    }
}