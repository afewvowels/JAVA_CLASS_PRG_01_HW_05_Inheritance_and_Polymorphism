/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frogger;

/**
 * Derived class from Proximity superclass, contains game logic to define
 * a character that toggles its visibility on the game board based on player
 * proximity in a triggerable region.
 * @author bluebackdev
 */
public class Hider extends Proximity {
    /**
     * Counter used to keep track of visibility (0 = visible, 1 = non-visible).
     */
    public int counter = 0;
    
    /**
     * Constructor, takes in an initial x-position and y-position and creates
     * a Hider game object at that location on the game board.
     * @param posX Initial character x-position.
     * @param posY Initial character y-position.
     */
    public Hider(int posX, int posY) {
        super(posX, posY);
    }
    
    /**
     * Overridden act method that checks visibility flag first, if it's not been
     * set to active, the object checks for player proximity, then toggles
     * its visibility based on its current state.
     * @param playerX Current player x-position.
     * @param playerY Current player y-position.
     */
    public void act(int playerX, int playerY) {
        if(!isActive()) {
            isNearby(playerX, playerY);
        }
        
        if(isActive() && this.counter == 0) {
            this.counter = 1;
        }
        else {
            this.counter = 0;
        }
    }
    
    /**
     * Overridden method for displayer Hider character visually on the game
     * board with the string literal of "H"
     * @return Character representation, "H"
     */
    @Override
    public String getMarker() {
        if(counter == 0) {
            return "H";
        }
        else {
            return " ";
        }
    }
}
