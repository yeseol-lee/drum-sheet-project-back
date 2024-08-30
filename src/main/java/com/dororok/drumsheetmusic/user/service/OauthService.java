package com.dororok.drumsheetmusic.user.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OauthService {
    @Value("${spring.security.oauth2.client.registration.google.client-id}")
    private String clientId;

    @Value("${spring.security.oauth2.client.registration.google.client-secret}")
    private String clientSecret;

    private final RestTemplate restTemplate = new RestTemplate();

    public String getUserInfo(String token) {
        String url = "https://www.googleapis.com/oauth2/v3/userinfo?access_token=" + token;
        System.out.println("url: " + url);
        ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
        System.out.println("===========================");
        System.out.println("google get user response: " + response);
        System.out.println("===========================");

        // 구글 검증을 완료했을 경우
        // email으로 이미 가입된 회원인지 조회
        // 1. 신규 회원

        // 2. 기존 회원(google)

        // 3. 기존 회원(naver, local 등 다른 경로로 가입함)
        return response.getBody();
    }
}