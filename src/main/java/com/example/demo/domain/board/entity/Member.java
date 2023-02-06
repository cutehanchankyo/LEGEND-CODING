package com.example.demo.domain.board.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Member {
    @Id
    @Column(name = "id")
    private Long seq;

    @Column(name = "name")
    private String name;
    @Column(name = "title")
    private String title;
    @Column(name = "content")
    private String content;

    public void update(String content, String title){
        this.content=content;
        this.title=title;
    }

}
