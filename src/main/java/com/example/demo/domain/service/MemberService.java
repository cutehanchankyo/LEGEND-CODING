package com.example.demo.domain.service;

import com.example.demo.domain.entity.Member;
import com.example.demo.domain.presentation.dto.request.MemberRequest;

import java.util.List;
import java.util.Optional;

public interface MemberService {
    void delete(Long seq);
    void add(MemberRequest request);
    void edit(MemberRequest request, Long seq);
    List<Member> viewAll();
    Optional<Member> viewOne(Long seq);
}
