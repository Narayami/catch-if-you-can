package org.academiadecodigo.variachis.java_catchifyoucan;

public class PositionFactory {

    private static Grid grid = new Grid(20, 20);


    public static Position getPositionRandomCol() {
        int random =(int) Math.random()* grid.getCols();
        return new Position(random,0,grid);
    }

    public static Position[] getItemPositions(){
        Position[] positions = new Position[25];
        int count =0;
        for (int i = 0; i <5 ; i++) {
            for (int j = 0; j <5 ; j++) {
                positions[count] = getPositionRandomCol();
                count++;
            }
        }
        return positions;
    }
}
