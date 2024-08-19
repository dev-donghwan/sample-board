package com.donghwan.javaboard.authprovider.infrastructure;

import com.donghwan.javaboard.authprovider.domain.JpaAuthProvider;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthProviderJpaRepository extends JpaRepository<JpaAuthProvider, Long> {
}
