import oop.blueprints.Cells;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CellTests {
    @Test
    public void testConstructor(){
        Cells cell = new Cells();
        Assertions.assertEquals(true, cell.isMine);
        Assertions.assertEquals(true, cell.isFlag);
    }



}
