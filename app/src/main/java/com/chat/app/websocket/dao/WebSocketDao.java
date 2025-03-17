package com.chat.app.websocket.dao;


import com.chat.app.websocket.mapper.WebSocketMapper;
import com.chat.app.websocket.vo.WebSocketVo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class WebSocketDao {

    private final WebSocketMapper mapper;


    public int postSaveMessage(String message) {

        WebSocketVo chatMessage = new WebSocketVo(null, "room1", "sender", message, null);
        return mapper.postSaveMessage(chatMessage);}
}//class
