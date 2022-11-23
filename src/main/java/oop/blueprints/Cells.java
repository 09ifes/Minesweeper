package oop.blueprints;

public class Cells {
    public String state = "unopened";         // default state for new cell instances >> "unopened";
    public String appearance = ".  ";           // how cell will look on screen, default will be ".";
    public boolean isFlag = false;
    public boolean isClickable = true;
    public boolean isChecked = false;
    public int adjacentMinesCount = 0;
    public boolean isMine = false;
    int x;
    int y;

    public Cells(){
        this.isMine = false;
        this.isFlag = false;

    }




}
