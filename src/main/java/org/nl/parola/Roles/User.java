package org.nl.parola.Roles;


public class User {
    private String email;
    private String password;
    private int credits;
    private String isAdvanced;

    public User(String email, String wachtwoord) {
        this.email = email;
        this.password = wachtwoord;
        this.credits = 1000;
        this.isAdvanced = "Amateur";
    }

    public void reduceerCredits() {
        this.credits = credits - 40;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public String getIsAdvanced() {
        return isAdvanced;
    }

    public void setIsAdvanced(String isAdvanced) {
        this.isAdvanced = isAdvanced;
    }
}
