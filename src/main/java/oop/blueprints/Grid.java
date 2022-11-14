package oop.blueprints;

import java.util.ArrayList;

public class Grid {
    int width;
    int length;
    ArrayList<Cells> cells = new ArrayList<>();

    // creates initial grid, all cells set to 'unopened'
    public Grid(int width, int length){
        this.width = width;
        this.length = length;
        for (int row = 1; row <= this.width; row++){
            for (int column = 1; column <= this.length; column++){
                // for each coordinate (row, column), creates new cell object, adds to arraylist
                Cells cell = new Cells(row, column);
                System.out.print(cell.appearance);
                this.cells.add(cell);
            }
            System.out.print("\n");
        }

    }

    public void gridBuilder(){
        int index = 0;
        for (int row = 1; row <= this.width; row++){
            for (int column = 1; column <= this.length; column++){
                // for each coordinate (row, column), creates new cell object, adds to arraylist
                Cells cell = this.cells.get(index);
                System.out.print(cell.appearance);
                index++;
            }
            System.out.print("\n");
        }

    }
}
