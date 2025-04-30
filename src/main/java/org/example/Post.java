package org.example;

import java.util.Date;
import java.util.List;

public class Post {
    private int postId;
    private String content;
    private Date dateCreated;
    private User createdBy;
    private List<byte[]> images;
    private List<byte[]> videos;

    public Post(int postId, String content, Date dateCreated, User createdBy,
                List<byte[]> images, List<byte[]> videos) {
        this.postId = postId;
        this.content = content;
        this.dateCreated = dateCreated;
        this.createdBy = createdBy;
        this.images = images;
        this.videos = videos;
    }

    // Getters and setters
    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public User getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(User createdBy) {
        this.createdBy = createdBy;
    }

    public List<byte[]> getImages() {
        return images;
    }

    public void setImages(List<byte[]> images) {
        this.images = images;
    }

    public List<byte[]> getVideos() {
        return videos;
    }

    public void setVideos(List<byte[]> videos) {
        this.videos = videos;
    }

    @Override
    public String toString() {
        return "Post{" +
                "postId=" + postId +
                ", content='" + content + '\'' +
                ", createdBy=" + createdBy.getName() +
                ", dateCreated=" + dateCreated +
                ", images=" + (images != null ? images.size() : 0) +
                ", videos=" + (videos != null ? videos.size() : 0) +
                '}';
    }
}

