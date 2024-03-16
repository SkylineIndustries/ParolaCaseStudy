package org.nl.parola.parola;

import org.nl.parola.gebruiker.Gebruiker;
import org.nl.parola.rolBeheer.DefaultUserFactory;

public class parola {
    DefaultUserFactory userFactory = new DefaultUserFactory();

    public void registerUser(String username, String password) {
        userFactory.createRol(username, 0);
    }
}
