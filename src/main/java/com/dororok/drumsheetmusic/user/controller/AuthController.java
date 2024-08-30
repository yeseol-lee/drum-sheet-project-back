package com.dororok.drumsheetmusic.user.controller;

import com.dororok.drumsheetmusic.user.dto.TokenRequest;
import com.dororok.drumsheetmusic.user.service.OauthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user/auth")
public class AuthController {

    @Autowired
    private OauthService OauthService;

    @PostMapping("/google")
    public String authenticateWithGoogle(@RequestBody TokenRequest tokenRequest) {
        System.out.println("======================================");
        System.out.println("/google 들어옴");
        System.out.println("======================================");

        String token = tokenRequest.getToken();
        System.out.println("token: " + token);
        // 유저 정보를 가져옵니다
        return OauthService.getUserInfo(token);
    }

}