package com.example.demo.domain.user.service.lmpI;

import com.example.demo.domain.user.entity.User;
import com.example.demo.domain.user.presentation.dto.UserDto;
import com.example.demo.domain.user.presentation.dto.UserUpdateDto;
import com.example.demo.domain.user.repository.UserRepository;
import com.example.demo.domain.user.service.UserService;
import com.example.demo.global.exception.CustomerException;
import com.example.demo.global.exception.ErrorCode;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class UserServicelmpI implements UserService {
    private final UserRepository userRepository;

    @Override
    @Transactional
    public void signup(UserDto userRequest){
        if(userRepository.existsById(userRequest.getId())){
            throw new CustomerException(ErrorCode.MEMBER_ALREADY);
        }
        User user = userRequest.toEntity();
        userRepository.save(user);
    }

    @Override
    @Transactional
    public void update(UserUpdateDto userUpdateDto){
        User user = userRepository.findById(userUpdateDto.getId())
                .orElseThrow(() -> new CustomerException(ErrorCode.NONE_MEMBER));
        user.update(userUpdateDto);
    }
}
