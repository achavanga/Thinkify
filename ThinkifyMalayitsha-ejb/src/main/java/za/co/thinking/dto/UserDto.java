package za.co.thinking.dto;

import java.util.Date;

/**
 * File Name : UserDto.java Project Name : MainThinkify-ejb
 *
 * @since Dec 20, 2016, 10:33:43 AM
 * @author Abel Chavanga <achavanga@fnb.co.za>
 *
 */
public class UserDto extends BaseDto {

    private String userName;
    private String password;
    private Integer incorrectPasswordCounter;
    private Date lastSignedIn;
    private Boolean changePassword = false;
    private String type;
    private String confirmedPassword;
    private PersonDto person;

    public UserDto() {
    }

    public UserDto(String userName, String password, Date lastSignedIn, String confirmedPassword, PersonDto person) {
        this.userName = userName;
        this.password = password;
        this.lastSignedIn = lastSignedIn;
        this.confirmedPassword = confirmedPassword;
        this.person = person;
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

    public PersonDto getPerson() {
        return person;
    }

    public void setPerson(PersonDto person) {
        this.person = person;
    }

}
