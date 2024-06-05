package org.nl.parola.Roles;


import org.nl.parola.Score.IScoreCalculation;
import org.nl.parola.Score.ScoreStrategyBeginning;

public class User {
    private String email;
    private String password;
    private int credits;
    private IScoreCalculation isAdvanced;

    public User(String email, String wachtwoord) {
        this.email = email;
        this.password = wachtwoord;
        this.credits = 1000;
        this.isAdvanced = new ScoreStrategyBeginning();
    }

    public void reduceCredits() {
        this.credits = credits - 40;
    }

    public IScoreCalculation getIsAdvanced() {
        return isAdvanced;
    }

    // Can be called to change advancement level of user
    public void setIsAdvanced(IScoreCalculation isAdvanced) {
        this.isAdvanced = isAdvanced;
    }
}
