package com.example.recyclervie4wmultiplewe;

public class SenderModel extends BaseModel {
    private String Sendermessage;

    public  SenderModel(String Sendermessage){
        this.Sendermessage=Sendermessage;
    }

    public String getSendermessage() {
        return Sendermessage;
    }

    @Override
    int getViewType() {
        return 0;
    }
}
