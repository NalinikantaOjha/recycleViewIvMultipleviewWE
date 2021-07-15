package com.example.recyclervie4wmultiplewe;

public class ReceverModel extends BaseModel{
    private String Recevermessage;

    public ReceverModel(String recevermessage) {
        Recevermessage = recevermessage;
    }

    public String getRecevermessage() {
        return Recevermessage;
    }

    @Override
    int getViewType() {
        return 1;
    }
}
