package com.portfolio.backend.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService implements ILoginService{
    
    @Autowired ILoginRepository loginrepo;

    @Override
    public LoginUser traerCredenciales(Integer id) {
        return loginrepo.findById(id).orElse(null);
    }

    @Override    public void crearCredenciales(LoginUser log) {
        loginrepo.save(log);
    }
    
}
