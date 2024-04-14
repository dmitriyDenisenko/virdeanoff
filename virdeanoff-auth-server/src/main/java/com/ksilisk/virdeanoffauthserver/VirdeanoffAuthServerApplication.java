package com.ksilisk.virdeanoffauthserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@SpringBootApplication
public class VirdeanoffAuthServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(VirdeanoffAuthServerApplication.class, args);
    }

    @Bean
    UserDetailsService users() {
        PasswordEncoder encoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
        UserDetails user = User.builder()
                .username("admin")
                .password("admin")
                .passwordEncoder(encoder::encode)
                .roles("USER")
                .build();
        return new InMemoryUserDetailsManager(user);
    }
}
