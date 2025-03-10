package com.chat.app.websocket.config;



import com.chat.app.websocket.handler.WebSocketHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;


/**
 * 웹 소켓 연결 설정, cors 정책, 엔드포인트 담당
 * cors 정책 모두 허용함
 * 엔드포인트 /ws/chat
 */
@Configuration
@EnableWebSocket
@RequiredArgsConstructor
public class WebSocketConfig implements WebSocketConfigurer {

    //WebSocketHandler Bean 등록
    @Bean
    public WebSocketHandler webSocketHandler() {
        return new WebSocketHandler();
    }


    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
        registry.addHandler(new WebSocketHandler(), "/ws/chat")
                .setAllowedOrigins("*"); // CORS 정책 허용
    }


}//class
