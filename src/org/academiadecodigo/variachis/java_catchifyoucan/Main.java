package org.academiadecodigo.variachis.java_catchifyoucan;

public class Main {


    public static void main(String[] args) {

        Player player = new Player();
        Item item = new Item();
        Position[] p = item.getPositions();

        while (!(item.isColided())) {
            item.moveDown();

            for (int i = 0; i < p.length; i++) {
                player.beingHit(p[i]);
            }
        }


    }
}
