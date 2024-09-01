package com.dororok.drumsheetmusic.user.model;

import jakarta.persistence.*;

import lombok.*;
//  import javax.persistence.*;

@Setter
@Getter
@NoArgsConstructor(access= AccessLevel.PROTECTED)
@Table(name="user")
@Entity
public class User {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)    // 프로젝트에 연결된 DB의 numbering 전략을 따른다.
    private int id;    // 시퀀스, auto_increment

    @Column(nullable=false, length=30)
    private String username;

    @Column(nullable=false, length=100)
    private String password;

    @Builder
    public User(int id, String username, String password) {
        this.id=id;
        this.username=username;
        this.password=password;
    }
}
