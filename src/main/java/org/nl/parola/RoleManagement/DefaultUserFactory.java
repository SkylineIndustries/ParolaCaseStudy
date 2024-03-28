package org.nl.parola.RoleManagement;

public class DefaultUserFactory {

    private static final int credits = 40;

    /**
     * This method would be used as a factory pattern for creating users.
     * When this application requires expansion, then this would be the place to register users or employees.
     *
     * @param email    email of the user or employee, required when making an account.
     * @param password the password used for safety in the application.
     * @return a new role, this could be user or employee, but can be expanded upon to include more roles.
     */
    public UserFactory createRol(String email, String password) {
        //    if () {
        //         return new Gebruiker(email, credits, password, false);
        //    } else {
        //         return new Medewerker(email, password);

        //    }
        return null;
    }
}
