package com.donghwan.javaboard.authprovider.domain;

public interface AuthProvider {
    Long getId();
    Long getUserId();
    String getProviderType();
    String getProviderIdentifier();
}
