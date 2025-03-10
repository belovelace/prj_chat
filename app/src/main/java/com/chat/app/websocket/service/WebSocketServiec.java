package com.chat.app.websocket.service;

import com.chat.app.websocket.dao.WebSocketDao;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.socket.client.WebSocketClient;

@Service
@RequiredArgsConstructor
public class WebSocketServiec {

    private final WebSocketDao dao;


    public int postSaveMessage(String message) {return dao.postSaveMessage(message);}
}//class
