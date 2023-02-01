package com.example.demo.domain.presentation;

import com.example.demo.domain.presentation.dto.request.MemberRequest;
import com.example.demo.domain.service.MemberService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/board")
@AllArgsConstructor
public class MemberController {

    private final MemberService memberService;

    @PostMapping("/add")
    public ResponseEntity<Void> add(MemberRequest request){
        memberService.add(request);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/{seq}")
    public ResponseEntity<Void> delete(MemberRequest request){
        memberService.delete(request);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/{seq}")
    public ResponseEntity<Void> edit(MemberRequest request){
        memberService.edit(request);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
