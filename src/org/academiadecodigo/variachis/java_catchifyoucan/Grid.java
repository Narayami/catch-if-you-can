package org.academiadecodigo.variachis.java_catchifyoucan;

public class Grid {

    private int cols;
    private int rows;

    private static final int CELLSIZE = 10; //TODO-SFX
    private static final int PADDING = 10; //TODO-SFX

    public Grid(int cols, int rows){

        this.cols = cols;
        this.rows = rows;

    }


    /**
     *
     * @return the number of cols
     */
    public int getCols() {
        return cols;
    }

    /**
     *
     * @return the number of rows
     */
    public int getRows() {
        return rows;
    }
}
