package org.academiadecodigo.variachis.java_catchifyoucan;

public class Player extends AbstractCollidable {

    private Position[] positions;

    public Player(){
        this.positions = PositionFactory.getPlayerPositions();
    }


}
