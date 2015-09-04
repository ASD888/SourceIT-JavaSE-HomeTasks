package com.sourceit.java.basic.meshcheriakov.ht2;

import java.util.HashMap;

/**
 * 
 * @author Artur Meshcheriakov
 */
public class Cell {

    private String name;
    private String color;
    private String typeOfWalls;
    HashMap<Integer, Object> rooms = new HashMap<Integer, Object>();

    Cell() {
	this.name = "MAZE";
	this.color = "Grey";
	this.typeOfWalls = "Stone";
	rooms.put(1, new Rooms(true, true, true));
	rooms.put(2, new Rooms(true, true, false));
	rooms.put(3, new Rooms(false, true, false));
	rooms.put(4, new Rooms(true, false, true));
	rooms.put(5, new Rooms(true, false, true));
	rooms.put(6, new Rooms(false, true, true));
	rooms.put(7, new Rooms(true, true, false));
	rooms.put(8, new Rooms(false, true, false));
	rooms.put(9, new Rooms(true, false, true));
	rooms.put(10, new Rooms(true, false, false));

    }

    public void setColor(String color) {
	this.color = color;
    }

    public String getColor() {
	return this.color;
    }

    public void setName(String name) {
	this.color = name;
    }

    public String getName() {
	return this.name;
    }

    public void setTypeOfWalls(String typeOfWalls) {
	this.color = typeOfWalls;
    }

    public String getTypeOfWall() {
	return this.typeOfWalls;
    }

    @Override
    public String toString() {
	String str = "Type of maze: Name - " + this.name + " Color - " + this.color
		+ " Type of walls - " + this.typeOfWalls;
	return str;
    }
}

class Rooms {
    private boolean straightDoor;
    private boolean rightDoor;
    private boolean leftDoor;

    Rooms(boolean straightDoor, boolean rightDoor, boolean leftDoor) {
	this.straightDoor = straightDoor;
	this.rightDoor = rightDoor;
	this.leftDoor = leftDoor;

    }

    public boolean getStraightDoor() {
	return this.straightDoor;
    }

    public boolean getRightDoor() {
	return this.rightDoor;
    }

    public boolean getLeftDoor() {
	return this.leftDoor;
    }

    @Override
    public String toString() {
	String right = (this.rightDoor == true) ? "right door" : "";
	String left = (this.leftDoor == true) ? "left door" : "";
	String straight = (this.straightDoor == true) ? "straight door" : "";
	String str = "You can choose: " + right + " " + left + " " + straight;
	return str;
    }
}
