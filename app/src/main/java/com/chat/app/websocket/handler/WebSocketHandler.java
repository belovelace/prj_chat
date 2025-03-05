package com.chat.app.websocket.handler;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.AbstractWebSocketHandler;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 웹 소켓 연결을 처리하는 핸들러 클래스
 * 서버에서 발송한 메세지를 처리하는 역할
 * 소켓통신 특성상 1:n 관계. 즉, 한 서버에 여러 클라이언트 접속 가능
 */

@Slf4j
@Component
@RequiredArgsConstructor
public class WebSocketHandler extends TextWebSocketHandler {

    private final ObjectMapper objectMapper = new ObjectMapper();

    //접속 중인 세션 저장
    private final Set<WebSocketSession> sessions = new HashSet<>();

    //소켓 연결 확인
    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {
        sessions.add(session); //새로운 세션 추가(사용자 접속)
        log.info("[새로운 연결]New connection established: {}", session.getId());
    }

    //소켓 연결 종료
    @Override
    public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
        sessions.remove(session);//세션 제거(사용자 연결 종료)
        log.info("[연결 종료]", session.getId());
    }

    //소켓 메세지 처리
    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
        //클라이언트가 보낸 메세지를 역직렬화
        String json = message.getPayload();
        log.info("[수신 메세지]: {}", json);
       //역직렬화
    }



}//class
