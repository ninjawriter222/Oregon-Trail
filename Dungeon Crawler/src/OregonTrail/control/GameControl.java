/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OregonTrail.control;

import OregonTrail.OregonTrail;
import OregonTrail.model.Actor;
import OregonTrail.model.Game;
import OregonTrail.model.InventoryItem;
import OregonTrail.model.Location;
import OregonTrail.model.Map;
import OregonTrail.model.Player;
import OregonTrail.model.Scene;

/**
 *
 * @author MasterCraft Computer
 */
public class GameControl {

    public static Player createPlayer(String playersName) {
        if (playersName == null) {
            return null;
        }
        
        Player player = new Player();
        player.setName(playersName);
        
        OregonTrail.setPlayer(player); // save the player
        
        return player;
    }
    
    public static void createNewGame(Player player) {
        Game game = new Game(); // create new game
        OregonTrail.setCurrentGame(game); // save in Mormon Oregon Trail
        
        game.setPlayer(player); // save player in game
        InventoryItem[] playerInventoryList = GameControl.createPlayerInventoryList();
        player.setInventory(playerInventoryList);
        
        // create the inventory list and save in the game
        InventoryItem[] inventoryList = GameControl.createInventoryList();
        game.setInventory(inventoryList);
        
        Map map = MapControl.createMap(); //create and initialize new map
        game.setMap(map); // save map in game
        
        Actor[] actor = GameControl.createActorList();
        game.setActor(actor); // create game player names
    }

    public static Player savePlayer(String playersName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public enum Item {
        axles,
        wheels,
        tongues,
        oxen,
        bullets,
        food,
        clothing,
        money,
        wagon,
        handcart;
    }

    private static InventoryItem[] createInventoryList() {
        // created array(list) of inventory items
        InventoryItem[] inventory = new InventoryItem[10];
        
        // Axles
        InventoryItem axles = new InventoryItem();
        axles.setType("Store");
        axles.setDescription("Axles");
        axles.setQuantityInStock(10);
        axles.setRequiredAmount(1);
        axles.setCost(10);
        axles.setUnitQuantity(1);
        axles.setUnits("Each");
        inventory[Item.axles.ordinal()] = axles;
        
        // Wheels
        InventoryItem wheels = new InventoryItem();
        wheels.setType("Store");
        wheels.setDescription("Wheels");
        wheels.setQuantityInStock(20);
        wheels.setRequiredAmount(2);
        wheels.setCost(15);
        wheels.setUnitQuantity(1);        
        wheels.setUnits("Each");      
        inventory[Item.wheels.ordinal()] = wheels;

        // Tongues
        InventoryItem tongues = new InventoryItem();
        tongues.setType("Store");
        tongues.setDescription("Tongues");
        tongues.setQuantityInStock(20);
        tongues.setRequiredAmount(1);
        tongues.setCost(5);
        tongues.setUnitQuantity(1);
        tongues.setUnits("Each");
        inventory[Item.tongues.ordinal()] = tongues;

        // Oxen
        InventoryItem oxen = new InventoryItem();
        oxen.setType("Store");
        oxen.setDescription("Oxen");
        oxen.setQuantityInStock(30);
        oxen.setRequiredAmount(2);
        oxen.setCost(20);
        oxen.setUnitQuantity(1);
        oxen.setUnits("Each");
        inventory[Item.oxen.ordinal()] = oxen;

        // Bullets
        InventoryItem bullets = new InventoryItem();
        bullets.setType("Store");
        bullets.setDescription("Bullets");
        bullets.setQuantityInStock(500);
        bullets.setRequiredAmount(100);
        bullets.setCost(12);
        bullets.setUnitQuantity(50);
        bullets.setUnits("Rounds");
        inventory[Item.bullets.ordinal()] = bullets;

        // Food
        InventoryItem food = new InventoryItem();
        food.setType("Store");
        food.setDescription("Food");
        food.setQuantityInStock(500);
        food.setRequiredAmount(150);
        food.setCost(2);
        food.setUnitQuantity(1);
        food.setUnits("Pound");
        inventory[Item.food.ordinal()] = food;

        // Clothes
        InventoryItem clothing = new InventoryItem();
        clothing.setType("Store");
        clothing.setDescription("Clothing");
        clothing.setQuantityInStock(700);
        clothing.setRequiredAmount(75);
        clothing.setCost(1);
        clothing.setUnitQuantity(1);
        clothing.setUnits("Pound");
        inventory[Item.clothing.ordinal()] = clothing;

        // Money
        InventoryItem money = new InventoryItem();
        money.setType("Store");
        money.setDescription("Money");
        money.setQuantityInStock(1000);
        money.setRequiredAmount(250);
        money.setCost(1);
        money.setUnitQuantity(1);
        money.setUnits("Dollar");
        inventory[Item.money.ordinal()] = money;

        // Wagon
        InventoryItem wagon = new InventoryItem();
        wagon.setType("Store");
        wagon.setDescription("Wagon");
        wagon.setQuantityInStock(18);
        wagon.setRequiredAmount(1);
        wagon.setCost(25);
        wagon.setUnitQuantity(1);
        wagon.setUnits("Each");
        inventory[Item.wagon.ordinal()] = wagon;

        // Handcart
        InventoryItem handcart = new InventoryItem();
        handcart.setType("Store");
        handcart.setDescription("Handcart");
        handcart.setQuantityInStock(22);
        handcart.setRequiredAmount(1);
        handcart.setCost(16);
        handcart.setUnitQuantity(1);
        handcart.setUnits("Each");
        inventory[Item.handcart.ordinal()] = handcart;

        return inventory;
    }
    
    private static InventoryItem[] createPlayerInventoryList() {
        // created array(list) of inventory items
        InventoryItem[] inventory = new InventoryItem[10];
        
        // Axles
        InventoryItem axles = new InventoryItem();
        axles.setType("Player");
        axles.setDescription("Axles");
        axles.setQuantityInStock(0);
        axles.setRequiredAmount(0);
        axles.setCost(0);
        axles.setUnitQuantity(1);
        axles.setUnits("Each");
        inventory[Item.axles.ordinal()] = axles;
        
        // Wheels
        InventoryItem wheels = new InventoryItem();
        wheels.setType("Player");
        wheels.setDescription("Wheels");
        wheels.setQuantityInStock(0);
        wheels.setRequiredAmount(0);
        wheels.setCost(0);
        wheels.setUnitQuantity(1);
        wheels.setUnits("Each");
        inventory[Item.wheels.ordinal()] = wheels;

        // Tongues
        InventoryItem tongues = new InventoryItem();
        tongues.setType("Player");
        tongues.setDescription("Tongues");
        tongues.setQuantityInStock(0);
        tongues.setRequiredAmount(0);
        tongues.setCost(0);
        tongues.setUnitQuantity(1);
        tongues.setUnits("Each");
        inventory[Item.tongues.ordinal()] = tongues;

        // Oxen
        InventoryItem oxen = new InventoryItem();
        oxen.setType("Player");
        oxen.setDescription("Oxen");
        oxen.setQuantityInStock(0);
        oxen.setRequiredAmount(0);
        oxen.setCost(0);
        oxen.setUnitQuantity(1);
        oxen.setUnits("Each");
        inventory[Item.oxen.ordinal()] = oxen;

        // Bullets
        InventoryItem bullets = new InventoryItem();
        bullets.setType("Player");
        bullets.setDescription("Bullets");
        bullets.setQuantityInStock(0);
        bullets.setRequiredAmount(0);
        bullets.setCost(0);
        bullets.setUnitQuantity(50);
        bullets.setUnits("Rounds");
        inventory[Item.bullets.ordinal()] = bullets;

        // Food
        InventoryItem food = new InventoryItem();
        food.setType("Player");
        food.setDescription("Food");
        food.setQuantityInStock(0);
        food.setRequiredAmount(0);
        food.setCost(0);
        food.setUnitQuantity(1);
        food.setUnits("Pound");
        inventory[Item.food.ordinal()] = food;

        // Clothes
        InventoryItem clothing = new InventoryItem();
        clothing.setType("Player");
        clothing.setDescription("Clothing");
        clothing.setQuantityInStock(0);
        clothing.setRequiredAmount(0);
        clothing.setCost(0);
        clothing.setUnitQuantity(1);
        clothing.setUnits("Pound");
        inventory[Item.clothing.ordinal()] = clothing;

        // Money
        InventoryItem money = new InventoryItem();
        money.setType("Player");
        money.setDescription("Money");
        money.setQuantityInStock(2000);
        money.setRequiredAmount(0);
        money.setCost(0);
        money.setUnitQuantity(1);
        money.setUnits("Dollar");
        inventory[Item.money.ordinal()] = money;

        // Wagon
        InventoryItem wagon = new InventoryItem();
        wagon.setType("Player");
        wagon.setDescription("Wagon");
        wagon.setQuantityInStock(0);
        wagon.setRequiredAmount(0);
        wagon.setCost(0);
        wagon.setUnitQuantity(1);
        wagon.setUnits("Each");
        inventory[Item.wagon.ordinal()] = wagon;

        // Handcart
        InventoryItem handcart = new InventoryItem();
        handcart.setType("Player");
        handcart.setDescription("Handcart");
        handcart.setQuantityInStock(0);
        handcart.setRequiredAmount(0);
        handcart.setCost(0);
        handcart.setUnitQuantity(1);
        handcart.setUnits("Each");
        inventory[Item.handcart.ordinal()] = handcart;

        return inventory;
    }
    
    public enum Actors {
        brigham,
        mariam,
        william,
        eliza,
        joseph;
    }

    private static Actor[] createActorList() {
        // created array(list) of inventory items
        Actor[] actor = new Actor[5];
        
        // Brigham
        Actor brigham = new Actor();
        brigham.setName("Brigham");
        brigham.setDescription("He is the prophet chosen to lead the church to the Salt Lake Valley.");
        brigham.setRow(0);
        brigham.setColumn(0);
//        brigham.coordinates("");
        actor[Actors.brigham.ordinal()] = brigham;
        
        // Mariam
        Actor mariam = new Actor();
        mariam.setName("Mariam");
        mariam.setDescription("Brigham's wife and confidant.");
        mariam.setRow(0);
        mariam.setColumn(0);
 //       mariam.coordinates("");        
        actor[Actors.mariam.ordinal()] = mariam;

        // William
        Actor william = new Actor();
        william.setName("William");
        william.setDescription("Chosen to be a help and guide for this journey.");
        william.setRow(0);
        william.setColumn(0);
 //       william.coordinates("");        
        actor[Actors.william.ordinal()] = william;

        // Eliza
        Actor eliza = new Actor();
        eliza.setName("Eliza");
        eliza.setDescription("Your first born daughter who is now 17 years old and a very good cook.");
        eliza.setRow(0);
        eliza.setColumn(0);
 //       eliza.coordinates("");
        actor[Actors.eliza.ordinal()] = eliza;

        // Joseph
        Actor joseph = new Actor();
        joseph.setName("Joseph");
        joseph.setDescription("Your youngest child and loyal helper in the family.");
        joseph.setRow(0);
        joseph.setColumn(0);
//        joseph.coordinates("");
        actor[Actors.joseph.ordinal()] = joseph;

        return actor;
    }
    
    static void assignScenesToLocations(Map map, Scene[] scenes){
        Location[][] locations = map.getLocations();
        
        // starting point
        locations[0][0].setScene(scenes[MapControl.SceneType.start.ordinal()]);
        locations[0][1].setScene(scenes[MapControl.SceneType.chariton.ordinal()]);
        locations[0][2].setScene(scenes[MapControl.SceneType.locust.ordinal()]);
        locations[0][3].setScene(scenes[MapControl.SceneType.pisgah.ordinal()]);
        locations[0][4].setScene(scenes[MapControl.SceneType.nishnabotna.ordinal()]);
        locations[0][5].setScene(scenes[MapControl.SceneType.millers.ordinal()]);
        locations[0][6].setScene(scenes[MapControl.SceneType.elkhorn.ordinal()]);
        locations[0][7].setScene(scenes[MapControl.SceneType.murdock.ordinal()]);
        locations[0][8].setScene(scenes[MapControl.SceneType.kearny.ordinal()]);
        locations[0][9].setScene(scenes[MapControl.SceneType.sand.ordinal()]);
        locations[0][10].setScene(scenes[MapControl.SceneType.confluence.ordinal()]);
        locations[0][11].setScene(scenes[MapControl.SceneType.ash.ordinal()]);
        locations[0][12].setScene(scenes[MapControl.SceneType.ancient.ordinal()]);
        locations[1][0].setScene(scenes[MapControl.SceneType.chimney.ordinal()]);
        locations[1][1].setScene(scenes[MapControl.SceneType.scotts.ordinal()]);
        locations[1][2].setScene(scenes[MapControl.SceneType.laramie.ordinal()]);
        locations[1][3].setScene(scenes[MapControl.SceneType.porters.ordinal()]);
        locations[1][4].setScene(scenes[MapControl.SceneType.ayres.ordinal()]);
        locations[1][5].setScene(scenes[MapControl.SceneType.platte.ordinal()]);
        locations[1][6].setScene(scenes[MapControl.SceneType.martins.ordinal()]);
        locations[1][7].setScene(scenes[MapControl.SceneType.rocky.ordinal()]);
        locations[1][8].setScene(scenes[MapControl.SceneType.south.ordinal()]);
        locations[1][9].setScene(scenes[MapControl.SceneType.green.ordinal()]);
        locations[1][10].setScene(scenes[MapControl.SceneType.bridger.ordinal()]);
        locations[1][11].setScene(scenes[MapControl.SceneType.needles.ordinal()]);
        locations[1][12].setScene(scenes[MapControl.SceneType.saltLakeValley.ordinal()]);
    }
    
}
