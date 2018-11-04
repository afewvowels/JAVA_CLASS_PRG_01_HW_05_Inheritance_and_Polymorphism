/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frogger;

/**
 * Subclass of Character and superclass for Direct and Interceptor, this class
 * defines methods used to compare the character position to the players
 * position and return true/false based on the comparison which is used by
 * Direct/Interceptor to determine if position should be incremented or
 * decremented.
 * @author bluebackdev
 */
public abstract class Direct extends Character {
    /**
     * Constructor, passes through character's initial x and y positions.
     * @param posX Character's initial x-position.
     * @param posY Character's initial y-position.
     */
    public Direct(int posX, int posY) {
        super(posX, posY);
    }
    
    /**
     * Method to compare character y-position to player y-position.
     * @param posC Character position.
     * @param posP Player position.
     * @return Character > Player
     */
    protected boolean YisGreater(int posC, int posP) {
        if(posC > posP) {
            return true;
        }
        else {
            return false;
        }
    }
    
    /**
     * Method to compare character x-position to player x-position.
     * @param posC Character position.
     * @param posP Player position.
     * @return Character > Player
     */
    protected boolean XisGreater(int posC, int posP) {
        if(posC > posP) {
            return true;
        }
        else {
            return false;
        }
    }
}
