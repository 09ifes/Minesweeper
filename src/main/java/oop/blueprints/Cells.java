package oop.blueprints;

public class Cells {
    String state;
    String appearance;
    boolean isFlag;
    int adjacentMinesCount;
    boolean isMine;
    int x;
    int y;

    public Cells(int x, int y){
        state = "unopened";         // default state for new cell instances >> "unopened"
        appearance = ".  ";           // how cell will look on screen, default will be "."
        this.x = x;
        this.y = y;
    }




}
