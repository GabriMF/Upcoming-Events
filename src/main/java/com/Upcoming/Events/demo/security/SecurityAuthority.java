package com.upcoming.events.demo.security;

import org.springframework.security.core.GrantedAuthority;
import com.upcoming.events.demo.models.Authority;


public class SecurityAuthority implements GrantedAuthority{
    
    private final Authority authority;

 
    public SecurityAuthority(Authority authority) {
        this.authority = authority;
    }

    @Override
    public String getAuthority() {
        return authority.getName().toString();
    }
}
