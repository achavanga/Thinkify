/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.thinking.dto;

import java.util.Set;

/**
 *
 * @author achavanga
 */
public class UserRoleDto extends BaseDto{
    
    private String description;
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
