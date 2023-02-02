package com.example.demo.domain.service;

import com.example.demo.domain.entity.Member;
import com.example.demo.domain.presentation.dto.request.MemberRequest;

import java.util.List;

public interface MemberService {
    void delete(Long seq);
    void add(MemberRequest request);
    void edit(MemberRequest request, Long seq);
    List<Member> viewAll();
}
