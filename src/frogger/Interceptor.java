/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frogger;

/**
 * Class that defines a character type Interceptor that moves towards the
 * player on the x-axis only.
 * @author bluebackdev
 */
public class Interceptor extends Direct {
    /**
     * Constructor, takes in an initial starting x-position and y-position.
     * @param posX Character starting x-position.
     * @param posY Character starting y-position.
     */
    public Interceptor(int posX, int posY) {
        super(posX, posY);
    }
    
    /**
     * Main act method overridden here with specific game logic, compare current
     * character x-position to current player x-position and increment or
     * decrement Interceptor character's x-position to move it closer to the
     * player's x-position.
     * @param playerX Player's current x-position.
     * @param playerY Player's current y-position.
     */
    @Override
    public void act(int playerX, int playerY) {
        /**
         * Temp variable used to hold character x-position because a method
         * call cannot be directly incremented/decremented.
         */
        int tempX = this.getX();
        
        if(!XisGreater(this.getX(), playerX)) {
            tempX++;
            this.setX(tempX);
        }
        else {
            tempX--;
            this.setX(tempX);
        }
    }
    
    /**
     * Overrides getMarker method with Interceptor character's visual game
     * board representation, "I"
     * @return 
     */
    @Override
    public String getMarker() {
        return "I";
    }
}
