package com.example.demo.domain.board.service;

import com.example.demo.domain.board.entity.Board;
import com.example.demo.domain.board.presentation.dto.request.BoardRequest;

import java.util.List;
import java.util.Optional;

public interface BoardService {
    void delete(Long seq);
    void add(BoardRequest request);
    void edit(BoardRequest request, Long seq);
    List<Board> viewAll();
    Optional<Board> viewOne(Long seq);
}
