package com.chat.app.friends.service;

import com.chat.app.friends.dao.FriendsDao;
import com.chat.app.friends.vo.FriendsVo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class FriendsService {

    public final FriendsDao dao;



    //친구 목록 조회
    public List<FriendsVo> getShowList(String memberId) {return dao.getShowList(memberId);}


    //친구 목록 삽입 (친구추가)


    //친구 목록 삭제


}//class
