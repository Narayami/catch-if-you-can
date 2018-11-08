package org.academiadecodigo.variachis.java_catchifyoucan;

/**
 * This class represents all items in game, extends AbstractCollidable as the player
 */
public class Item extends AbstractCollidable {


    private Type type;
    private boolean colided = false;
    private Grid grid = new Grid(20,20);
    //private Picture picture;
    // TODO: 22-10-2018 need Picture
    // TODO: 22-10-2018 need Position - if cell size = 10 then 50x50px image needs 25 positions
    private Position[] positions;


    public Item() {
        this.type= random();
        this.positions = new Position[]{
                new Position(1,1,grid),
                new Position(1,2,grid)};
    }

    public void setGrid(Grid grid) {
        this.grid = grid;
    }

    public void setColided(boolean colided) {
        this.colided = colided;
    }

    public boolean isColided() {
        return colided;
    }

    /**
     * random type for items
     * @return Item Type, random one
     */
    public static Type random() {
        int randomType = (int) (Math.random() * Type.values().length);
        return Type.values()[randomType];
    }

    public Type getType() {
        return type;
    }

    // TODO: 22-10-2018 need Draw and move

    public void moveDown(){
        for (int i = 0; i < positions.length; i++) {
            positions[i].moveItemDown();
        }
    }
    /**
     * Inner class that defines all items and makes them act different with player
     */
    public enum Type {
        CAP("cap.png"),
        ABSTRACTION("abstraction.png"),
        BEER("beer.png"),
        POLY("polymorphism.png"),
        TREE("inheritance.png");

        private String pic;

        Type(String pic) {
            this.pic = pic;
        }
    }

}


