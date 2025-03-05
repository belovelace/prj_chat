package com.chat.app.member.controller;

import com.chat.app.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

    /**
     * json 형태로 view를 반환
     */

@Controller
@RequestMapping("member")
@RequiredArgsConstructor
public class MemberControlller {


    private final MemberService service;


    //회원가입 화면
    @GetMapping("join")
    public String join() { return "member/join"; }

    //로그인
    @GetMapping("login")
    public String login() { return "member/login"; }

    //회원탈퇴
    @GetMapping("cancel")
    public String cancel() { return "member/cancel"; }


}//class
