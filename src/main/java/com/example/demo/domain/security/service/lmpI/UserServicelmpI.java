package com.example.demo.domain.security.service.lmpI;

import com.example.demo.domain.security.entity.User;
import com.example.demo.domain.security.presentation.dto.request.UserRequest;
import com.example.demo.domain.security.repository.UserRepository;
import com.example.demo.domain.security.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
public class UserServicelmpI implements UserService {

    private final UserRepository userRepository; // final 은 선언부에서 초기화를 하지 않으면 안된다.
    // 회원 정보 추가

    // 선언적 트랜젝션 (메소드, 클래스, 인터페이스)
    @Override
    @Transactional // 트랜잭션 기능이 포함된 프록시 객체가 생성되어 자동으로 commit 혹은 rollback을 진행해준다.
    public boolean save(UserRequest userRequest) {
        if (userRepository.findUserByEmail(userRequest.getEmail()) != null) {
            return false;
        }

        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        userRepository.save(User.builder()
                .email(userRequest.getEmail())
                .password(encoder.encode(userRequest.getPassword()))
                .phone(userRequest.getPhone())
                .name(userRequest.getName())
                .title(null)
                .website(null)
                .profileImgUrl(null)
                .build());
        return true;
    }


}
