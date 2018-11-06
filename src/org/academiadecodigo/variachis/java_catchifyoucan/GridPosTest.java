package org.academiadecodigo.variachis.java_catchifyoucan;

public class GridPosTest {

    public static void main(String[] args) {

        Grid grid = new Grid(20, 20);

        Position position = new Position(10, 10, grid);

        position.checkCollision(grid, position);



    }

}
