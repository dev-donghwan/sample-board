package com.donghwan.javaboard.authprovider;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthProviderJpaRepository extends JpaRepository<AuthProvider, Long> {
}
