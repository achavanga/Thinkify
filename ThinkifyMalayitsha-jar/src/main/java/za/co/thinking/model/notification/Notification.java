/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.thinking.model.notification;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import za.co.thinking.model.base.BaseEntity;
import za.co.thinking.model.security.User;

/**
 *
 * @author achavanga
 */
@Entity
@Table()
public class Notification extends BaseEntity {

    @Column(name = "MESSAGE", nullable = false, length = 10000)
    private String message;

    @Column(name = "IS_READ", nullable = false)
    private Boolean isRead = false;

    @Column(name = "GENERATED_BY_SYSTEM", nullable = false)
    private Boolean generatedBySystem = false;

    @Column(name = "SUBJECT", nullable = false)
    private String subject;

    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "from_user_id")
    private User fromUser;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Boolean getIsRead() {
        return isRead;
    }

    public void setIsRead(Boolean isRead) {
        this.isRead = isRead;
    }

    public Boolean getGeneratedBySystem() {
        return generatedBySystem;
    }

    public void setGeneratedBySystem(Boolean generatedBySystem) {
        this.generatedBySystem = generatedBySystem;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public User getFromUser() {
        return fromUser;
    }

    public void setFromUser(User fromUser) {
        this.fromUser = fromUser;
    }
    
    
}
