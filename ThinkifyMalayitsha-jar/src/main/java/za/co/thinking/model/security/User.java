package za.co.thinking.model.security;

import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;
import za.co.thinking.model.base.BaseEntity;

/**
 * File Name : User.java Project Name : MainThinkify-jar
 *
 * @since Dec 19, 2016, 4:38:42 PM
 * @author Abel Chavanga <achavanga@gmail.com>
 *
 */
@Entity
@XmlRootElement
//@org.hibernate.annotations.Entity(dynamicUpdate = true)
@Table(name = "SYS_USER")
@NamedQueries({
    @NamedQuery(name = User.FIND_ALL, query = "SELECT u FROM User u")})
public class User extends BaseEntity {

    public static final String FIND_ALL = "user.findAll";

    private static final long serialVersionUID = -1781737926912993572L;

    @Column(name = "USER_NAME", nullable = false, length = 60, unique = true)
    private String userName;

    @Column(name = "PASSWORD",  length = 100)
    private String password;

    @Transient
    private Integer incorrectPasswordCounter;
    

    @Column(name = "LAST_SIGNED_IN")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastSignedIn;

    @Column(name = "CHANGE_PASSWORD", nullable = false)
    private Boolean changePassword = false;

    @Enumerated(EnumType.STRING)
    @Column(name = "USER_TYPE", nullable = false)
    private UserType type=UserType.CUSTOMER;


    @Transient
    private String confirmedPassword;

    @OneToOne(targetEntity = Person.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "PERSON_ID")
    private Person person;

    public User() {
    }


    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getIncorrectPasswordCounter() {
        return incorrectPasswordCounter;
    }

    public void setIncorrectPasswordCounter(Integer incorrectPasswordCounter) {
        this.incorrectPasswordCounter = incorrectPasswordCounter;
    }

    public Date getLastSignedIn() {
        return lastSignedIn;
    }

    public void setLastSignedIn(Date lastSignedIn) {
        this.lastSignedIn = lastSignedIn;
    }

    public Boolean getChangePassword() {
        return changePassword;
    }

    public void setChangePassword(Boolean changePassword) {
        this.changePassword = changePassword;
    }

    public String getConfirmedPassword() {
        return confirmedPassword;
    }

    public void setConfirmedPassword(String confirmedPassword) {
        this.confirmedPassword = confirmedPassword;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public UserType getType() {
        return type;
    }

    public void setType(UserType type) {
        this.type = type;
    }


}
