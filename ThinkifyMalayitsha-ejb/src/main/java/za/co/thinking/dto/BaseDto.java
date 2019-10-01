package za.co.thinking.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * File Name : BaseDto.java Project Name : MainThinkify-ejb
 *
 * @since Dec 20, 2016, 10:34:08 AM
 * @author Abel Chavanga <achavanga@gmail.com>
 *
 */
public class BaseDto implements Serializable {

    private static final long serialVersionUID = 1L;
    private int id;
    private Date createdDate;
    boolean active;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

}
