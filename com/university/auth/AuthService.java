package com.university.auth;

import com.university.users.User;

public interface AuthService {

    User login(String username, String password) throws AuthenticationException;

    void logout();

    boolean hasAccess(Role roleRequired);
}
