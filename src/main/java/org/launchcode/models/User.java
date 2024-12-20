package org.launchcode.models;

import jakarta.annotation.Nullable;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class User {
    @NotBlank(message = "Username required")
    @Size(min = 5, max = 15, message = "Username must be between 5 and 15 characters long")
    private String username;

    @Email(message = "Invalid email try again")
    private String email;

    @Min(value = 6, message = "Needs to be at least 6 characters long")
    @NotBlank(message = "Password required")
    private String password;

    public User() {

    }


    public User(String username, @Nullable String email, String password) {
        this();
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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
}

