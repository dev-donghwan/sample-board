package com.donghwan.javaboard.authprovider.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class JpaAuthProvider implements AuthProvider {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    private Long userId;
    private String providerType;
    private String providerIdentifier;

    @Override
    public Long getId() {
        return this.id;
    }

    @Override
    public Long getUserId() {
        return this.userId;
    }

    @Override
    public String getProviderType() {
        return this.providerType;
    }

    @Override
    public String getProviderIdentifier() {
        return this.providerIdentifier;
    }
}
