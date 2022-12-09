package com.example.demo.board.controller;


import com.example.demo.board.entity.Board;
import com.example.demo.board.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class BoardController {
//    @GetMapping("/")
//    @ResponseBody
//    public String  main(){
//        return "이것은 게시판임";
//    }
    @Autowired
    private BoardService boardService;


    @GetMapping("/board/write") // localhost:8090/board/write
    public String boardWriteForm(){
        return "boardwrite"; // 대문자로 하라는 맞춤법같은 건데 무시하면 됨
    }

    @PostMapping("/board/writepro") // ("/board/writepro")가 들어온다면, 아래를 실행해라
    // html form 태그와 일치해야함
    // public String boardWritePro(String title, String content) 매개변수가 많아지면 귀찮아짐. 클래스로 한번에 해결
    public String boardWritePro(Board board, Model model, MultipartFile file) throws Exception {

        boardService.write(board, file);

        //    boardService.write(board); 이렇게 주입을 해줘야하는데 controller 입장에선 boardService.write(board);가 무엇인지 모름
        //        return "redirect:/board/list";

        model.addAttribute("message", "글 작성이 완료되었습니다.");
        model.addAttribute("searchUrl", "/board/list");
        // model에 담겨서 message.html에 보내줌
        return "message";
    }

    @GetMapping("/board/list")
    // 데이터를 담아서 우리가 보는 페이지로 보내주는 것이 model
    public String boardlist(Model model,
                            @PageableDefault(page = 0, size = 10, sort = "id", direction = Sort.Direction.DESC) Pageable pageable,
                            String searchKeyword) {

        Page<Board> list = null;

        if(searchKeyword == null) {
            list = boardService.boardList(pageable);
        }else {
            list = boardService.boardSearchList(searchKeyword, pageable);
        }
        // model.addAttribute("list", boardService.boardList(pageable));

        int nowPage = list.getPageable().getPageNumber() + 1;
        int startPage = Math.max(nowPage - 4, 1);
        int endPage = Math.min(nowPage + 5, list.getTotalPages());

        model.addAttribute("list", list);
        model.addAttribute("nowPage", nowPage);
        model.addAttribute("startPage", startPage);
        model.addAttribute("endPage", endPage);

        // model의 addAttribute를 사용할것이다.
        // 어떤것을 넣어줄 것이냐면
        // list라는 이름으로 보낼건데, 무엇을 보낼 것이냐면 boardService의 boardList 함수를 보낼 것이다.

        return "boardlist";
    }

    @GetMapping("/board/view") // localhost:8090/board/view?id=1
    //parameter라고하고 get방식이라고 함
    public String boardView(Model model, Integer id){
        model.addAttribute("board", boardService.boardView(id));

        return "boardview";
    }

    @GetMapping("/board/delete")
    public String boardDelete(Integer id){
        boardService.boardDelete(id);
        return "redirect:/board/list";
    }



    @GetMapping("/board/modify/{id}")
    public String boardModify(@PathVariable("id") Integer id, Model model){

        model.addAttribute("board", boardService.boardView(id));
        return "boardmodify";
    }

    @PostMapping("/board/update/{id}")
    public String boardUpdate(@PathVariable("id")Integer id, Board board, MultipartFile file) throws Exception{

        Board boardTemp = boardService.boardView(id);   //기존에 있던 글이 담겨져서 옴
        boardTemp.setTitle(board.getTitle());           // 새로 수정한 내용을 기존에 있던걸 가져와서 덮어씌움
        boardTemp.setContent(board.getContent());

        boardService.write(boardTemp, file);

        return "redirect:/board/list";
    }
}
