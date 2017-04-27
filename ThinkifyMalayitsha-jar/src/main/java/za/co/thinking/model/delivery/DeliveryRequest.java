/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.thinking.model.delivery;

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
import za.co.thinking.model.base.BaseEntity;

/**
 *
 * @author achavanga
 */
@Entity
@Table()
public class DeliveryRequest extends BaseEntity {

    @Column(name = "DESCRIPTION", nullable = false, length = 1000)
    private String description;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "DELIVERY_REQUEST_ATTACHMENTS",
            joinColumns = @JoinColumn(name = "ATTACHMENT_ID"),
            inverseJoinColumns = @JoinColumn(name = "DELIVER_REQUEST_ID"))
    private Set<Attachment> attachments = new HashSet<Attachment>();

    @Column(name = "FROM_COUNTRY", nullable = false, length = 50)
    private String fromCountry;

    @Column(name = "FROM_CITY", nullable = false, length = 50)
    private String fromCity;

    @Column(name = "FROM_SURBURB", nullable = false, length = 50)
    private String fromSurburb;

    @Column(name = "TO_COUNTRY", nullable = false, length = 50)
    private String toCountry;

    @Column(name = "TO_CITY", nullable = false, length = 50)
    private String toCity;

    @Column(name = "TO_SURBURB", nullable = false, length = 50)
    private String toSurburb;

    @Column(name = "DEPARTURE_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date departureDate;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<Attachment> getAttachments() {
        return attachments;
    }

    public void setAttachments(Set<Attachment> attachments) {
        this.attachments = attachments;
    }

    public String getFromCountry() {
        return fromCountry;
    }

    public void setFromCountry(String fromCountry) {
        this.fromCountry = fromCountry;
    }

    public String getFromCity() {
        return fromCity;
    }

    public void setFromCity(String fromCity) {
        this.fromCity = fromCity;
    }

    public String getFromSurburb() {
        return fromSurburb;
    }

    public void setFromSurburb(String fromSurburb) {
        this.fromSurburb = fromSurburb;
    }

    public String getToCountry() {
        return toCountry;
    }

    public void setToCountry(String toCountry) {
        this.toCountry = toCountry;
    }

    public String getToCity() {
        return toCity;
    }

    public void setToCity(String toCity) {
        this.toCity = toCity;
    }

    public String getToSurburb() {
        return toSurburb;
    }

    public void setToSurburb(String toSurburb) {
        this.toSurburb = toSurburb;
    }

    public Date getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(Date departureDate) {
        this.departureDate = departureDate;
    }
    
    
}
