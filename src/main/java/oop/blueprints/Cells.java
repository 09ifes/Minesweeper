package oop.blueprints;

public class Cells {
    String state;
    boolean isFlag;
    int adjacentMinesCount;
    boolean isBomb;
    int x;
    int y;

    public Cells(int x, int y){
        state = "unopened";
        this.x = x;
        this.y = y;
    }




}
