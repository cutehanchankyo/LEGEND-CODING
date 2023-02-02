package com.example.demo.domain.service;

import com.example.demo.domain.presentation.dto.request.MemberRequest;

public interface MemberService {
    void delete(Long seq);
    void add(MemberRequest request);
    void edit(MemberRequest request, Long seq);
}
