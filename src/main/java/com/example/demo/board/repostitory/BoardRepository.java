package com.example.demo.board.repostitory;


import com.example.demo.board.entity.Board;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardRepository extends JpaRepository<Board,Integer> {
    //                               앞에는 어떤 entity를 쓸것인지, 뒤에는 primary key의 속성이 무엇인지
    Page<Board> findByTitleContaining(String searchKeyword, Pageable pageable);
}
