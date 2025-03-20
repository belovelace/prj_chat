function sendMessage() {
    const messageInput = document.getElementById("messageInput");
    const chatBox = document.getElementById("chatBox");

    if (messageInput.value.trim() === "") return;

    // 새로운 메시지 요소 생성
    const message = document.createElement("div");
    message.classList.add("message", "sent");
    message.textContent = messageInput.value;

    // 채팅 박스에 추가
    chatBox.appendChild(message);
    chatBox.scrollTop = chatBox.scrollHeight;

    // 입력창 초기화
    messageInput.value = "";

    // 테스트용으로 상대방 메시지도 자동 추가
            setTimeout(receiveMessage, 1000);
}


function receiveMessage() {
    const chatBox = document.getElementById("chatBox");

    // 상대방 메시지 요소 생성
    const message = document.createElement("div");
    message.classList.add("message", "received");
    message.textContent = "자동 응답: 안녕하세요!";

    chatBox.appendChild(message);
    chatBox.scrollTop = chatBox.scrollHeight;
}