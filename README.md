# Facebook System

This project implements a **Facebook-style social network system** using **Object-Oriented Design principles**. It models core social media interactions like user registration, posting, following, and sending connection invitations.

**Design Reference:**  
This design is inspired by the [Facebook system from ycwkatie's OOD repository](https://github.com/ycwkatie/OOD-Object-Oriented-Design/blob/main/ood/facebook.md).

---

## Key Components and Interacting Objects

| Class / Interface           | Responsibility                                                                 |
|-----------------------------|---------------------------------------------------------------------------------|
| `Account`, `AccountStatus`  | Base class and enum for user credentials and status.                           |
| `User`, `UserProfile`       | Represents a registered user and their personal details.                       |
| `Work`, `Education`, `Gender`, `Location` | Supporting data classes within the user profile.                       |
| `Post`                      | Represents a user post (text, images, videos).                                 |
| `ConnectionInvitation`, `InvitationStatus` | Models connection requests between users.                            |
| `FacebookSystem`            | Core orchestrator/controller managing users, posts, invitations, and follows. |

---

## Class Hierarchy and Design

```
Account (base class)
   └── User (extends Account)
          └── UserProfile
                ├── List<Work>
                ├── List<Education>
                ├── Gender (enum)
                └── Location

Post
   ├── content (text)
   ├── List<byte[]> images
   └── List<byte[]> videos

ConnectionInvitation
   ├── fromUser
   ├── toUser
   └── status (InvitationStatus enum)

FacebookSystem
   ├── Map<Integer, User>
   ├── List<Post>
   ├── List<ConnectionInvitation>
   └── Map<Integer, Set<Integer>> (following relationships)
```

This structure enables **scalability** and **encapsulation**, with logical divisions between user identity, social interactions, and system coordination.

---

## Supported Functionalities

1. **User Registration**  
   Add new users and assign unique `userID`.

2. **Create Posts**  
   Users can post text, images, and videos.

3. **Follow Users**  
   A user can follow others and get a feed of followed users' posts.

4. **Send Connection Invitations**  
   Users can send, accept, or reject connection requests.

5. **Retrieve Feed**  
   A basic mechanism to get posts from followed users.

---

## Getting Started

To set up and run the project locally:

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/facebook-system.git
   ```

2. Navigate into the project directory:
   ```bash
   cd facebook-system
   ```

3. Open the project in your preferred Java IDE (e.g., IntelliJ IDEA, Eclipse).

4. Compile and run the system.  
   Ensure your environment supports **Java 8+**.

---

## Project Structure

| Folder / Class Group      | Responsibility                                               |
|---------------------------|---------------------------------------------------------------|
| `model/account`           | `Account`, `AccountStatus`, `User`                            |
| `model/profile`           | `UserProfile`, `Work`, `Education`, `Gender`, `Location`      |
| `model/post`              | `Post` class                                                  |
| `model/invitation`        | `ConnectionInvitation`, `InvitationStatus`                    |
| `controller`              | `FacebookSystem` — manages users, posts, invites, follows     |
