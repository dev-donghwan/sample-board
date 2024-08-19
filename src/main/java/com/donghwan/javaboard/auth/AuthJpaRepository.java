package com.donghwan.javaboard.auth;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthJpaRepository extends JpaRepository<Auth, Long> {
}
