package com.example.demo.member.entity;


import com.example.demo.member.dto.MemberDTO;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

@Entity
@Setter
@Getter
@Table(name = "userdata")
public class MemberEntity {

    @Id // pk 지정
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment
    private Long id;

    @Column(unique = true)
    private String username;

    private String password;
    private String nickname;
    private String sex;
    private int userage;

    @Column(columnDefinition = "int (20) default 0 ")
    private int benchpress;

    @Column(columnDefinition = "int (20) default 0 ")
    private int deadlift;

    @Column(columnDefinition = "int (20) default 0 ")
    private int squat;

    @Column(columnDefinition = "int (20) default 0 ")
    private int bigthree;


    public static MemberEntity toMemberEntity(MemberDTO memberDTO) {
        MemberEntity memberEntity = new MemberEntity();
        memberEntity.setUsername(memberDTO.getUsername());
        memberEntity.setPassword(memberDTO.getPassword());
        memberEntity.setNickname(memberDTO.getNickname());
        memberEntity.setUserage(memberDTO.getUserage());
        memberEntity.setSex(memberDTO.getSex());
        memberEntity.setBenchpress(memberDTO.getBenchpress());
        memberEntity.setDeadlift(memberDTO.getDeadlift());
        memberEntity.setSquat(memberDTO.getSquat());
        memberEntity.setBigthree(memberDTO.getBigthree());

        return memberEntity;
    }

    public static MemberEntity toUpdateMemberEntity(MemberDTO memberDTO) {
        MemberEntity memberEntity = new MemberEntity();
        memberEntity.setId(memberDTO.getId());
        memberEntity.setUsername(memberDTO.getUsername());
        memberEntity.setPassword(memberDTO.getPassword());
        memberEntity.setNickname(memberDTO.getNickname());
        memberEntity.setUserage(memberDTO.getUserage());
        memberEntity.setSex(memberDTO.getSex());
        memberEntity.setBenchpress(memberDTO.getBenchpress());
        memberEntity.setDeadlift(memberDTO.getDeadlift());
        memberEntity.setSquat(memberDTO.getSquat());
        memberEntity.setBigthree(memberDTO.getBigthree());

        return memberEntity;
    }
}
