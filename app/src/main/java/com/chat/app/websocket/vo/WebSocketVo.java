package com.chat.app.websocket.vo;

import lombok.Data;

@Data
public class WebSocketVo {

    private Long id;
    private String roomId;
    private String send;       // DB 컬럼: 발신자 (예: "SEND")
    private String content;    // DB 컬럼: 메시지 내용 (예: "CONTENT")
    private String timestamp;  // DB 컬럼: 전송 시각 (예: "TIME")


    public WebSocketVo(Long id, String roomId, String send, String content, String timestamp) {
        this.id = id;
        this.roomId = roomId;
        this.send = send;
        this.content = content;
        this.timestamp = timestamp;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public String getSend() {
        return send;
    }

    public void setSend(String send) {
        this.send = send;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }


    @Override
    public String toString() {
        return "WebSocketVo{" +
                "id=" + id +
                ", roomId='" + roomId + '\'' +
                ", send='" + send + '\'' +
                ", content='" + content + '\'' +
                ", timestamp='" + timestamp + '\'' +
                '}';
    }


    public WebSocketVo() {
        super();
    }




}//class
