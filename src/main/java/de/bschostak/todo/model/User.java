package de.bschostak.todo.model;

public class User {
    String userInput;

    public String getUserInput() {
        return this.userInput;
    }

    public void setUserInput(String userInput) {
        this.userInput = userInput;
    }

    @Override
    public String toString() {
        return "{" +
            " userInput='" + getUserInput() + "'" +
            "}";
    }
}
