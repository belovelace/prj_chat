package com.chat.app.websocket.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("websocket")
@RequiredArgsConstructor
public class WebSocketController {

    //채팅방 화면
    @GetMapping("showChatRoom")
    public String index() {return "websocket/chatRoom";}



}//class
