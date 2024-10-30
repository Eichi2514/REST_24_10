package com.koreait.rest_24_10.boundedContext.member.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/member")

public class MemberController {

    @PostMapping("/login")
    public String login() {
        return "성공";
    }

}