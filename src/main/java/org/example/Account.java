package org.example;

public class Account {
    private AccountStatus status;
    private String username;
    private String password;
    private String email;

    public Account(String username, String password, String email) {
        this.status = AccountStatus.ACTIVE;
        this.username = username;
        this.password = password;
        this.email = email;
    }

    // Getters and setters
    public AccountStatus getStatus() {
        return status;
    }

    public void setStatus(AccountStatus status) {
        this.status = status;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean resetPassword() {
        // In real-world: implement reset logic (e.g., token/email flow)
        System.out.println("Resetting password for: " + email);
        return true;
    }
}

