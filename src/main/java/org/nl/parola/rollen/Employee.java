package org.nl.parola.rollen;

import org.nl.parola.rolBeheer.UserFactory;

public class Employee extends UserFactory{
    String email;
    String password;
    
    public Employee(String email, String password){
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
