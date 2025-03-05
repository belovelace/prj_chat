package com.chat.app.member.mapper;

import com.chat.app.member.vo.MemberVo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
     * Mybatis 혹은 스프링에서 제공하는 인터페이스
     * sql문과 메서드를 1:1 mapping
     * xml 파일과 같은 역할
     */


public interface MemberMapper {

    //회원가입
    @Insert("INSERT INTO MEMBER (ID, NAME, PROFILE, PWD, PHONE) " +
            "VALUES (#{id}, #{name}, #{profile}, #{pwd}, #{phone})")
    int join(MemberVo vo);

    @Select("SELECT ID, NAME, PROFILE, PWD, PHONE FROM MEMBER WHERE ID = #{id} AND PWD = #{pwd}")
    MemberVo login(String id, String pwd);



}//class
