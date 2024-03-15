package org.nl.parola.antwoord;

public class Antwoord {
    private boolean isGoed;
    private String naam;

    public Antwoord(String naam) {
        this.naam = naam;
    }

    public boolean isGoed() {
        return isGoed;
    }

    public void setGoed(boolean goed) {
        isGoed = goed;
    }

}
