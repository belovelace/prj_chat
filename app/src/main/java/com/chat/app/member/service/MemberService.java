package com.chat.app.member.service;

import com.chat.app.member.dao.MemberDao;
import com.chat.app.member.mapper.MemberMapper;
import com.chat.app.member.vo.MemberVo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;

    /**
     * 비즈니스 로직 수행
     * 데이터 가공 및 처리
     */

@Service
@RequiredArgsConstructor
@Transactional
public class MemberService {

    private final MemberDao dao;

    //회원가입
    public int join(MemberVo vo) { return dao.join(vo); }

    //로그인
    public MemberVo login(MemberVo vo) {
        System.out.println("MemberService - 로그인 시도: ID=" + vo.getId() + ", PWD=" + vo.getPwd());
        MemberVo member = dao.login(vo.getId(), vo.getPwd());
        if (member == null) {
            System.out.println("MemberService - 로그인 실패: DAO에서 null 반환");
        } else {
            System.out.println("MemberService - 로그인 성공: " + member);
        }
        return member;
    }






}//class
