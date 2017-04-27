/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.thinking.model.delivery;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import za.co.thinking.model.base.BaseEntity;

/**
 *
 * @author achavanga
 */
@Entity
@Table()
public class Attachment extends BaseEntity {

    @Column(name = "NAME", nullable = false, length = 300)
    private String name;

    @Column(name = "PATH", nullable = false, length = 300)
    private String path;
    
    @Column(name = "WEIGHT", nullable = false, length = 100)
    private String weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }
    
    

}
