package com.chat.app.websocket.service;

import com.chat.app.websocket.dao.WebSocketDao;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class WebSocketService {

    private final WebSocketDao dao;


    public int postSaveMessage(String message) {return dao.postSaveMessage(message);}
}//class
