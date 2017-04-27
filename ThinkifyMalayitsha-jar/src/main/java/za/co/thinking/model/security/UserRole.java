package za.co.thinking.model.security;

import java.util.Set;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import za.co.thinking.model.base.BaseEntity;

@SuppressWarnings("serial")
@Entity
public class UserRole extends BaseEntity {

//    @NotEmpty
    private String description;

//    @NotNull
    @ElementCollection(fetch = FetchType.LAZY)
    private Set<String> permissions;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<String> getPermissions() {
        return permissions;
    }

    public void setPermissions(Set<String> permissions) {
        this.permissions = permissions;
    }

}
