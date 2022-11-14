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

        System.out.print("   ");
        for (int i = 0; i < this.width; i++){
            System.out.print(i + "  ");
        }
        System.out.print("\n");
        for (int row = 0; row < this.width; row++){
            System.out.print(row + "  ");
            for (int column = 0; column < this.height; column++){
                // for each coordinate (row, column), creates new cell object, adds to arraylist
                Cells cell = new Cells(row, column);

                this.cells[row][column] = new ArrayList<>();
                this.cells[row][column].add(cell);            // adds cell to 2d arraylist
                cell = this.cells[row][column].get(0);        // retrieves cell from arraylist
                System.out.print(cell.appearance);
            }
            System.out.print("\n");
        }
        this.totalCells = this.width * this.height;
    }

    public void gridBuilder(){
        System.out.print("\n");
        System.out.print("   ");
        for (int i = 0; i < this.width; i++){
            System.out.print(i + "  ");
        }
        System.out.print("\n");
        for (int row = 0; row < this.width; row++){
            System.out.print(row + "  ");
            for (int column = 0; column < this.height; column++){
                // for each coordinate (row, column), gets cell from 2d arraylist
                Cells cell = this.cells[row][column].get(0);
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
        int mineNumber = (this.width * this.height) / 20;     // number of mines - 20%
        // gets coordinates for mines by executing randCoords method x amount of times
        for (int i = 0; i < mineNumber; i++){
            coords = this.randCoords();
            int x = (int) coords.get(0);             // converts from object type to int
            int y = (int) coords.get(1);
            cell = this.cells[x][y].get(0);

            // sets mine variable of cell objects to 'true'
            if (cell.isMine){
                while (cell.isMine){      // if cell already has mine, randomize coords until cell with no mine is found
                    coords = this.randCoords();
                    x = (int) coords.get(0);
                    y = (int) coords.get(1);
                    cell = this.cells[x][y].get(0);
                }
            }
            cell.isMine = true;
        }
        this.gridBuilder();
    }
    // places flag in cell if cell is unopened/unclickable
    public void placeFlag(int coord_x, int coord_y){
        Cells cell = this.cells[coord_x][coord_y].get(0);
        if (cell.state == "opened" || cell.isClickable == false){
            System.out.println("Cell has already been opened, cannot place flag");
        }
        else {
            cell.state = "flagged";
            cell.isClickable = false;
            cell.appearance = "F  ";
            this.gridBuilder();
        }
    }

    public void removeFlag(int coord_x, int coord_y){
        Cells cell = this.cells[coord_x][coord_y].get(0);
        if (cell.state == "flagged"){
            cell.state = "unopened";
            cell.isClickable = true;
            cell.appearance = ".  ";
            this.gridBuilder();
        }
        else {
            System.out.println("There is no flag on this cell");
        }
    }

    public void blankCell(int coord_x, int coord_y){
        Cells cell = this.cells[coord_x][coord_y].get(0);
        cell.state = "opened";
        cell.isClickable = false;
        cell.appearance = "0  ";
        this.adjacentChecker();
        this.gridBuilder();
    }

    public void numberedCell(int coord_x, int coord_y){
        Cells cell = this.cells[coord_x][coord_y].get(0);
        cell.state = "opened";
        cell.isClickable = false;
        cell.appearance = cell.adjacentMinesCount + "  ";
        this.gridBuilder();
    }

    public void showMine(int coord_x, int coord_y){
        Cells cell = this.cells[coord_x][coord_y].get(0);
        cell.state = "opened";
        cell.isClickable = false;
        cell.appearance = "*  ";
        this.gridBuilder();
    }


    public void adjacentChecker(){

    }













}
