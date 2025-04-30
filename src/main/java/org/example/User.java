package org.example;

import java.util.Date;

public class User extends Account {
    private UserProfile profile;
    private String name;
    private int userID;
    private Date dateOfMembership;

    public User(String username, String password, String email,
                String name, int userID, Date dateOfMembership, UserProfile profile) {
        super(username, password, email);
        this.name = name;
        this.userID = userID;
        this.dateOfMembership = dateOfMembership;
        this.profile = profile;
    }

    // Getters and setters
    public UserProfile getProfile() {
        return profile;
    }

    public void setProfile(UserProfile profile) {
        this.profile = profile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public Date getDateOfMembership() {
        return dateOfMembership;
    }

    public void setDateOfMembership(Date dateOfMembership) {
        this.dateOfMembership = dateOfMembership;
    }

    // Behavior methods
    public boolean createPost(String text) {
        // Placeholder logic; actual implementation will go in FacebookSystem
        System.out.println(name + " created a post: " + text);
        return true;
    }

    public boolean sendConnectionInvitation(int userId) {
        // Placeholder logic
        System.out.println("Sent connection invitation to user ID: " + userId);
        return true;
    }

    public boolean followUser(int userId) {
        // Placeholder logic
        System.out.println("Started following user ID: " + userId);
        return true;
    }
}

