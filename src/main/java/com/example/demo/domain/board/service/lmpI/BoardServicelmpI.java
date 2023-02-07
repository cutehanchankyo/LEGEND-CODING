package com.example.demo.domain.board.service.lmpI;
import com.example.demo.domain.board.entity.Board;
import com.example.demo.domain.board.presentation.dto.request.BoardRequest;
import com.example.demo.domain.board.repository.BoardRepository;
import com.example.demo.domain.board.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;


@Service
@RequiredArgsConstructor
public class BoardServicelmpI implements BoardService {

    private final BoardRepository memberResposiroty;

    @Override
    @Transactional
    public void delete(Long seq){
        memberResposiroty.deleteById(seq);
    }

    @Override
    @Transactional
    public void add(BoardRequest request){
        Board member = Board.builder()
                .title(request.getTitle())
                .content(request.getContent())
                .name(request.getName())
                .build();

        memberResposiroty.save(member);
    }

    @Override
    @Transactional
    public void edit(BoardRequest request, Long seq){
        Board getEntity = memberResposiroty.findById(seq)
                .orElseThrow(()->new RuntimeException());
        getEntity.update(request.getContent(), request.getTitle());

        memberResposiroty.save(getEntity);
    }

    @Override
    @Transactional
    public List<Board> viewAll(){
         List<Board> memberList = memberResposiroty.findAll();
        return memberList;
    }

    @Override
    @Transactional
    public Optional<Board> viewOne(Long seq){
        Optional<Board> member = memberResposiroty.findBySeq(seq);
        return member;
    }
}
