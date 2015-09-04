package com.sourceit.java.basic.meshcheriakov.ht2;

/**
 * 
 * @author Artur Meshcheriakov
 */
public class Player {

    private String name;
    private int age;
    private String sex;
    private int height;
    private int weight;
    private int health;
    private int location = 0;

    Player(String name, int age, String sex, int height, int weight) {
	this.name = name;
	this.age = age;
	this.sex = sex;
	this.height = height;
	this.weight = weight;
	this.health = 11;
    }

    public void moveStraight(Cell maze) {
	if (location == 5) {
	    location = 0;
	}
	location++;
	if (location == 11) {
	    System.out.println("Congratulations! You WIN!");
	}
	health--;
	if (health == 0) {
	    System.out.println("GAME OVER");
	}
	System.out.println(maze.rooms.get(location));
    }

    public void moveRight(Cell maze) {
	if (location == 1) {
	    location = 0;
	}
	location++;
	health--;
	if (health == 0) {
	    System.out.println("GAME OVER");
	}
	System.out.println(maze.rooms.get(this.location));
    }

    public void moveLeft(Cell maze) {
	if (location == 9) {
	    location = 0;
	}
	location++;
	health--;
	if (health == 0) {
	    System.out.println("GAME OVER");
	}
	System.out.println(maze.rooms.get(this.location));
    }

    public void getSmokeBreak() {
	System.out.println("Rest");
    }

    public int getLocation() {
	return this.location;
    }

    public void printHealth() {
	System.out.println(this.name + " " + this.health);
    }

    @Override
    public String toString() {
	String str = "Name: " + this.name + " Age: " + this.age + " Sex: " + this.sex + " Height: "
		+ this.height + " Weight: " + this.weight;
	return str;
    }
}
