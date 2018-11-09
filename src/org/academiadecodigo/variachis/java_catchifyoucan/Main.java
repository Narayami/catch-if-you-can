package org.academiadecodigo.variachis.java_catchifyoucan;

public class Main {


    public static void main(String[] args) {

        Player player = new Player();
        Item item = new Item();

        while (!(item.isColided())) {
            item.moveDown();
        }

        player.showPositions();

    }
}
