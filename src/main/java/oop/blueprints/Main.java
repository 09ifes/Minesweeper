package oop.blueprints;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Grid grid = new Grid(15, 10);
        Scanner sc = new Scanner(System.in);

        while(grid.game){
            // set initial values to account for exceptions, to prevent
            int x = 0;
            int y = 0;
            String flag = "";
            boolean proceed = true;
            System.out.println("\nPlease enter x value: 0 - " + (grid.width-1) + ", y value: 0 - " + (grid.height-1)
                    + ", and flag: F - toggle flag, NF - no flag (selects cell)");

            String[] input = sc.nextLine().split(" ");

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