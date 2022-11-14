package oop.blueprints;

public class Cells {
    String state = "unopened";         // default state for new cell instances >> "unopened";
    String appearance = ".  ";           // how cell will look on screen, default will be ".";
    boolean isFlag = false;
    boolean isClickable = true;
    int adjacentMinesCount = 0;
    boolean isMine = false;
    int x;
    int y;

    public Cells(int x, int y){
        this.x = x;
        this.y = y;
    }




}
