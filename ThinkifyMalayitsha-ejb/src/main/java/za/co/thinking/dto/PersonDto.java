package za.co.thinking.dto;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * File Name    : PersonDto.java
 * Project Name : MainThinkify-ejb
 *
 * @since  Dec 20, 2016, 10:33:57 AM
 * @author Abel Chavanga <achavanga@gmail.com>  
 *
 */
public class PersonDto extends BaseDto{

    private static final long serialVersionUID = -3533708846423278415L;

  
    private String name;

    private String middleName;

    private String surname;

    private String initials;

    private String displayName;

    private String emailAddress;

    private String cellphoneNumber;

    private String alternateCellPhone;

    private Date dateOfBirth;

    private String idNumber;

    private String idType;

    private Set<AddressDto> addresses = new HashSet<AddressDto>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getInitials() {
        return initials;
    }

    public void setInitials(String initials) {
        this.initials = initials;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getCellphoneNumber() {
        return cellphoneNumber;
    }

    public void setCellphoneNumber(String cellphoneNumber) {
        this.cellphoneNumber = cellphoneNumber;
    }

    public String getAlternateCellPhone() {
        return alternateCellPhone;
    }

    public void setAlternateCellPhone(String alternateCellPhone) {
        this.alternateCellPhone = alternateCellPhone;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getIdType() {
        return idType;
    }

    public void setIdType(String idType) {
        this.idType = idType;
    }

    public Set<AddressDto> getAddresses() {
        return addresses;
    }

    public void setAddresses(Set<AddressDto> addresses) {
        this.addresses = addresses;
    }
    
    

}
