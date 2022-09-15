package com.czertainly.core.security.authn;

import org.springframework.http.HttpHeaders;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.web.authentication.WebAuthenticationDetails;

import java.util.Collection;
import java.util.Collections;

public class CzertainlyAuthenticationRequest implements Authentication {

    private final HttpHeaders headers;
    private final WebAuthenticationDetails details;

    public CzertainlyAuthenticationRequest(HttpHeaders headers, WebAuthenticationDetails details) {
        this.headers = headers;
        this.details = details;
    }

    public HttpHeaders getHeaders() {
        return headers;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return Collections.emptyList();
    }

    @Override
    public Object getCredentials() {
        return null;
    }

    @Override
    public WebAuthenticationDetails getDetails() {
        return this.details;
    }

    @Override
    public Object getPrincipal() {
        return null;
    }

    @Override
    public boolean isAuthenticated() {
        return false;
    }

    @Override
    public void setAuthenticated(boolean isAuthenticated) throws IllegalArgumentException {
        if (isAuthenticated) throw new IllegalArgumentException("CzertainlyAuthenticationRequest.isAuthenticated can't be set true.");
    }

    @Override
    public String getName() {
        return null;
    }
}
