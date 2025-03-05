package com.chat.app.member.controller;

import com.chat.app.member.service.MemberService;
import com.chat.app.member.vo.MemberVo;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/member")
@RequiredArgsConstructor
public class MemberApiController {

    private final MemberService service;

    //회원가입 요청 처리
    @PostMapping("join")
    public String join(@RequestBody MemberVo vo) {
        int result = service.join(vo);

        if(result == 0){
            throw new RuntimeException("[M-000] 회원가입 실패");
        }

        return "redirect:start";//회원가입 화면으로 redirect
    }

    // 로그인 요청 처리
    @PostMapping("login")
    public String login(@RequestBody MemberVo vo, HttpSession session) {

        MemberVo loginMember = service.login(vo);
        if (loginMember == null) {
            return "로그인 실패!";
        }
        // 로그인 성공 시 세션에 회원 정보 저장 (로그아웃할 때까지 유지)
        session.setAttribute("memberVo", loginMember);
        System.out.println("로그인 성공! 세션 ID: " + session.getId());
        return "로그인 성공!";
    }

    // 로그아웃 요청 처리
    @PostMapping("logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "로그아웃 성공!";
    }

    //회원탈퇴 요청 처리


}//class
