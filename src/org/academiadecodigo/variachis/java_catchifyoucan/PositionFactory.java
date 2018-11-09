package org.academiadecodigo.variachis.java_catchifyoucan;

public class PositionFactory {

    private static Grid grid = new Grid(20, 20);


    // TODO: 08-11-2018 a logica de criação de posiçoes tem de começar numa posiçao definida
    //       e a partir de ai contruir as outras posiçoes.

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

    public static Position[] getPlayerPositions(){
        int startCol = (grid.getCols()/2) - 5;
        int startRow = grid.getRows() -10;
        Position[] positions = new Position[50];
        int count = 0;
        for (int i = startCol; i < 5 ; i++) {
            for (int j = startRow; j <10 ; j++) {
                positions[i] = new Position(i,j,grid);
            }
        }
        return positions;
    }

}
