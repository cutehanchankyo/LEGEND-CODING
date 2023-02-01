package com.example.demo.domain.service.lmpI;
import com.example.demo.domain.repository.MemberResposiroty;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class MemberServicelmpI implements com.example.demo.domain.service.MemberService {

    private final MemberResposiroty memberResposiroty;

    @Override
    @Transactional
    public void delete(Long seq){
        memberResposiroty.deleteById(seq);
    }
}
