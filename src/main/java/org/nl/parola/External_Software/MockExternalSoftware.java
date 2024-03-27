package org.nl.parola.External_Software;

public class MockExternalSoftware implements External_Software {

    /**
     * Mocks the external software that would check if the word exists.
     *
     * @param word the word that has been submitted by the user.
     * @return true if the word exists, false if it doesn't.
     */
    @Override
    public boolean isCorrectWord(String word) {
        return true;
    }
}
