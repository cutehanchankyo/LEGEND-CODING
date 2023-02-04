package com.example.demo.domain.presentation;

import com.example.demo.domain.presentation.dto.request.MemberRequest;
import com.example.demo.domain.service.lmpI.MemberServicelmpI;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/board")
@RequiredArgsConstructor
public class MemberController {

    private final MemberServicelmpI memberService;

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
    public ResponseEntity<Void> add(MemberRequest request){
        memberService.add(request);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/{seq}")
    public ResponseEntity<Void> delete(Long seq){
        memberService.delete(seq);
        return ResponseEntity.ok(null);
    }

    @PutMapping("/{seq}")
    public ResponseEntity<Void> edit(MemberRequest request, Long seq){
        memberService.edit(request,seq);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
