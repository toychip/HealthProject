package com.example.demo.member.dto;


import com.example.demo.member.entity.MemberEntity;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class MemberDTO {
    private Long id;
    private String username;
    private String password;
    private String nickname;
    private int userage;
    private String sex;

    public static MemberDTO toMemberDTO(MemberEntity memberEntity) {
        MemberDTO memberDTO = new MemberDTO();
        memberDTO.setId(memberEntity.getId());
        memberDTO.setUsername(memberEntity.getUsername());
        memberDTO.setPassword(memberEntity.getPassword());
        memberDTO.setNickname(memberEntity.getNickname());
        memberDTO.setUserage(memberEntity.getUserage());
        memberDTO.setSex(memberEntity.getSex());

        return memberDTO;
    }
}
