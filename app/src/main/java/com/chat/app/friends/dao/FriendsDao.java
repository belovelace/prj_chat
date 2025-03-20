package com.chat.app.friends.dao;


import com.chat.app.friends.mapper.FriendsMapper;
import com.chat.app.friends.vo.FriendsVo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class FriendsDao {

    public  final FriendsMapper mapper;


    //친구 목록 조회
    public List<FriendsVo> getShowList(String memberId) {return mapper.getShowList(memberId);}

    //친구 추가
    public List<FriendsVo> addList(String memberId) {return mapper.addList(memberId);}


    //친구 목록 삽입 (친구추가)


    //친구 목록 삭제


}//class
