package com.chat.app.websocket.dao;


import com.chat.app.websocket.mapper.WebSocketMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class WebSocketDao {

    private final WebSocketMapper mapper;


    public int postSaveMessage(String message) {return mapper.postSaveMessage(message);}
}//class
