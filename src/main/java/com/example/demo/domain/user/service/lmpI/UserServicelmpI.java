package com.example.demo.domain.user.service.lmpI;

import com.example.demo.domain.user.entity.User;
import com.example.demo.domain.user.presentation.dto.request.UserRequest;
import com.example.demo.domain.user.repository.UserRepository;
import com.example.demo.global.exception.CustomerException;
import com.example.demo.global.exception.ErrorCode;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServicelmpI {
    private final UserRepository userRepository;

    public void signup(UserRequest userRequest){
        if(userRepository.existsById(userRequest.getId())){
            throw new CustomerException(ErrorCode.MEMBER_ALREADY);
        }
        User user = userRequest.toEntity();
        userRepository.save(user);
    }
}
