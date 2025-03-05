package com.chat.app.friends.vo;

import lombok.Data;

@Data
public class FriendsVo {

    // FRIENDS 테이블의 F.ID (친구 관계 ID)
    private int friendshipId;

    // MEMBER 테이블의 M.NAME (친구 이름)
    private String friendName;

    // MEMBER 테이블의 M.PROFILE (친구 프로필)
    private String friendProfile;

    @Override
    public String toString() {
        return "FriendsVo{" +
                "friendshipId=" + friendshipId +
                ", friendName='" + friendName + '\'' +
                ", friendProfile='" + friendProfile + '\'' +
                '}';
    }

    public int getFriendshipId() {
        return friendshipId;
    }

    public void setFriendshipId(int friendshipId) {
        this.friendshipId = friendshipId;
    }

    public String getFriendName() {
        return friendName;
    }

    public void setFriendName(String friendName) {
        this.friendName = friendName;
    }

    public String getFriendProfile() {
        return friendProfile;
    }

    public void setFriendProfile(String friendProfile) {
        this.friendProfile = friendProfile;
    }

    public FriendsVo() {}


    public FriendsVo(int friendshipId, String friendName, String friendProfile) {
        this.friendshipId = friendshipId;
        this.friendName = friendName;
        this.friendProfile = friendProfile;
    }


}//class
