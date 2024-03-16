package org.nl.parola.rolBeheer;

import org.nl.parola.gebruiker.Gebruiker;

public class DefaultUserFactory implements UserFactory{
        
        public void createRol(String email, int credits) {
        if("" == ""){
           return new Gebruiker(email, credits, "password", false);
        }
        if (""=="") {
         return null;
        }
        }
    
}
