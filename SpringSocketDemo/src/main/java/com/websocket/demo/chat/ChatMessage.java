package com.websocket.demo.chat;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Builder
@Setter
public class ChatMessage {
    private String content;
    private String timestamp;
    private String sender;
    private MessageType type;
    private int count;
    public static int updateCount;

    public void setCount(int n){
        count = n;
    }

    public static int UpdateCountIncrease(){
        updateCount++;
        return updateCount;
    }
    public static int UpdateCountDecrease(){
        updateCount--;
        return updateCount;
    }

}
