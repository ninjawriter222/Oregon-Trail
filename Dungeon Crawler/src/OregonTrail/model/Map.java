package OregonTrail.model;


import OregonTrail.model.Location;
import java.io.Serializable;
import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hansm
 */
public class Map implements Serializable {
    
    private int totalRows;
    private int totalColumns;
    private int currentRow;
    private int currentColumn;
    private Location[][] locations;

    public Map(int rows, int columns) {
        totalRows = rows;
        currentRow = 0;
        totalColumns = columns;
        currentColumn = 0;
        this.locations = new Location[totalRows][totalColumns];
        for(int row = 0; row < totalRows; row++){
            for(int column = 0; column < totalColumns; column++){
                Location location = new Location();
                location.setVisited(Boolean.FALSE);
                location.setScene(null);
                locations[row][column] = location;
            }
            
        }
    }

    public int getTotalRows() {
        return totalRows;
    }

    public void setTotalRows(int totalRows) {
        this.totalRows = totalRows;
    }

    public int getTotalColumns() {
        return totalColumns;
    }

    public void setTotalColumns(int totalColumns) {
        this.totalColumns = totalColumns;
    }

    public int getCurrentRow() {
        return currentRow;
    }

    public void setCurrentRow(int currentRow) {
        this.currentRow = currentRow;
    }

    public int getCurrentColumn() {
        return currentColumn;
    }

    public void setCurrentColumn(int currentColumn) {
        this.currentColumn = currentColumn;
    }

   public Location[][] getLocations() {
        return locations;
    }

    public void setLocations(Location[][] locations) {
        this.locations = locations;
    }

    public Location getCurrentLocation() {
        return locations[currentRow][currentColumn];
    }
}
