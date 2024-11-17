package com.innovatech.e_commerce.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http
            .csrf(csrf -> csrf.disable()) 
            .authorizeHttpRequests(auth -> auth
                .requestMatchers("/api/pedidos/**").permitAll() 
                .requestMatchers("/api/reservas/**").permitAll() 
                .requestMatchers("/api/tienda/**").permitAll() 
                .requestMatchers("/api/carrito/**").permitAll()
                .requestMatchers("/api/bazares/**").permitAll()
                .requestMatchers("/api/courses/**").permitAll() 
                .anyRequest().authenticated() 
            )
            .build();
    }
}
