package org.nl.parola.parola;

import org.nl.parola.rolBeheer.DefaultUserFactory;
import org.nl.parola.rolBeheer.UserFactory;

public class Parola {
    DefaultUserFactory userFactory = new DefaultUserFactory();

    public UserFactory registerUser(String email, String password) {
        return registerUser(email, password);
    }
}
