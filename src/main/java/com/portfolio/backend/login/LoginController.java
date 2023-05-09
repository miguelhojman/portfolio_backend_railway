package com.portfolio.backend.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

//Éste CORS es para aceptar el front de Firebase:
@CrossOrigin(origins = "https://segunda-front.web.app/")

public class LoginController {
    @Autowired LoginService loginservice;

   /*éste es el primer login-Es estatico compara contra "user" "12345"
    @PostMapping("/login")    
    public boolean loguearse(@RequestBody LoginUser u){
        return("user".equals(u.getUser())&&"12345".equals(u.getPassword()));               
    } 
    */
    
    @PostMapping("/login")    
    public boolean loguearse(@RequestBody LoginUser u){
        LoginUser actual=loginservice.traerCredenciales(1);
        String userActual=actual.getUser();
        String passActual=actual.getPassword();
        return(userActual.equals(u.getUser()) && passActual.equals(u.getPassword()));         
    } 
    @PostMapping("/cambiarcredenciales")
    public boolean cambiarCredenciales(@RequestBody LoginUser u){   
        String nuevoNombreUsuario=u.getUser();
        String nuevoPasswordUsuario=u.getPassword();
        LoginUser nuevoUsuarioPass=new LoginUser(1,nuevoNombreUsuario,nuevoPasswordUsuario);
        loginservice.crearCredenciales(nuevoUsuarioPass);
        return true;
    }
}
