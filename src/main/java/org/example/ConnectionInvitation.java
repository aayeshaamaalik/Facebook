package org.example;

import java.util.Date;

public class ConnectionInvitation {
    private User fromUser;
    private User toUser;
    private Date invitationDate;
    private InvitationStatus status;

    public ConnectionInvitation(User fromUser, User toUser, Date invitationDate) {
        this.fromUser = fromUser;
        this.toUser = toUser;
        this.invitationDate = invitationDate;
        this.status = InvitationStatus.PENDING;
    }

    // Getters and setters
    public User getFromUser() {
        return fromUser;
    }

    public void setFromUser(User fromUser) {
        this.fromUser = fromUser;
    }

    public User getToUser() {
        return toUser;
    }

    public void setToUser(User toUser) {
        this.toUser = toUser;
    }

    public Date getInvitationDate() {
        return invitationDate;
    }

    public void setInvitationDate(Date invitationDate) {
        this.invitationDate = invitationDate;
    }

    public InvitationStatus getStatus() {
        return status;
    }

    public void setStatus(InvitationStatus status) {
        this.status = status;
    }

    // Business logic
    public void accept() {
        this.status = InvitationStatus.ACCEPTED;
    }

    public void reject() {
        this.status = InvitationStatus.REJECTED;
    }
}
