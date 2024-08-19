package com.donghwan.javaboard.auth.infrastructure;

import com.donghwan.javaboard.auth.domain.JpaAuth;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthJpaRepository extends JpaRepository<JpaAuth, Long> {
}
