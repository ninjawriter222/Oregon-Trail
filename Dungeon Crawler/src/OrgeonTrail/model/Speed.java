/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OrgeonTrail.model;

import java.io.Serializable;

/**
 *
 * @author MasterCraft Computer
 */
public class Speed implements Serializable
{
double slow = 1;
double normal = 2;
double fast = 3;

    public double getSlow() {
        return slow;
    }

    public void setSlow(double slow) {
        this.slow = slow;
    }

    public double getNormal() {
        return normal;
    }

    public void setNormal(double normal) {
        this.normal = normal;
    }

    public double getFast() {
        return fast;
    }

    public void setFast(double fast) {
        this.fast = fast;
    }


}
