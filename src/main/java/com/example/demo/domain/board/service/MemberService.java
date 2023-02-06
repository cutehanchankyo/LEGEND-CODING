package com.example.demo.domain.board.service;

import com.example.demo.domain.board.entity.Member;
import com.example.demo.domain.board.presentation.dto.request.MemberRequest;

import java.util.List;
import java.util.Optional;

public interface MemberService {
    void delete(Long seq);
    void add(MemberRequest request);
    void edit(MemberRequest request, Long seq);
    List<Member> viewAll();
    Optional<Member> viewOne(Long seq);
}
