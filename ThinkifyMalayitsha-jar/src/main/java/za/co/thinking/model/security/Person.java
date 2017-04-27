package za.co.thinking.model.security;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import za.co.thinking.model.base.BaseEntity;
import za.co.thinking.model.security.contact.Address;

/**
 * File Name : Person.java Project Name : MainThinkify-jar
 *
 * @since Dec 19, 2016, 4:42:57 PM
 * @author Abel Chavanga <achavanga@fnb.co.za>
 *
 */
@Entity
@XmlRootElement
//@org.hibernate.annotations.Entity(dynamicUpdate = true)
@Table(name = "PERSON")//, uniqueConstraints = @UniqueConstraint(columnNames = "emailAddress"))
public class Person extends BaseEntity {

    private static final long serialVersionUID = -182328686977509674L;

    @Column(name = "NAME", nullable = false, length = 100)
    private String name;

    @Column(name = "MIDDLE_NAME", length = 200)
    private String middleName;

    @Column(name = "SURNAME",  length = 100)
    private String surname;

    @Column(name = "INITIALS", length = 6)
    private String initials;

    @Column(name = "DISPLAY_NAME",  length = 60)
    private String displayName;

    @Column(name = "EMAIL_ADDRESS",  length = 100)
    private String emailAddress;

    @Column(name = "CELLPHONE", length = 20)
    private String cellphoneNumber;

    @Column(name = "ALT_CELLPHONE", length = 20)
    private String alternateCellPhone;

    @Column(name = "DATE_OF_BIRTH")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateOfBirth;

    @Column(name = "ID_NUMBER",  length = 50)
    private String idNumber;

    @Column(name = "ID_TYPE", length = 50)
    private String idType;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "PERSON_ADDRESS",
            joinColumns = @JoinColumn(name = "ADDRESS_ID"),
            inverseJoinColumns = @JoinColumn(name = "PERSON_ID"))
    private Set<Address> addresses = new HashSet<Address>();


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

    public Set<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(Set<Address> addresses) {
        this.addresses = addresses;
    }


}
