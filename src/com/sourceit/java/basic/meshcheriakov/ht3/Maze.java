package com.sourceit.java.basic.meshcheriakov.ht3;

/**
 * 
 * @author Artur Meshcheriakov
 *
 *         TASK:
 *         - Create class that has a method public Cell[][] getMaze() (return the array of maze
 *         cells);
 *         - Every cell has fields, that describe walls presence;
 */
public class Maze {

    public Cell[][] getMaze() {
	Cell[][] maze = new Cell[12][19];

	// maze[0][]
	maze[0][0] = new Cell(true, false, true, false);
	maze[0][1] = new Cell(false, false, true, true);
	maze[0][2] = new Cell(false, false, true, false);
	maze[0][3] = new Cell(false, true, true, true);
	maze[0][4] = new Cell(false, false, true, false);
	maze[0][5] = new Cell(false, true, true, true);
	maze[0][6] = new Cell(false, false, true, false);
	maze[0][7] = new Cell(false, false, true, true);
	maze[0][8] = new Cell(false, true, true, false);
	maze[0][9] = new Cell(false, false, false, true);
	maze[0][10] = new Cell(false, false, true, true);
	maze[0][11] = new Cell(false, true, true, false);
	maze[0][12] = new Cell(false, false, true, true);
	maze[0][13] = new Cell(false, false, true, false);
	maze[0][14] = new Cell(false, false, true, true);
	maze[0][15] = new Cell(false, true, true, false);
	maze[0][16] = new Cell(false, false, true, false);
	maze[0][17] = new Cell(false, false, true, true);
	maze[0][18] = new Cell(false, true, true, false);
	// maze[1][]
	maze[1][0] = new Cell(true, true, false, false);
	maze[1][1] = new Cell(false, true, false, false);
	maze[1][2] = new Cell(false, false, false, false);
	maze[1][3] = new Cell(false, true, false, false);
	maze[1][4] = new Cell(false, false, false, false);
	maze[1][5] = new Cell(false, true, false, false);
	maze[1][6] = new Cell(false, false, false, true);
	maze[1][7] = new Cell(false, true, false, false);
	maze[1][8] = new Cell(false, false, false, false);
	maze[1][9] = new Cell(false, true, false, true);
	maze[1][10] = new Cell(false, true, false, false);
	maze[1][11] = new Cell(false, true, false, false);
	maze[1][12] = new Cell(false, true, false, true);
	maze[1][13] = new Cell(false, true, false, false);
	maze[1][14] = new Cell(false, true, false, false);
	maze[1][15] = new Cell(false, true, false, false);
	maze[1][16] = new Cell(false, false, false, true);
	maze[1][17] = new Cell(false, true, false, false);
	maze[1][18] = new Cell(false, true, false, false);
	// maze[2][]
	maze[2][0] = new Cell(true, true, false, false);
	maze[2][1] = new Cell(false, true, false, true);
	maze[2][2] = new Cell(false, true, false, true);
	maze[2][3] = new Cell(false, false, false, true);
	maze[2][4] = new Cell(false, true, false, true);
	maze[2][5] = new Cell(false, false, false, true);
	maze[2][6] = new Cell(false, false, false, true);
	maze[2][7] = new Cell(false, true, false, true);
	maze[2][8] = new Cell(false, false, false, true);
	maze[2][9] = new Cell(false, false, false, true);
	maze[2][10] = new Cell(false, false, false, true);
	maze[2][11] = new Cell(false, false, false, true);
	maze[2][12] = new Cell(false, false, false, true);
	maze[2][13] = new Cell(false, true, false, true);
	maze[2][14] = new Cell(false, false, false, true);
	maze[2][15] = new Cell(false, false, false, true);
	maze[2][16] = new Cell(false, false, false, true);
	maze[2][17] = new Cell(false, true, false, true);
	maze[2][18] = new Cell(false, true, false, false);
	// maze[3][]
	maze[3][0] = new Cell(true, true, false, false);
	maze[3][1] = new Cell(false, false, false, false);
	maze[3][2] = new Cell(false, false, false, false);
	maze[3][3] = new Cell(false, false, false, false);
	maze[3][4] = new Cell(false, false, false, true);
	maze[3][5] = new Cell(false, false, false, false);
	maze[3][6] = new Cell(false, false, false, false);
	maze[3][7] = new Cell(false, false, false, true);
	maze[3][8] = new Cell(false, false, false, false);
	maze[3][9] = new Cell(false, false, false, false);
	maze[3][10] = new Cell(false, false, false, true);
	maze[3][11] = new Cell(false, false, false, false);
	maze[3][12] = new Cell(false, false, false, true);
	maze[3][13] = new Cell(false, false, false, false);
	maze[3][14] = new Cell(false, false, false, false);
	maze[3][15] = new Cell(false, false, false, true);
	maze[3][16] = new Cell(false, false, false, false);
	maze[3][17] = new Cell(false, true, false, false);
	maze[3][18] = new Cell(false, true, false, false);
	// maze[4][]
	maze[4][0] = new Cell(true, true, false, false);
	maze[4][1] = new Cell(false, false, false, false);
	maze[4][2] = new Cell(false, false, false, false);
	maze[4][3] = new Cell(false, true, false, false);
	maze[4][4] = new Cell(false, true, false, false);
	maze[4][5] = new Cell(false, false, false, false);
	maze[4][6] = new Cell(false, true, false, true);
	maze[4][7] = new Cell(false, true, false, true);
	maze[4][8] = new Cell(false, false, false, true);
	maze[4][9] = new Cell(false, true, false, false);
	maze[4][10] = new Cell(false, true, false, false);
	maze[4][11] = new Cell(false, true, false, false);
	maze[4][12] = new Cell(false, true, false, false);
	maze[4][13] = new Cell(false, false, false, false);
	maze[4][14] = new Cell(false, true, false, true);
	maze[4][15] = new Cell(false, true, false, true);
	maze[4][16] = new Cell(false, false, false, true);
	maze[4][17] = new Cell(false, true, false, false);
	maze[4][18] = new Cell(false, true, false, false);
	// maze[5][]
	maze[5][0] = new Cell(true, true, false, false);
	maze[5][1] = new Cell(false, false, false, false);
	maze[5][2] = new Cell(false, false, false, true);
	maze[5][3] = new Cell(false, true, false, false);
	maze[5][4] = new Cell(false, true, false, false);
	maze[5][5] = new Cell(false, true, false, false);
	maze[5][6] = new Cell(false, true, false, false);
	maze[5][7] = new Cell(false, true, false, true);
	maze[5][8] = new Cell(false, true, false, false);
	maze[5][9] = new Cell(false, true, false, false);
	maze[5][10] = new Cell(false, true, false, false);
	maze[5][11] = new Cell(false, true, false, false);
	maze[5][12] = new Cell(false, true, false, false);
	maze[5][13] = new Cell(false, true, false, false);
	maze[5][14] = new Cell(false, true, false, false);
	maze[5][15] = new Cell(false, true, false, true);
	maze[5][16] = new Cell(false, true, false, false);
	maze[5][17] = new Cell(false, true, false, false);
	maze[5][18] = new Cell(false, true, false, false);
	// maze[6][]
	maze[6][0] = new Cell(true, true, false, false);
	maze[6][1] = new Cell(false, true, false, false);
	maze[6][2] = new Cell(false, true, false, true);
	maze[6][3] = new Cell(false, true, false, true);
	maze[6][4] = new Cell(false, true, false, true);
	maze[6][5] = new Cell(false, true, false, false);
	maze[6][6] = new Cell(false, false, false, false);
	maze[6][7] = new Cell(false, false, false, true);
	maze[6][8] = new Cell(false, true, false, false);
	maze[6][9] = new Cell(false, true, false, false);
	maze[6][10] = new Cell(false, true, false, true);
	maze[6][11] = new Cell(false, true, false, true);
	maze[6][12] = new Cell(false, true, false, true);
	maze[6][13] = new Cell(false, true, false, false);
	maze[6][14] = new Cell(false, false, false, false);
	maze[6][15] = new Cell(false, false, false, true);
	maze[6][16] = new Cell(false, true, false, false);
	maze[6][17] = new Cell(false, true, false, false);
	maze[6][18] = new Cell(false, true, false, false);
	// maze[7][]
	maze[7][0] = new Cell(true, true, false, false);
	maze[7][1] = new Cell(false, false, false, false);
	maze[7][2] = new Cell(false, true, false, false);
	maze[7][3] = new Cell(false, true, false, true);
	maze[7][4] = new Cell(false, false, false, false);
	maze[7][5] = new Cell(false, true, false, false);
	maze[7][6] = new Cell(false, true, false, true);
	maze[7][7] = new Cell(false, true, false, false);
	maze[7][8] = new Cell(false, true, false, true);
	maze[7][9] = new Cell(false, false, false, false);
	maze[7][10] = new Cell(false, true, false, false);
	maze[7][11] = new Cell(false, true, false, true);
	maze[7][12] = new Cell(false, false, false, false);
	maze[7][13] = new Cell(false, true, false, false);
	maze[7][14] = new Cell(false, true, false, true);
	maze[7][15] = new Cell(false, true, false, false);
	maze[7][16] = new Cell(false, true, false, true);
	maze[7][17] = new Cell(false, true, false, false);
	maze[7][18] = new Cell(false, true, false, false);
	// maze[8][]
	maze[8][0] = new Cell(true, true, false, false);
	maze[8][1] = new Cell(false, false, false, true);
	maze[8][2] = new Cell(false, false, false, true);
	maze[8][3] = new Cell(false, false, false, true);
	maze[8][4] = new Cell(false, false, false, true);
	maze[8][5] = new Cell(false, false, false, true);
	maze[8][6] = new Cell(false, false, false, true);
	maze[8][7] = new Cell(false, false, false, true);
	maze[8][8] = new Cell(false, false, false, true);
	maze[8][9] = new Cell(false, false, false, true);
	maze[8][10] = new Cell(false, false, false, true);
	maze[8][11] = new Cell(false, false, false, true);
	maze[8][12] = new Cell(false, false, false, true);
	maze[8][13] = new Cell(false, false, false, true);
	maze[8][14] = new Cell(false, false, false, true);
	maze[8][15] = new Cell(false, false, false, true);
	maze[8][16] = new Cell(false, false, false, true);
	maze[8][17] = new Cell(false, true, false, true);
	maze[8][18] = new Cell(false, true, false, false);
	// maze[9][]
	maze[9][0] = new Cell(true, false, false, true);
	maze[9][1] = new Cell(false, true, false, false);
	maze[9][2] = new Cell(false, true, false, false);
	maze[9][3] = new Cell(false, false, false, true);
	maze[9][4] = new Cell(false, false, false, false);
	maze[9][5] = new Cell(false, true, false, false);
	maze[9][6] = new Cell(false, false, false, false);
	maze[9][7] = new Cell(false, true, false, false);
	maze[9][8] = new Cell(false, true, false, false);
	maze[9][9] = new Cell(false, false, false, false);
	maze[9][10] = new Cell(false, false, false, true);
	maze[9][11] = new Cell(false, true, false, false);
	maze[9][12] = new Cell(false, false, false, false);
	maze[9][13] = new Cell(false, false, false, true);
	maze[9][14] = new Cell(false, false, false, false);
	maze[9][15] = new Cell(false, true, false, false);
	maze[9][16] = new Cell(false, false, false, false);
	maze[9][17] = new Cell(false, false, false, true);
	maze[9][18] = new Cell(false, true, false, false);
	// maze[10][]
	maze[10][0] = new Cell(true, true, false, false);
	maze[10][1] = new Cell(false, false, false, true);
	maze[10][2] = new Cell(false, true, false, false);
	maze[10][3] = new Cell(false, false, false, false);
	maze[10][4] = new Cell(false, true, false, false);
	maze[10][5] = new Cell(false, true, false, false);
	maze[10][6] = new Cell(false, true, false, false);
	maze[10][7] = new Cell(false, false, false, true);
	maze[10][8] = new Cell(false, true, false, false);
	maze[10][9] = new Cell(false, false, false, true);
	maze[10][10] = new Cell(false, true, false, false);
	maze[10][11] = new Cell(false, true, false, false);
	maze[10][12] = new Cell(false, false, false, true);
	maze[10][13] = new Cell(false, true, false, false);
	maze[10][14] = new Cell(false, true, false, false);
	maze[10][15] = new Cell(false, true, false, true);
	maze[10][16] = new Cell(false, false, false, false);
	maze[10][17] = new Cell(false, true, false, true);
	maze[10][18] = new Cell(false, true, false, false);
	// maze[11][]
	maze[11][0] = new Cell(true, false, false, true);
	maze[11][1] = new Cell(false, false, false, true);
	maze[11][2] = new Cell(false, false, false, true);
	maze[11][3] = new Cell(false, false, false, true);
	maze[11][4] = new Cell(false, true, false, true);
	maze[11][5] = new Cell(false, false, false, true);
	maze[11][6] = new Cell(false, true, false, true);
	maze[11][7] = new Cell(false, false, false, true);
	maze[11][8] = new Cell(false, false, false, true);
	maze[11][9] = new Cell(false, false, false, false);
	maze[11][10] = new Cell(false, true, false, true);
	maze[11][11] = new Cell(false, false, false, true);
	maze[11][12] = new Cell(false, false, false, true);
	maze[11][13] = new Cell(false, true, false, true);
	maze[11][14] = new Cell(false, false, false, true);
	maze[11][15] = new Cell(false, false, false, true);
	maze[11][16] = new Cell(false, false, false, true);
	maze[11][17] = new Cell(false, true, false, true);
	maze[11][18] = new Cell(false, true, false, true);

	return maze;
    }
}

class Cell {

    @SuppressWarnings("unused")
    private boolean left;
    @SuppressWarnings("unused")
    private boolean right;
    @SuppressWarnings("unused")
    private boolean top;
    @SuppressWarnings("unused")
    private boolean bottom;

    Cell(boolean left, boolean right, boolean top, boolean bottom) {

	this.left = left;
	this.right = right;
	this.top = top;
	this.bottom = bottom;
    }
}
