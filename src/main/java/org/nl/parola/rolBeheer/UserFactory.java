package org.nl.parola.rolBeheer;

public abstract class UserFactory {
    
    public abstract String getEmail();

    public abstract String getPassword();

    @Override
    public String toString() {
        return "UserFactory{" + "email=" + getEmail() + ", password=" + getPassword() + '}';
    }
}
