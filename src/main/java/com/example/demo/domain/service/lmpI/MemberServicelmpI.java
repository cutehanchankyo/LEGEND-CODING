package com.example.demo.domain.service.lmpI;
import com.example.demo.domain.entity.Member;
import com.example.demo.domain.presentation.dto.request.MemberRequest;
import com.example.demo.domain.repository.MemberResposiroty;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@RequiredArgsConstructor
public class MemberServicelmpI implements com.example.demo.domain.service.MemberService {

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

}
