package org.academiadecodigo.variachis.java_catchifyoucan;

public class Player extends AbstractCollidable {

    private Position[] positions;
    private int knowlege = 50;

    public Player(){
        this.positions = PositionFactory.getPlayerPositions();
    }


    public void beingHit(Position pos){
        for (Position p : positions){
            if (p.checkPlayerColission(pos)){
                knowlege -= 20;
                System.out.println("hit player");
            }
        }
    }

}
