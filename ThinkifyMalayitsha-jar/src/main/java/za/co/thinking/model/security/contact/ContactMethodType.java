package za.co.thinking.model.security.contact;

/**
 * File Name : ContactMethodType.java Project Name : MainThinkify-jar
 *
 * @since Dec 19, 2016, 5:13:57 PM
 * @author Abel Chavanga <achavanga@gmail.com>
 *
 */
public enum ContactMethodType {
    CELL_PHONE("Cell Phone"),
    EMAIL("EMAIL");

    private String description;

    private ContactMethodType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

}
