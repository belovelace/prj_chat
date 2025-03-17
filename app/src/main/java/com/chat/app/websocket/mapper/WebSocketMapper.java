package com.chat.app.websocket.mapper;


import com.chat.app.websocket.vo.WebSocketVo;
import org.apache.ibatis.annotations.Insert;

public interface WebSocketMapper {

    //채팅 저장 API
    @Insert("INSERT INTO MESSAGE (ROOM_NUM, SEND, CONTENT, TIME)\n" +
            "VALUES (#{roomNum}, #{send}, #{content}, NOW())")
    int postSaveMessage(WebSocketVo message);
    
    
    
    
    
}//interface
