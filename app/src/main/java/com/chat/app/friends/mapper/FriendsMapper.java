package com.chat.app.friends.mapper;

import com.chat.app.friends.vo.FriendsVo;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface FriendsMapper {

    //친구 목록 조회
    @Select("SELECT \n" +
            "    F.ID AS FRIENDSHIP_ID, \n" +
            "    M.NAME AS FRIEND_NAME, \n" +
            "    M.PROFILE AS FRIEND_PROFILE\n" +
            "FROM FRIENDS F\n" +
            "JOIN MEMBER M ON F.FRIEND_ID = M.ID\n" +
            "WHERE F.USER_ID = #{id} AND F.STATUS = 'accepted';")
    List<FriendsVo> getShowList(String memberId);




}//interface
