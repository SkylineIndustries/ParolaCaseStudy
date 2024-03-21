package org.nl.parola.rollen;

import org.nl.parola.rolBeheer.UserFactory;

public class Medewerker extends UserFactory{
    String email;
    String password;
    
    public Medewerker(String email, String password){
        this.email = email;
        this.password = password;
        }
    
    @Override
    public String getEmail() {
        return email;
    }
    
    @Override
    public String getPassword() {
        return password;
    }
    
}
