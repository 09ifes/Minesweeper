package oop.blueprints;

public class Cells {
    String state = "unopened";         // default state for new cell instances >> "unopened";
    String appearance = ".  ";           // how cell will look on screen, default will be ".";
    public boolean isFlag = false;
    boolean isClickable = true;
    boolean isChecked = false;
    int adjacentMinesCount = 0;
    public boolean isMine = false;
    int x;
    int y;






}
