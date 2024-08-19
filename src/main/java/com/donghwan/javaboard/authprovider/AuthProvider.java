package com.donghwan.javaboard.authprovider;

public interface AuthProvider {
    Long getId();
    Long getUserId();
    String getProviderType();
    String getProviderIdentifier();
}
