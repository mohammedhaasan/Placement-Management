package com.edubridge.placement.Employer.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.edubridge.placement.Employer.Model.User;



public class CustomUserDetailsService implements UserDetailsService {
	
	@Autowired
	private com.edubridge.placement.Employer.Repository.UserRepository repo;
	
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		
		User user = repo.findByEmail(email);
        if (user == null) {
            throw new UsernameNotFoundException("User not found");
        }
		
        return new CustomUserDetails(user);
	}

}

