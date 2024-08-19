package com.donghwan.javaboard.auth.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class JpaAuth implements Auth {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    private Long userId;
    private String accessToken;


    @Override
    public Long getId() {
        return this.id;
    }

    @Override
    public Long getUserId() {
        return this.userId;
    }

    @Override
    public String getAccessToken() {
        return this.accessToken;
    }
}
