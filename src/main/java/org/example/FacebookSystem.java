package org.example;
import java.util.*;

public class FacebookSystem {
    private Map<Integer, User> users;
    private List<Post> posts;
    private List<ConnectionInvitation> invitations;
    private Map<Integer, Set<Integer>> followingMap; // userID -> set of followed userIDs

    public FacebookSystem() {
        this.users = new HashMap<>();
        this.posts = new ArrayList<>();
        this.invitations = new ArrayList<>();
        this.followingMap = new HashMap<>();
    }

    // Add a new user
    public void addUser(User user) {
        users.put(user.getUserID(), user);
        followingMap.putIfAbsent(user.getUserID(), new HashSet<>());
    }

    // Create and add a new post
    public void createPost(Post post) {
        posts.add(post);
    }

    // Send a connection invitation
    public void sendInvitation(User from, User to) {
        ConnectionInvitation invitation = new ConnectionInvitation(from, to, new Date());
        invitations.add(invitation);
        System.out.println("Invitation sent from " + from.getName() + " to " + to.getName());
    }

    // Follow a user
    public void followUser(User follower, User followee) {
        followingMap.computeIfAbsent(follower.getUserID(), k -> new HashSet<>()).add(followee.getUserID());
        System.out.println(follower.getName() + " is now following " + followee.getName());
    }

    // Get user's feed (can be improved with filtering or sorting)
    public List<Post> getFeedForUser(User user) {
        Set<Integer> following = followingMap.getOrDefault(user.getUserID(), new HashSet<>());
        List<Post> feed = new ArrayList<>();
        for (Post post : posts) {
            if (following.contains(post.getCreatedBy().getUserID())) {
                feed.add(post);
            }
        }
        return feed;
    }

    public List<User> getAllUsers() {
        return new ArrayList<>(users.values());
    }

    public List<Post> getAllPosts() {
        return posts;
    }

    public List<ConnectionInvitation> getAllInvitations() {
        return invitations;
    }
}
