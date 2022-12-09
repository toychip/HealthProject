package com.example.demo.board.service;

import com.example.demo.board.entity.Board;
import com.example.demo.board.repostitory.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
//import java.util.List;
import java.util.UUID;

@Service
public class BoardService {
    // 이 services는 controller에서 이용
    @Autowired
    private BoardRepository boardRepository;

    // private BoardRepository boardRepository = new boardrepository;
    // interface라서 객체를 생성할수 없지만
    // Autowired를 사용하면 springbean이 알아서 읽어와서
    // private BoardRepository boardRepository; 에 주입을 해줌 이를 dependency Injection이라고 함


    public void write(Board board, MultipartFile file) throws Exception{
    // 글 작성 처리
        String projectPath = System.getProperty("user.dir") + "//src//main//resources//static//files"; // 프로젝트 경로 지정
        UUID uuid = UUID.randomUUID();                                      // 식별자, 랜덤으로 이름 생성
        String fileName = uuid + "_" + file.getOriginalFilename();    // 랜덤으로 만든 것 뒤에 _와 원래의 파일 이름을 붙여줌
        File saveFile = new File(projectPath, fileName);                    // 파일을 생성해줄건데, projectPath 경로에 넣어줄것이고 이름은 "name"으로 담긴다.
        file.transferTo(saveFile);
        board.setFilename(fileName);
        board.setFilepath("/files/" + fileName);

        boardRepository.save(board);// entity를 넣어줌  그러므로 매개변수를 write()안에 넣어줘야 함
    }


    public Page<Board> boardList(Pageable pageable){
        // 게시물 리스트 처리
        return boardRepository.findAll(pageable);
        // board라는 클래스가 담긴 list를 반환해줌
    }

    public Page<Board> boardSearchList(String searchKeyword, Pageable pageable){

        return boardRepository.findByTitleContaining(searchKeyword, pageable);
    }

    public Board boardView(Integer id){
        //특정 게시글 불러오기 id번 게시물, 1번 게시물 등등

     return boardRepository.findById(id).get();
    }

    public void boardDelete(Integer id){
        boardRepository.deleteById(id);
    }

}
