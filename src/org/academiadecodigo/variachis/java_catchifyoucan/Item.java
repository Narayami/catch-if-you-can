package org.academiadecodigo.variachis.java_catchifyoucan;

/**
 * This class represents all items in game, extends AbstractCollidable as the player
 */
public class Item extends AbstractCollidable {


    private Type type;
    private boolean colided = false;
    private Position[] positions;
    // TODO: 22-10-2018 need Picture

    public Item() {
        this.type = random();
        this.positions = PositionFactory.getItemPositions();
    }

    public Position[] getPositions() {
        return positions;
    }


    public void setColided(boolean colided) {
        this.colided = colided;
    }

    public boolean isColided() {
        return colided;
    }

    public static Type random() {
        int randomType = (int) (Math.random() * Type.values().length);
        return Type.values()[randomType];
    }

    public void draw(){
        switch (type){
            case TREE:
            case BEER:         // TODO: 08-11-2018 draw logic here
            case POLY:
            case CAP:
            case ABSTRACTION:
        }
    }

    public void moveDown() {
        for (int i = 0; i < positions.length; i++) {
            if (positions[i].isCollided()){
                setColided(true);
                System.out.println("Narayami gay");
                return;
            }
            positions[i].moveItemDown();
        }
    }


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


