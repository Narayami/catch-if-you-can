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

        Direction actualDirection = Direction.LEFT; //FOR TESTING PURPOSE

        //PLAYER MOVES LEFT AND RIGHT
        switch (actualDirection){
            case RIGHT:
                moveRight(position, grid);
                break;
            case LEFT:
                moveLeft(position, grid);
                break;
        }

    }

    //ITEM MOV DOWN SEPARATED FROM PLAYER MOVE
    public void moveItemDown() {
        //random col post for the item to fall
        cols = (int)Math.floor(Math.random() * grid.getCols());
        System.out.println(cols);

        for (int i = cols ; i < grid.getRows() + 1; i++) {
            System.out.println("Position col: " + i + " Grid has: " + grid.getRows() + " Rows" +
                    " and " + grid.getCols() + " cols!");

            if (i == grid.getRows()) {
                System.out.println("Position col reached: " + i + " Collision logic working!");
                return;
            }

            rows++;
            System.out.println("pos row: " + rows + ", grid rows: " + grid.getRows());
        }


    }

    public void moveLeft(Position position, Grid grid) {

        for (int i = position.cols; i != 0 -1 ; i--) { //first col is always 0 i guess.
            System.out.println("Position col: " + i + " Grid has: " + grid.getCols() + " Cols");

            if (position.cols == 0) {
                System.out.println("Position col reached: " + i + " Collision logic working!");
                return;
            }

            cols--;
        }

    }

    public void moveRight(Position position, Grid grid) {
        for (int i = position.cols; i != grid.getCols() + 1; i++) { //WHY NEED + 1? WITHOUT + 1 STOPS AT 19.. HUMMM...
            System.out.println("Position col: " + i + " Grid has: " + grid.getCols() + " Cols");

            if (position.cols == grid.getCols()) {
                System.out.println("Position col reached: " + i + " Collision logic working!");
                return;
            }

            cols++;
        }


    }

}
