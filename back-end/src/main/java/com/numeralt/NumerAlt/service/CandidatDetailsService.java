package com.numeralt.NumerAlt.service;

import com.numeralt.NumerAlt.entity.Candidat;
import com.numeralt.NumerAlt.repository.CandidatRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
@Transactional
public class CandidatDetailsService implements UserDetailsService {

    @Autowired
    private CandidatRepositoryInterface candidatRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Candidat candidat = candidatRepository.findByEmail(email);
        if (candidat == null) {
            throw new UsernameNotFoundException("No user found with username: " + email);
        }
        boolean enabled = true;
        boolean accountNonExpired = true;
        boolean credentialsNonExpired = true;
        boolean accountNonLocked = true;
        List<String> roles = Arrays.asList(candidat.getRole());

        return new org.springframework.security.core.userdetails.User(
                candidat.getEmail(), candidat.getMotDePasse().toLowerCase(), enabled, accountNonExpired,
                credentialsNonExpired, accountNonLocked, getAuthorities(roles));
    }

    private static List<GrantedAuthority> getAuthorities (List<String> roles) {
        List<GrantedAuthority> authorities = new ArrayList<>();
        for (String role : roles) {
            authorities.add(new SimpleGrantedAuthority(role));
        }
        return authorities;
    }
}
