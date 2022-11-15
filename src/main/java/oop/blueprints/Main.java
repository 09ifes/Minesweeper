package oop.blueprints;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Grid grid = new Grid(9, 9);
        Scanner sc = new Scanner(System.in);

        System.out.println("\nPlease enter x value: 0 - " + (grid.width-1) + ", y value: 0 - " + (grid.height-1)
                + ", and flag: F - toggle flag, NF - no flag! (must have a space in between each input)");
        String[] input = sc.nextLine().split(" ");
        int x = Integer.parseInt(input[0]);
        int y = Integer.parseInt(input[1]);
        String flag = input[2];
        //while(play.game){



       // }
        //grid.adjacentChecker(4,4);
        //grid.gridBuilder();
        //grid.placeFlag(1,2);
        //grid.blankCell(2,4);
        //grid.numberedCell(6,8);
        //grid.showMine(5,5);




    }
}