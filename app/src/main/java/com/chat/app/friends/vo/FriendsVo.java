package com.chat.app.friends.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FriendsVo {

    // FRIENDS 테이블의 F.ID (친구 관계 ID)
    private int friendshipId;

    // FRIENDS 테이블의 F.status (친구 관계 상태)
    private String STATUS;

    // FRIENDS 테이블의 F.FRIENDS_ID (친구 아이디)
    private String FRIEND_ID;




    // MEMBER 테이블의 M.NAME (친구 이름)
    private String friendName;

    // MEMBER 테이블의 M.PROFILE (친구 프로필)
    private String friendProfile;






}//class
