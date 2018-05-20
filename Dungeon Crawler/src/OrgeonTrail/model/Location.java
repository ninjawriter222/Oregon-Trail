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
public class Location implements Serializable {
    
    private Boolean visited;
    private int row;
    private int column;

    public Location() {
    }
    
    

    public Boolean getVisited() {
        return visited;
    }

    public void setVisited(Boolean visited) {
        this.visited = visited;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.visited);
        hash = 53 * hash + Objects.hashCode(this.row);
        hash = 53 * hash + Objects.hashCode(this.column);
        return hash;
    }

    @Override
    public String toString() {
        return "Location{" + "visited=" + visited + ", row=" + row + ", column=" + column + '}';
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
        final Location other = (Location) obj;
        if (!Objects.equals(this.visited, other.visited)) {
            return false;
        }
        if (!Objects.equals(this.row, other.row)) {
            return false;
        }
        if (!Objects.equals(this.column, other.column)) {
            return false;
        }
        return true;
    }
    
    
    
}
