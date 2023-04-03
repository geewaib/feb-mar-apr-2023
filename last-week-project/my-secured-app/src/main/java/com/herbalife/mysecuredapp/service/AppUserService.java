package com.herbalife.mysecuredapp.service;

import com.herbalife.mysecuredapp.entity.AppUser;
import com.herbalife.mysecuredapp.repository.AppUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AppUserService implements UserDetailsService {

    @Autowired
    private AppUserRepository appUserRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<AppUser> optionalAppUser = appUserRepository.findById(username);
        if (optionalAppUser.isPresent()) {
            AppUser appUser = optionalAppUser.get();
            return User
                    .withUsername(username)
                    .password(appUser.getPassword())
                    .authorities("user")
                    .build();
        } else {
            throw new UsernameNotFoundException(username + " does not exist");
        }
    }

}
