/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frogger;

import java.util.Random;

/**
 * Jumper is derived from the superclass Proximity and uses that logic to
 * determine if the character should be moving or stationary based on
 * proximity of the player character to the Jumper character (once triggered,
 * movement continues even if player exits the proximity check range).
 * @author bluebackdev
 */
public class Jumper extends Proximity {
    /**
     * Random object used to determine new Jumper character x-position once
     * Jumper character has been activated by player object proximity.
     */
    Random rand = new Random();
    
    /**
     * Constructor, takes in an initial x-position and y-position to spawn
     * a jumper at that location on the game board.
     * @param posX Initial x-position for Jumper character.
     * @param posY Initial y-position for Jumper character.
     */
    public Jumper(int posX, int posY) {
        super(posX, posY);
    }
    
    /**
     * Overridden act method with Jumper character specific logic, test to see
     * if isActive flag has been set, if so, perform random movement.
     * @param playerX
     * @param playerY 
     */
    public void act(int playerX, int playerY) {
        if(!isActive()) {
            isNearby(playerX, playerY);
        }
        
        if(isActive()) {
            this.setX(rand.nextInt(9));
        }
    }
    
    /**
     * Method used to draw the Jumper character on the game board, "J"
     * @return Character's visual representation, "I"
     */
    @Override
    public String getMarker() {
        return "J";
    }
}
