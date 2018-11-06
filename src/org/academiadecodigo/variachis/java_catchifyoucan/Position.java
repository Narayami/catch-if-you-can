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

        Direction actualDirection = Direction.RIGHT;

        switch (actualDirection){
            case RIGHT:
                moveRight(position, grid);
        }

    }

    private void moveRight(Position position, Grid grid) {
        for (int i = position.cols; i != grid.getCols() + 1; i++) { //WHY NEED + 1? WITHOUT + 1 STOPS AT 19.. HUMMM...
            System.out.println("Position col: " + i + " Grid Col: " + grid.getCols());

            if (position.cols == grid.getCols()) {
                System.out.println("Position col reached: " + i + " Collision logic working!");
                return;
            }

            cols++;
        }


    }

}
