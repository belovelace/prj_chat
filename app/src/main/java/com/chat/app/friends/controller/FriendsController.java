package com.chat.app.friends.controller;

import com.chat.app.friends.service.FriendsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("friends")
@RequiredArgsConstructor
public class FriendsController {

    //유저 목록 조회
    @GetMapping("showList")
    public String showList(){return "friends/showList";}

    //유저 목록 삽입 (친구추가)
    @GetMapping("addList")
    public String addList(){return "friends/addList";}

    //유저 목록 삭제
    @GetMapping("deleteList")
    public String deleteList(){return "friends/deleteList";}

}//class
