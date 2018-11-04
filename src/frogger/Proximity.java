/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frogger;

import static java.lang.Math.abs;

/**
 * Class derived from Character with proximity based testing methods for use
 * in derived classes Hider and Jumper.
 * @author bluebackdev
 */
public abstract class Proximity extends Character {
    /**
     * Flag is used to determine if player object has been within proximity
     * of character which will set the flag and activate the character.
     */
    private boolean flag = false;
    
    /**
     * Constructor, takes in an initial x-position and y-position to create a
     * character at that location.
     * @param posX Initial character x-position.
     * @param posY Initial character y-position.
     */
    public Proximity(int posX, int posY) {
        super(posX, posY);
    }
    
    /**
     * Main game logic for the Proximity class, tests in a region around the
     * character object to see if the player object is within that region, sets
     * the active flag if that is the case.
     * @param playerX Current player x-position.
     * @param playerY Current player y-position.
     * @return Return true/false based on player proximity.
     */
    protected boolean isNearby(int playerX, int playerY) {
        /**
         * Temp values used to hold character x and y positions for use in
         * math operations with player positions.
         */
        int tempX = this.getX();
        int tempY = this.getY();
        
        /**
         * Used variable to store detection radius for easy adjustment at a
         * later date.
         */
        int detectionRadius = 2;
        
        /**
         * Compare difference between character and player positions to radius,
         * set flag if true.
         */
        if(abs(playerX - tempX) <= detectionRadius
                && abs(playerY - tempY) <= detectionRadius
                || this.flag == true) {
            this.flag = true;
            return isActive();
        }
        else {
            return isActive();
        }
    }
    
    /**
     * Used by derived classes to check flag for active status instead of
     * running proximity check every time act is called.
     * @return Active flag true/false
     */
    protected boolean isActive() {
        if(this.flag == true) {
            return true;
        }
        else {
            return false;
        }
    }
}
