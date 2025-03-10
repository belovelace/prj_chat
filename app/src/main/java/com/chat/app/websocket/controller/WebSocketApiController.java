package com.chat.app.websocket.controller;

import com.chat.app.websocket.service.WebSocketServiec;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/websocket")
@RequiredArgsConstructor
public class WebSocketApiController {
    
    private final WebSocketServiec serviec;
    
    
    //채팅 메세지 저장
    @PostMapping("save")
    public String saveMessage(@RequestParam("message") String message) {
        int result = serviec.postSaveMessage(message);
        return result > 0 ? "[200] 메세지 저장 성공" : "[M-001] 메시지 제장 실패";
    }


    
    




}//class
