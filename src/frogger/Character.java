/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frogger;

/**
 * This is the main superclass that all other character classes are derived from.
 * It contains basic information about the character's position (x and y
 * member variables and inspectors), as well as a member variable to hold
 * the character's visual representation for drawing on the game board.
 * @author bluebackdev
 */
public abstract class Character {
    /**
     * Used to keep track of the character's position.
     */
    private int posX;
    private int posY;
    
    /**
     * Used to keep track of the character's visual representation when
     * drawn on the game board.
     */
    private String marker;
    
    /**
     * Main (and only) constructor, takes in an x and a y value to set initial
     * location on the game board.
     * @param posX Character's initial x-position.
     * @param posY Character's initial y-position.
     */
    public Character(int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
    }
    
    /**
     * Inspector that returns the character's current x-position.
     * @return Character's x-position.
     */
    public int getX() {
        return this.posX;
    }
    
    /**
     * Inspector that returns the character's current y-position.
     * @return Character's y-position.
     */
    public int getY() {
        return this.posY;
    }
    
    /**
     * Inspector that returns the character's visual representation which is
     * a letter stored in a string.
     * @return Character's visual representation.
     */
    public abstract String getMarker();
    
    /**
     * Abstract method defined here as it is used by all derived classes to
     * perform their specific movements, takes in the player x and y positions
     * to perform actions based on character location in relation to player
     * location.
     * @param playerX Player's current x-position.
     * @param playerY Player's current y-position.
     */
    public abstract void act(int playerX, int playerY);
    
    /**
     * Used by the main game logic to determine if character should be drawn
     * this turn or not. Only one derived class, Hider, will have a different
     * return value that will require this function to be overridden.
     * @return True, draw character.
     */
    public boolean isVisible() {
        return true;
    }
    
    /**
     * Used by derived classes to adjust the character's x position based
     * on their own specific game logic, protected to prevent calls from outside
     * the inheritance hierarchy.
     * @param x Set character x-position to input x value.
     */
    protected void setX(int x) {
        this.posX = x;
    }
    
    /**
     * Used by derived classes to adjust the character's y position based
     * on their own specific game logic, protected to prevent calls from outside
     * the inheritance hierarchy.
     * @param y Set character x-position to input y value.
     */
    protected void setY(int y) {
        this.posY = y;
    }
}
