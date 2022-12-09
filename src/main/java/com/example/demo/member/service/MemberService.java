package com.example.demo.member.service;


import com.example.demo.member.dto.MemberDTO;
import com.example.demo.member.entity.MemberEntity;
import com.example.demo.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.jetbrains.annotations.NotNull;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;

    public void save(MemberDTO memberDTO) {
        // 1. dto -> entity 변환
        // 2. repository의 save 메서드 호출
        MemberEntity memberEntity = MemberEntity.toMemberEntity(memberDTO);
        memberRepository.save(memberEntity);
        // repository의 save메서드 호출 (조건. entity객체를 넘겨줘야 함)
    }

    public MemberDTO login(@NotNull MemberDTO memberDTO) {
        /*
            1. 회원이 입력한 이메일로 DB에서 조회를 함
            2. DB에서 조회한 비밀번호와 사용자가 입력한 비밀번호가 일치하는지 판단
         */
        Optional<MemberEntity> byusername = memberRepository.findByusername(memberDTO.getUsername());
        if (byusername.isPresent()) {
            // 조회 결과가 있다(해당 아이디를 가진 회원 정보가 있다)
            MemberEntity memberEntity = byusername.get();
            if (memberEntity.getPassword().equals(memberDTO.getPassword())) {
                // 비밀번호 일치
                // entity -> dto 변환 후 리턴
                MemberDTO dto = MemberDTO.toMemberDTO(memberEntity);
                return dto;
            } else {
                // 비밀번호 불일치(로그인실패)
                return null;
            }
        } else {
            // 조회 결과가 없다(해당 아이디를 가진 회원이 없다)
            return null;
        }
    }
    public List<MemberDTO> findAll() {


        List<MemberEntity> memberEntityList = memberRepository
                .findAll(Sort.by(Sort.Direction.DESC, "bigthree"));
        List<MemberDTO> memberDTOList = new ArrayList<>();
        for (MemberEntity memberEntity: memberEntityList) {
            memberDTOList.add(MemberDTO.toMemberDTO(memberEntity));
//            MemberDTO memberDTO = MemberDTO.toMemberDTO(memberEntity);
//            memberDTOList.add(memberDTO);


        }

//        List<Article> list = articleRepository.findAll(Sort.by(Sort.Direction.DESC, "id"));
//        return list;
////
        return memberDTOList;
    }
    public MemberDTO findById(Long id) {
        Optional<MemberEntity> optionalMemberEntity = memberRepository.findById(id);
        if (optionalMemberEntity.isPresent()) {
//            MemberEntity memberEntity = optionalMemberEntity.get();
//            MemberDTO memberDTO = MemberDTO.toMemberDTO(memberEntity);
//            return memberDTO;
            return MemberDTO.toMemberDTO(optionalMemberEntity.get());
        } else {
            return null;
        }
    }
    public MemberDTO updateForm(String username) {
        Optional<MemberEntity> optionalMemberEntity = memberRepository.findByusername(username);
        if (optionalMemberEntity.isPresent()) {
            return MemberDTO.toMemberDTO(optionalMemberEntity.get());
        } else {
            return null;
        }
    }
    public void update(MemberDTO memberDTO) {
        memberRepository.save(MemberEntity.toUpdateMemberEntity(memberDTO));
    }
    public void deleteById(Long id) {
        memberRepository.deleteById(id);
    }
}
