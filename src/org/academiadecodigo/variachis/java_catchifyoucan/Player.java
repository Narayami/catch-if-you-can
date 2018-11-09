package org.academiadecodigo.variachis.java_catchifyoucan;

public class Player extends AbstractCollidable {

    private Position[] positions = PositionFactory.getPlayerPositions();
    private int knowlege = 50;
    private int fun = 50;

    public void showPositions() {
        for (int i = 0; i < positions.length ; i++) {
            System.out.println("row: " + positions[i].getRows() + " || col: " + positions[i].getCols());
        }
        System.out.println(positions.length);
    }
}
