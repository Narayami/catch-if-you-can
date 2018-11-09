package org.academiadecodigo.variachis.java_catchifyoucan;

public class PositionFactory {

    private static Grid grid = new Grid(80, 60);


    // TODO: 08-11-2018 a logica de criação de posiçoes tem de começar numa posiçao definida
    //       e a partir de ai contruir as outras posiçoes.

    public static Position getPositionRandomCol() {
        int random = (int) Math.random() * grid.getCols();
        return new Position(random, 0, grid);
    }

    public static Position[] getItemPositions() {
        Position[] positions = new Position[25];
        int count = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                positions[count] = getPositionRandomCol();
                count++;
            }
        }
        return positions;
    }

    public static Position[] getPlayerPositions() {
        int count = 0;
        int startCol = (grid.getCols() / 2) - 2;
        int startRow = grid.getRows() - 10;
        Position[] positions = new Position[50]; // TODO: 09-11-2018 bad logic here
        for (int i = 0; i < 5; i++) {
            startCol++;
            for (int j = 0; j < 10; j++) {
                positions[count] = new Position(startCol, startRow, grid);
                startRow++;
                if (startRow == grid.getRows() +1){
                    startRow = grid.getRows() -10;
                }
                count++;
            }
        }
        return positions;
    }

}
