package org.nl.parola.gebruiker;

import org.nl.parola.rolBeheer.UserFactory;

public class Gebruiker extends UserFactory{
String email;
int credits;
String password;
boolean isAdvanced;

public Gebruiker(String email, int credits, String password, boolean isAdvanced){
    this.email = email;
    this.credits = credits;
    this.password = password;
    this.isAdvanced = isAdvanced;
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
