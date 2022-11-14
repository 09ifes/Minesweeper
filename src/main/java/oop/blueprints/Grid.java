package oop.blueprints;

import java.util.ArrayList;
import java.util.Random;

public class Grid {
    int width;
    int height;
    int totalCells;
    ArrayList<Cells>[][] cells;

    // creates initial grid, all cells set to 'unopened'
    public Grid(int width, int height){
        this.width = width;
        this.height = height;
        this.cells = new ArrayList[width][height];
        for (int row = 1; row <= this.width; row++){
            for (int column = 1; column <= this.height; column++){
                // for each coordinate (row, column), creates new cell object, adds to arraylist
                Cells cell = new Cells(row, column);

                // "row/column - 1" so that user input gets converted to index
                this.cells[row-1][column-1] = new ArrayList<>();
                this.cells[row-1][column-1].add(cell);            // adds cell to 2d arraylist
                cell = this.cells[row-1][column-1].get(0);        // retrieves cell from arraylist
                System.out.print(cell.appearance);
            }
            System.out.print("\n");
        }
        this.totalCells = this.width * this.height;
    }

    public void gridBuilder(){
        System.out.print("\n");
        for (int row = 1; row <= this.width; row++){
            for (int column = 1; column <= this.height; column++){
                // for each coordinate (row, column), gets cell from 2d arraylist
                Cells cell = this.cells[row-1][column-1].get(0);
                System.out.print(cell.appearance);
            }
            System.out.print("\n");
        }
    }

    // generates random coordinates
    public ArrayList randCoords(){
        Random rand_x = new Random();
        Random rand_y = new Random();
        int x = rand_x.nextInt(this.width);
        int y = rand_y.nextInt(this.height);

        ArrayList<Integer> coords = new ArrayList<>();
        coords.add(x);
        coords.add(y);
        return coords;
    }

    public void setMines(){
        ArrayList coords;
        Cells cell;
        for (int i = 0; i < 20; i++){
            coords = this.randCoords();
            int x = (int) coords.get(0);             // converts from object to int
            int y = (int) coords.get(1);
            cell = this.cells[x][y].get(0);

            if (cell.isMine){
                while (cell.isMine){
                    coords = this.randCoords();
                    x = (int) coords.get(0);
                    y = (int) coords.get(1);
                    cell = this.cells[x][y].get(0);
                }
            }
            cell.isMine = true;
        }



    }

}
