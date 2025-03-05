package com.chat.app.friends.controller;


import com.chat.app.friends.service.FriendsService;
import com.chat.app.friends.vo.FriendsVo;
import com.chat.app.member.vo.MemberVo;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Enumeration;
import java.util.List;

@RestController
@RequestMapping("api/friends")
@RequiredArgsConstructor
public class FriendsApiController {

    private final FriendsService service;

    @GetMapping("showList")
    public List<FriendsVo> getShowList(HttpSession session) {
        // 현재 세션 ID 출력
        System.out.println("현재 세션 ID: " + session.getId());

        // 세션에 저장된 모든 속성 이름을 출력해서 "memberVo"가 있는지 확인
        Enumeration<String> attrNames = session.getAttributeNames();
        while (attrNames.hasMoreElements()) {
            String attrName = attrNames.nextElement();
            System.out.println("세션 속성: " + attrName);
        }

        // "memberVo" 속성으로 로그인 정보를 꺼냄
        MemberVo memberVo = (MemberVo) session.getAttribute("memberVo");
        if (memberVo == null) {
            throw new IllegalStateException("로그인이 필요합니다.");
        }

        String memberId = memberVo.getId();
        System.out.println("세션에서 가져온 memberId: " + memberId);

        return service.getShowList(memberId);
    }



    //친구 목록 삽입 (친구추가)


    //친구 목록 삭제


}//class
