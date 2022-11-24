import oop.blueprints.Grid;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class GridTests {

    @Test
    public void testGrid(){
        Random rand_x = new Random();
        Random rand_y = new Random();
        int x = rand_x.nextInt(100);
        int y = rand_y.nextInt(100);
        Grid grid = new Grid(x, y);
        Assertions.assertEquals(x, grid.width, "Grid width not equal to x value");
        Assertions.assertEquals(y, grid.height, "Grid height not equal to y value");


    }















}
