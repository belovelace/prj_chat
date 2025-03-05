package com.chat.app.member.dao;

import com.chat.app.member.mapper.MemberMapper;
import com.chat.app.member.vo.MemberVo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

    /**
     * Data Access Object
     * 데이터베이스 접근 :
     * 역할: Service 계층에서 요청한 DB 접근을 수행하며,
     * Mapper를 통해 실제 쿼리를 실행
     */

@Repository
@RequiredArgsConstructor
public class MemberDao {

    private final MemberMapper mapper;

    //회원가입
    public int join(MemberVo vo) {return mapper.join(vo);}


    //로그인
    public MemberVo login(String id, String pwd) {
        System.out.println("MemberDaoImpl - 호출: ID=" + id + ", PWD=" + pwd);
        return mapper.login(id, pwd);
    }


}//class
