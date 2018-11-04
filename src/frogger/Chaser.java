/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frogger;

/**
 * This character moves closer to the player character every other turn on
 * both the x and y dimension and can move diagonally.
 * @author bluebackdev
 */
public class Chaser extends Direct {
    /**
     * Main constructor, calls superclass constructor, takes in a starting x
     * and a starting y position.
     * @param posX Character's starting x-position.
     * @param posY Character's starting y-position.
     */
    public Chaser(int posX, int posY) {
        super(posX, posY);
    }
    
    /**
     * Override act method to define custom Chaser character movement style,
     * compares character x/y position to player x/y position and increments/
     * decrements character position to result in a shorter distance between
     * character and player positions.
     * @param playerX Current player x-position.
     * @param playerY Current player y-position.
     */
    @Override
    public void act(int playerX, int playerY) {
        /**
         * Use temp values to store current character x and y positions because
         * method call (this.getX()) cannot be incremented or decremented
         * directly.
         */
        int tempX = this.getX();
        int tempY = this.getY();
        
        if(!XisGreater(this.getX(), playerX)) {
            tempX++;
            this.setX(tempX);
        }
        else {
            tempX--;
            this.setX(tempX);
        }
        
        if(!YisGreater(this.getY(), playerY)) {
            tempY++;
            this.setY(tempY);
        }
        else {
            tempY--;
            this.setY(tempY);
        }
    }
    
    /**
     * Overridden method that returns the character's visual representation
     * on the game board.
     * @return "C"
     */
    @Override
    public String getMarker() {
        return "C";
    }
}
