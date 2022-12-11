package com.example.demo.board.entity;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;


// JPA가 entity를 보고 읽어드림. board table의 관한 설정인걸 인지. 처리해줌
@Entity
@Data // 이럴때 필요한게 lombok 컨트롤러의 매개변수 대신 클래스를 보내준 후, 함수 속에서 get.~를 쓸 수 있음
public class Board {

    @Id // Primary Key를 의미
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // GenerationType.IDENTITY mysql, mariaDB
    // GenerationType.SEQUENCE oracleDB
    private Integer id; // 게시글 번호
    private String title; // 게시글 제목
    private String content; // 게시글 내용
    private String filename;
    private String filepath;
    private String writer;

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    //    private LocalDateTime createdDate;
//    private LocalDateTime modifiedDate;
}
