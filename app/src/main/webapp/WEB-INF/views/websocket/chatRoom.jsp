<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="resources/static/CSS/chat.css">
    <link rel="stylesheet" href="resources/static/JS/chat.js">
</head>
<body>

<div class="chat-container">
    <div class="chat-header">채팅방</div>
    <div class="chat-box" id="chatBox">
        <!--메세지가 작성될 예정, 초기에는 비어 있음-->
    </div>
    <div class="chat-input">
        <input type="text" id="messageInput" placeholder="메시지를 입력하세요...">
        <button onclick="sendMessage()">전송</button>
        <button>이모지</button>
    </div>
</div>


</body>
</html>