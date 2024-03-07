package org.nl.parola.vraag;

public abstract class Vraag {

    private boolean isMeerkeuze;

    public boolean isMeerkeuze() {
        return isMeerkeuze;
    }

    public void setMeerkeuze(boolean meerkeuze) {
        isMeerkeuze = meerkeuze;
    }
}
