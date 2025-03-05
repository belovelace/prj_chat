-- 참조 관계를 고려하여 DROP 쿼리 순서대로 작성
DROP TABLE IF EXISTS MESSAGE;      -- 메시지 테이블 삭제 (ROOM, MEMBER, EMOJI 참조)
DROP TABLE IF EXISTS FRIENDS;	   -- 친구 관계 테이블 삭제 (MEMBER 참조)
DROP TABLE IF EXISTS ROOM_MEMBER;    -- 채팅 참여자 테이블 삭제 (ROOM, MEMBER 참조)
DROP TABLE IF EXISTS EMOJI_LOG;    -- 이모티콘 사용 로그 테이블 삭제 (MEMBER, EMOJI 참조)
DROP TABLE IF EXISTS EMOJI;        -- 이모티콘 테이블 삭제
DROP TABLE IF EXISTS ROOM;         -- 채팅방 테이블 삭제
DROP TABLE IF EXISTS MEMBER;       -- 회원 테이블 (기존 USER -> MEMBER) 삭제

-- 데이터베이스 재생성
DROP DATABASE IF EXISTS chat_app;
CREATE DATABASE chat_app;
USE chat_app;

-- 회원 테이블 (기존 USER 테이블명을 MEMBER로 변경)
CREATE TABLE MEMBER (
    ID VARCHAR(50) PRIMARY KEY,       -- 회원 ID
    NAME VARCHAR(150) NOT NULL,       -- 회원 이름
    PROFILE VARCHAR(255),             -- 프로필 이미지 등록
    PWD VARCHAR(255) NOT NULL,        -- 비밀번호
    PHONE VARCHAR(20)                 -- 전화번호
);

-- 친구 관계 테이블
CREATE TABLE FRIENDS (
    ID INT AUTO_INCREMENT PRIMARY KEY,        -- 친구 관계 ID
    USER_ID VARCHAR(50) NOT NULL,             -- 친구 요청을 보낸 사용자 (MEMBER.MEMBER_ID 참조)
    FRIEND_ID VARCHAR(50) NOT NULL,           -- 친구 요청을 받은 사용자 (MEMBER.MEMBER_ID 참조)
    STATUS ENUM('pending', 'accepted', 'blocked') DEFAULT 'pending',  -- 친구 요청 상태
    FOREIGN KEY (USER_ID) REFERENCES MEMBER(ID) ON DELETE CASCADE,
    FOREIGN KEY (FRIEND_ID) REFERENCES MEMBER(ID) ON DELETE CASCADE
);

-- 채팅방 테이블
CREATE TABLE ROOM (
    ROOM_NUM INT AUTO_INCREMENT PRIMARY KEY,  -- 채팅방 번호
    ROOM_ID VARCHAR(100) NOT NULL               -- 채팅방 ID
);

-- 채팅 참여자 테이블 (1:N 관계)
CREATE TABLE ROOM_MEMBER (
    ROOM_NUM INT NOT NULL,              -- 채팅방 번호
    MEMBER_ID VARCHAR(50) NOT NULL,         -- 회원 ID (참조: MEMBER.ID)
    PRIMARY KEY (ROOM_NUM, MEMBER_ID),
    FOREIGN KEY (ROOM_NUM) REFERENCES ROOM(ROOM_NUM) ON DELETE CASCADE,
    FOREIGN KEY (MEMBER_ID) REFERENCES MEMBER(ID) ON DELETE CASCADE
);

-- 이모티콘 테이블
CREATE TABLE EMOJI (
    EMOJI_NUM INT AUTO_INCREMENT PRIMARY KEY,  -- 이모티콘 번호
    IMG VARCHAR(255) NOT NULL,                   -- 이모티콘 이미지 경로
    EMOJI_CTG VARCHAR(100)                       -- 이모티콘 카테고리
);

-- 메시지 테이블
CREATE TABLE MESSAGE (
    MSG_ID INT AUTO_INCREMENT PRIMARY KEY,       -- 메시지 ID
    ROOM_NUM INT NOT NULL,                         -- 채팅방 번호 (참조: ROOM.ROOM_NUM)
    CONTENT TEXT,                                  -- 메시지 내용 (긴 텍스트 가능)
    TIME DATETIME DEFAULT CURRENT_TIMESTAMP,       -- 전송 시간 (자동 기록)
    SEND VARCHAR(50) NOT NULL,                     -- 발신자 (참조: MEMBER.ID)
    EMOJI_NUM INT,                                 -- 이모티콘 번호 (참조: EMOJI.EMOJI_NUM)
    FOREIGN KEY (ROOM_NUM) REFERENCES ROOM(ROOM_NUM) ON DELETE CASCADE,
    FOREIGN KEY (SEND) REFERENCES MEMBER(ID) ON DELETE CASCADE,  -- USER -> MEMBER 변경
    FOREIGN KEY (EMOJI_NUM) REFERENCES EMOJI(EMOJI_NUM) ON DELETE SET NULL
);

-- 이모티콘 사용 로그 테이블
CREATE TABLE EMOJI_LOG (
    LOG_NUM INT AUTO_INCREMENT PRIMARY KEY,      -- 로그 번호
    MEMBER_ID VARCHAR(50) NOT NULL,                  -- 회원 ID (참조: MEMBER.ID)
    EMOJI_NUM INT NOT NULL,                        -- 이모티콘 번호 (참조: EMOJI.EMOJI_NUM)
    FOREIGN KEY (MEMBER_ID) REFERENCES MEMBER(ID) ON DELETE CASCADE,  -- USER -> MEMBER 변경
    FOREIGN KEY (EMOJI_NUM) REFERENCES EMOJI(EMOJI_NUM) ON DELETE CASCADE
);
