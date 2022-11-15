package oop.blueprints;

public class Main {
    public static void main(String[] args) {

        Grid grid = new Grid(9, 9);
        grid.setMines();
        grid.setAdjacents();
        grid.adjacentChecker(4,4);
        grid.gridBuilder();
        //grid.placeFlag(1,2);
        //grid.blankCell(2,4);
        //grid.numberedCell(6,8);
        //grid.showMine(5,5);




    }
}