package za.co.thinking.model.security.contact;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;
import za.co.thinking.model.base.BaseEntity;

/**
 * File Name : Address.java Project Name : MainThinkify-jar
 *
 * @since Dec 19, 2016, 4:47:55 PM
 * @author Abel Chavanga <achavanga@fnb.co.za>
 *
 */
@Entity
//@org.hibernate.annotations.Entity(dynamicUpdate = true)
@Table(name = "ADDRESS")
public class Address extends BaseEntity {

    private static final long serialVersionUID = 1L;
    
    @Column(name = "UNIT_NUMBER", length = 60)
    private String unitNumber;
    @Column(name = "COMPLEX")
    private String complex;
    @Column(name = "STREET", length = 60)
    private String street;
    @Column(name = "SUBURB", length = 60)
    private String suburb;
    @Column(name = "CITY", length = 60)
    private String city;
    @Column(name = "PROVINCE", length = 60)
    private String province;
    @Column(name = "POSTAL_CODE", length = 10)
    private String postalCode;
    @Column(name = "COUNTRY", length = 60)
    private String country;
    @Column(name = "STREET_NUMBER")
    private String streetNumber;
    @Column(name = "STREET_NAME", length = 60)
    private String streetName;
    @Enumerated(EnumType.ORDINAL)
    @Column(name = "ADDRESS_TYPE", nullable = false)
    private AddressType type;

    @Column(name = "POSTAL_SAME_AS_PYSICAL")
    private Boolean postalSameAsPhysical = false;

    @Column(name = "WORK_SAME_AS_PYSICAL")
    private Boolean workSameAsPhysical = false;

    public String getUnitNumber() {
        return unitNumber;
    }

    public void setUnitNumber(String unitNumber) {
        this.unitNumber = unitNumber;
    }

    public String getComplex() {
        return complex;
    }

    public void setComplex(String complex) {
        this.complex = complex;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getSuburb() {
        return suburb;
    }

    public void setSuburb(String suburb) {
        this.suburb = suburb;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public AddressType getType() {
        return type;
    }

    public void setType(AddressType type) {
        this.type = type;
    }

    public Boolean getPostalSameAsPhysical() {
        return postalSameAsPhysical;
    }

    public void setPostalSameAsPhysical(Boolean postalSameAsPhysical) {
        this.postalSameAsPhysical = postalSameAsPhysical;
    }

    public Boolean getWorkSameAsPhysical() {
        return workSameAsPhysical;
    }

    public void setWorkSameAsPhysical(Boolean workSameAsPhysical) {
        this.workSameAsPhysical = workSameAsPhysical;
    }
    
    
}
