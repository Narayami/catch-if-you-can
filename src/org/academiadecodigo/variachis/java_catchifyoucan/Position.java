package org.academiadecodigo.variachis.java_catchifyoucan;

public class Position {


    //TODO-HITBOX?
    private int rows;
    private int cols;
    private Grid grid;

    public Position(int cols, int rows, Grid grid) {

        this.cols = cols;
        this.rows = rows;
        this.grid = grid;

    }


    public void checkCollision(Grid grid, Position position) {

        System.out.println("Position cols: " + position.cols + " Position rows: " + position.rows);
        System.out.println("Grid cols: " + grid.getCols() + " Grid rows: " + grid.getRows());

    }

}
