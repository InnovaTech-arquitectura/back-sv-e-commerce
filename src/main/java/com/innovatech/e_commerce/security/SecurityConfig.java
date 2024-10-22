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
            .csrf(csrf -> csrf.disable()) // Desactivar CSRF
            .authorizeHttpRequests(auth -> auth
                .requestMatchers("/api/pedidos").permitAll() // Permitir acceso sin autenticación a /api/pedidos
                .requestMatchers("/api/reservas").permitAll() // Permitir acceso sin autenticación a /api/reservas
                .anyRequest().authenticated() // Requiere autenticación para el resto
            )
            .build();
    }
}
