package com.odde.atddv2.nodeps.ice;

import Demo.LoginRequest;
import Demo.LoginResponse;
import com.zeroc.Ice.Current;

public class LoginService implements Demo.LoginService {

    @Override
    public LoginResponse login(LoginRequest request, Current current) {
        return null;
    }

}
