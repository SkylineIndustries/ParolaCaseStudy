package org.nl.parola.gebruiker;


public class Gebruiker{
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
}
