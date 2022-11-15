package oop.blueprints;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean dimensions = true;
        int columns = 0;
        int rows = 0;

        // exception handling for dimension inputs
        while(dimensions){
            boolean proceed = true;

            System.out.println("\nPlease choose the number of columns and rows ");

            String[] input = sc.nextLine().split(" ");
            try {
                columns = Integer.parseInt(input[0]);
            }
            catch (Exception e){
                proceed = false;
            }
            try {
                rows = Integer.parseInt(input[1]);
            }
            catch (Exception e){
                proceed = false;
            }
            if (columns <= 0 || rows <= 0){
                proceed = false;
            }

            if (proceed){
                dimensions = false;
            }
            else {
                System.out.println("Please enter valid inputs");
            }

        }

        Grid grid = new Grid(columns, rows);

        while(grid.game){
            // set initial values to account for exceptions, to prevent
            int x = 0;
            int y = 0;
            String flag = "";
            boolean proceed = true;
            System.out.println("\nPlease enter x value: 0 - " + (grid.width-1) + ", y value: 0 - " + (grid.height-1)
                    + ", and flag: F - toggle flag, NF - no flag (selects cell)");

            String[] input = sc.nextLine().split(" ");
            // handling exceptions from inputs
            try {
                x = Integer.parseInt(input[0]);
            }
            catch (Exception e){
                proceed = false;
            }
            try{
                y = Integer.parseInt(input[1]);
            }
            catch (Exception e) {
                proceed = false;
            }
            try {
                flag = input[2];
            }
            catch (Exception e){
                proceed = false;
            }

            if (proceed) {
                grid.receiveInputs(x, y, flag);
            }
            else {
                System.out.println("Please enter valid inputs!");
            }
        }



    }
}