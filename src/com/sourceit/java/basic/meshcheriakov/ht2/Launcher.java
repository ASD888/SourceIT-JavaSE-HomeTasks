package com.sourceit.java.basic.meshcheriakov.ht2;

/**
 * 
 * @author Artur Meshcheriakov
 *
 *         TASK:
 *         Create classes for maze game
 */
public class Launcher {

    String complexity;

    public static void main(String[] args) {
	new Launcher().startGame();
    }

    public void startGame() {
	Player player = new Player("Artur", 26, "male", 178, 76);
	Cell maze = new Cell();
	System.out.println(player);
	System.out.println(maze);
	player.printHealth();

	player.moveStraight(maze);
	player.printHealth();

	player.moveStraight(maze);
	player.printHealth();

	player.moveStraight(maze);
	player.printHealth();

	player.moveRight(maze);
	player.printHealth();

	player.moveLeft(maze);
	player.printHealth();

	player.moveLeft(maze);
	player.printHealth();

	player.moveRight(maze);
	player.printHealth();

	player.moveStraight(maze);
	player.printHealth();

	player.moveRight(maze);
	player.printHealth();

	player.moveStraight(maze);
	player.printHealth();

	player.moveStraight(maze);
	player.printHealth();
    }
}
