package org.nl.parola.rollen;

import org.nl.parola.parola.Parola;


public class Gebruiker {
    private String email;
    private String wachtwoord;
    private int credits;
    private String isGevorderd;

    public Gebruiker(String email, String wachtwoord) {
        this.email = email;
        this.wachtwoord = wachtwoord;
        this.credits = 1000;
        this.isGevorderd = "Amateur";
    }

    public void reduceerCredits(Parola parola){
        this.credits = credits - parola.kostenQuiz;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWachtwoord() {
        return wachtwoord;
    }

    public void setWachtwoord(String wachtwoord) {
        this.wachtwoord = wachtwoord;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public String getIsGevorderd() {
        return isGevorderd;
    }

    public void setIsGevorderd(String isGevorderd) {
        this.isGevorderd = isGevorderd;
    }
}
