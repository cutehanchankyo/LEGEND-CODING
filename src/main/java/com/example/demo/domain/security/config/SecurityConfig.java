package com.example.demo.domain.security.config;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.autoconfigure.security.ConditionalOnDefaultWebSecurity;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@EnableWebSecurity
@RequiredArgsConstructor
@Configuration(proxyBeanMethods = false)
@ConditionalOnDefaultWebSecurity
@ConditionalOnWebApplication(type = ConditionalOnWebApplication.Type.SERVLET)
public class SecurityConfig {
    /*
     * 스프링 시큐리티 규칙
     */

    @Bean
    @Order(SecurityProperties.BASIC_AUTH_ORDER)
    protected void configure(HttpSecurity http) throws Exception{       // HttpSecurity를 통해 Http 요청에 대한 보안을 설정한다.
        http.csrf().disable();      // Cross site request foreign CSRF 공격방지
        http.authorizeRequests()
                .antMatchers("/login", "/signup", "/style/**", "/js/**", "/img/**").permitAll()     //antMathchers에는  권한 없이 접근을 허가해 줄 페이지 목록들을 적는다.
                .anyRequest().authenticated()
                .and()
                .formLogin()        //로그인과 관련된 부분을 해주면 된다.
                .loginPage("/login")
                .loginProcessingUrl("/loginForm")
                .defaultSuccessUrl("/")
                .and()
                .logout()   //로그아웃과 관련된 설정을 해주면 된다.
                .logoutSuccessUrl("/login")
                .invalidateHttpSession(true);       //세션 전체 삭제
    }

    /*
     * 스프링 시큐리티가 사용자를 인증하는 방법이 담긴 객체
     */

//    @Override
//    public void configure(AuthenticationManagerBuilder auth) {
//
//    }

}
