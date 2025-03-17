package com.chat.app.websocket.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WebSocketVo {

    private Long id;
    private String roomNum;
    private String send;       // DB 컬럼: 발신자 (예: "SEND")
    private String content;    // DB 컬럼: 메시지 내용 (예: "CONTENT")
    private String timeStamp;  // DB 컬럼: 전송 시각 (예: "TIME")


}//class
