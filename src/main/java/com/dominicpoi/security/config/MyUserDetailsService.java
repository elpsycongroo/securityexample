package com.dominicpoi.security.config;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Component
public class MyUserDetailsService implements UserDetailsService {


    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return null;
    }
}
