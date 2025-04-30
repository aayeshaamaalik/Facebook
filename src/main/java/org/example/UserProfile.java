package org.example;

import java.util.List;

public class UserProfile {
    private byte[] profilePicture;
    private byte[] coverPicture;
    private Gender gender;
    private Location location;
    private List<Work> workExperience;
    private List<Education> eduExperience;

    public UserProfile(byte[] profilePicture, byte[] coverPicture, Gender gender,
                       Location location, List<Work> workExperience, List<Education> eduExperience) {
        this.profilePicture = profilePicture;
        this.coverPicture = coverPicture;
        this.gender = gender;
        this.location = location;
        this.workExperience = workExperience;
        this.eduExperience = eduExperience;
    }

    // Getters and setters
    public byte[] getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(byte[] profilePicture) {
        this.profilePicture = profilePicture;
    }

    public byte[] getCoverPicture() {
        return coverPicture;
    }

    public void setCoverPicture(byte[] coverPicture) {
        this.coverPicture = coverPicture;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public List<Work> getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(List<Work> workExperience) {
        this.workExperience = workExperience;
    }

    public List<Education> getEduExperience() {
        return eduExperience;
    }

    public void setEduExperience(List<Education> eduExperience) {
        this.eduExperience = eduExperience;
    }
}

