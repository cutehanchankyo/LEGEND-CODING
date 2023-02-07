package com.example.demo.domain.board.presentation;

import com.example.demo.domain.board.presentation.dto.request.BoardRequest;
import com.example.demo.domain.board.service.lmpI.BoardServicelmpI;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/board")
@RequiredArgsConstructor
public class BoardController {

    private final BoardServicelmpI memberService;

    @GetMapping
    public ResponseEntity view(){
        memberService.viewAll();
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @GetMapping("/{seq}")
    public ResponseEntity search(Long seq){
        memberService.viewOne(seq);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Void> add(BoardRequest request){
        memberService.add(request);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/{seq}")
    public ResponseEntity<Void> delete(Long seq){
        memberService.delete(seq);
        return ResponseEntity.ok(null);
    }

    @PutMapping("/{seq}")
    public ResponseEntity<Void> edit(BoardRequest request, Long seq){
        memberService.edit(request,seq);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
