package org.academiadecodigo.variachis.java_catchifyoucan;

public class Main {


    public static void main(String[] args) {


        Item item = new Item();
        while (!(item.isColided())){
            item.moveDown();
        }


    }
}
