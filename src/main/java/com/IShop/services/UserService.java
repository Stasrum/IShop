package com.IShop.services;

import com.IShop.entites.SystemUser;
import com.IShop.entites.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User findByUserName(String username);
    boolean save(SystemUser systemUser);
}
