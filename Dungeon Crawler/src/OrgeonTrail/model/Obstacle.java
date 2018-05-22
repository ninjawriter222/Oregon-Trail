/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OrgeonTrail.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author hansm
 */
public class Obstacle implements Serializable {
    
    private String name;
    private String description;
    private String type;
    private Float healthValue;
    private Float staminaValue;

    public Obstacle() {
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Float getHealthValue() {
        return healthValue;
    }

    public void setHealthValue(Float healthValue) {
        this.healthValue = healthValue;
    }

    public Float getStaminaValue() {
        return staminaValue;
    }

    public void setStaminaValue(Float staminaValue) {
        this.staminaValue = staminaValue;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.name);
        hash = 97 * hash + Objects.hashCode(this.description);
        hash = 97 * hash + Objects.hashCode(this.type);
        hash = 97 * hash + Objects.hashCode(this.healthValue);
        hash = 97 * hash + Objects.hashCode(this.staminaValue);
        return hash;
    }

    @Override
    public String toString() {
        return "Obstacle{" + "name=" + name + ", description=" + description + ", type=" + type + ", healthValue=" + healthValue + ", staminaValue=" + staminaValue + '}';
    }

    
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Obstacle other = (Obstacle) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        if (!Objects.equals(this.healthValue, other.healthValue)) {
            return false;
        }
        if (!Objects.equals(this.staminaValue, other.staminaValue)) {
            return false;
        }
        return true;
    }

    public void getName(String a_bear) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void getDescription(String a_really_rough_one) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void getType(String hard) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void getHealthValue(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void getStaminaValue(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
