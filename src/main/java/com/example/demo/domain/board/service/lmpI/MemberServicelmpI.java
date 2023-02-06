package com.example.demo.domain.board.service.lmpI;
import com.example.demo.domain.board.entity.Member;
import com.example.demo.domain.board.presentation.dto.request.MemberRequest;
import com.example.demo.domain.board.repository.MemberResposiroty;
import com.example.demo.domain.board.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;


@Service
@RequiredArgsConstructor
public class MemberServicelmpI implements MemberService {

    private final MemberResposiroty memberResposiroty;

    @Override
    @Transactional
    public void delete(Long seq){
        memberResposiroty.deleteById(seq);
    }

    @Override
    @Transactional
    public void add(MemberRequest request){
        Member member = Member.builder()
                .title(request.getTitle())
                .content(request.getContent())
                .name(request.getName())
                .build();

        memberResposiroty.save(member);
    }

    @Override
    @Transactional
    public void edit(MemberRequest request,Long seq){
        Member getEntity = memberResposiroty.findById(seq)
                .orElseThrow(()->new RuntimeException());
        getEntity.update(request.getContent(), request.getTitle());

        memberResposiroty.save(getEntity);
    }

    @Override
    @Transactional
    public List<Member> viewAll(){
         List<Member> memberList = memberResposiroty.findAll();
        return memberList;
    }

    @Override
    @Transactional
    public Optional<Member> viewOne(Long seq){
        Optional<Member> member = memberResposiroty.findById(seq);
        return member;
    }
}
