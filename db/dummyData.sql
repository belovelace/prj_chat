USE chat_app;

-- USER 테이블 (사용자 3명 추가)
INSERT INTO MEMBER (ID, NAME, PROFILE, PWD, PHONE) VALUES
('user1', '김철수', 'profile1.jpg', 'password123', '010-1234-5678'),
('user2', '이영희', 'profile2.jpg', 'password456', '010-5678-1234'),
('user3', '박민수', 'profile3.jpg', 'password789', '010-8765-4321'),
('user4', '최지훈', 'profile4.jpg', 'password321', '010-4321-8765'),
('user5', '한서연', 'profile5.jpg', 'password654', '010-9876-5432');

-- 친구 요청 (대기 상태)
INSERT INTO FRIENDS (USER_ID, FRIEND_ID, STATUS) VALUES
('user1', 'user2', 'pending'),
('user3', 'user5', 'pending');

-- 친구 요청 승인 (accepted)
INSERT INTO FRIENDS (USER_ID, FRIEND_ID, STATUS) VALUES
('user1', 'user3', 'accepted'),
('user2', 'user4', 'accepted'),
('user4', 'user5', 'accepted');

-- 친구 차단 (blocked)
INSERT INTO FRIENDS (USER_ID, FRIEND_ID, STATUS) VALUES
('user2', 'user5', 'blocked');


-- ROOM 테이블 (1:1 채팅방 2개 생성)
INSERT INTO ROOM (ROOM_ID) VALUES
('room_1_2'), -- user1과 user2의 1:1 채팅방
('room_2_3'); -- user2과 user3의 1:1 채팅방

-- ROOM_USER 테이블 (각 채팅방에 참여하는 유저 추가)
INSERT INTO ROOM_MEMBER (ROOM_NUM, MEMBER_ID) VALUES
(1, 'user1'),
(1, 'user2'),
(2, 'user2'),
(2, 'user3');

-- MESSAGE 테이블 (더미 채팅 메시지)
INSERT INTO MESSAGE (ROOM_NUM, CONTENT, TIME, SEND, EMOJI_NUM) VALUES
(1, '안녕하세요! 잘 지내시죠?', NOW(), 'user1', NULL),
(1, '네! 잘 지내고 있어요.', NOW(), 'user2', NULL),
(2, '이번 주말에 뭐 하세요?', NOW(), 'user2', NULL),
(2, '아직 계획 없어요!', NOW(), 'user3', NULL);

-- EMOJI 테이블 (이모티콘 3개 추가)
INSERT INTO EMOJI (IMG, EMOJI_CTG) VALUES
('emoji_smile.png', '기본'),
('emoji_love.png', '사랑'),
('emoji_thumbsup.png', '긍정');

-- EMOJI_LOG 테이블 (이모티콘 사용 기록)
INSERT INTO EMOJI_LOG (MEMBER_ID, EMOJI_NUM) VALUES
('user1', 1),
('user2', 2),
('user3', 3);

commit
