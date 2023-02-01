package com.example.demo.domain.repository;

import com.example.demo.domain.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface MemberResposiroty extends JpaRepository<Member,Long> {
  Optional<Member> indById(Long seq);
}
