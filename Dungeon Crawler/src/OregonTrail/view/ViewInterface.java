/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OregonTrail.view;

/**
 *
 * @author hansm
 */
public interface ViewInterface {
    public void display();
    public String getInputs();
    public boolean doAction(String inputs);
    public String getInput(String menuText);
}
