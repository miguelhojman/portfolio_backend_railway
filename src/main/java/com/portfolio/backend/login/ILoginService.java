package com.portfolio.backend.login;

public interface ILoginService {

    public LoginUser traerCredenciales(Integer id);

    public void crearCredenciales(LoginUser log);

}
