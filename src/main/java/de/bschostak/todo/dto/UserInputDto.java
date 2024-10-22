package de.bschostak.todo.dto;

public class UserInputDto {

    private String userInput;

    public UserInputDto() {
    }

    public UserInputDto(String userInput) {
        this.userInput = userInput;
    }

    public void setUserInput(String userInput) {
        this.userInput = userInput;
    }

    public String getUserInput() {
        return this.userInput;
    }

    @Override
    public String toString() {
        return "{" +
            " userInput='" + getUserInput() + "'" +
            "}";
    }

    
    

}
