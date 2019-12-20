package com.springsec.springsecjpadb;

import com.springsec.springsecjpadb.model.MyUserDetails;
import com.springsec.springsecjpadb.model.User;
import com.springsec.springsecjpadb.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User>   user =  userRepository.findByUserName(username);
        user.orElseThrow(() -> new RuntimeException("user not found"));
        return user.map(MyUserDetails::new).get();
    }
}
