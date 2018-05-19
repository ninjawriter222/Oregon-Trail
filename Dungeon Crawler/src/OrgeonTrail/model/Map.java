/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OrgeonTrail.model;

/**
 *
 * @author hansm
 */
public enum Map {
    
    Nauvoo("Nauvoo","The first place.",new Point(0,0)),
    SugarCreek("Sugar Creek","The second place.",new Point(0,1)),
    RichardsonsPoint("Richardsons Point","The third place.",new Point(0,2)),
    CharitonRiverCrossing("Chariton River Crossing","The fourth place.",new Point(0,3)),
    LocustCreek("Locust Creek","The fifth place.",new Point(0,4)),
    GardenGrove("Garden Grove","The sixth place.",new Point(1,0)),
    Nishnabota("Nishnabota","The seventh place.",new Point(1,1)),
    GrandEncampment("Grand Encampment","The eighth place.",new Point(1,2)),
    CouncilBluffs("Council Bluffs","The ninth place.",new Point(1,3)),
    WinterQuarters("Winter Quarters","The tenth place.",new Point(1,4)),
    ElkhornRiverCrossing("Elkhorn River Crossing","The eleventh place.",new Point(2,0)),
    PlatteRiver("Platte River","The twelfth place.",new Point(2,1)),
    FortKearny("Fort Kearny","The thriteenth place.",new Point(2,2)),
    ConfluencePoint("Confluence Point","The fourteenth place.",new Point(2,3)),
    AshHollow("Ash Hollow","The fifteenth place.",new Point(2,4)),
    ChimneyRock("Chimney Rock","The sixteenth place.",new Point(3,0)),
    ScottsBluff("Scotts Bluff","The seventeenth place.",new Point(3,1)),
    FortLaramie("Fort Laramie","The eighteenth place.",new Point(3,2)),
    SweetwaterRiver("Sweetwater River","The ninteenth place.",new Point(3,3)),
    IndependenceRock("Independence Rock","The twentieth place.",new Point(3,4)),
    FortBridger("Fort Bridger","The twenty-first place.",new Point(4,0)),
    EchoCanyon("Echo Canyon","The twenty-second place.",new Point(4,1)),
    GoldenPassRoad("Golden Pass Road","The twenty-third place.",new Point(4,2)),
    EmigrationCanyon("Emigration Canyon","The twenty-fourth place.",new Point(4,3)),
    Zion("Zion","The last place.",new Point(4,4));
    
    private String name;
    private String description;
    private Point coordinates;

    Map(String name, String description, Point coordinates){
        this.name = name;
        this.description = description;
        this.coordinates = coordinates;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Point getCoordinates() {
        return coordinates;
    }

    @Override
    public String toString() {
        return "Map{" + "name=" + name + ", description=" + description + ", coordinates=" + coordinates + '}';
    }
    
    
    
}
