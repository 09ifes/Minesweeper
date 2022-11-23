import oop.blueprints.Cells;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CellTests {
    @Test
    public void testConstructor(){
        Cells cell = new Cells();
        Assertions.assertFalse(cell.isMine, "isMine should be false when initialised");
        Assertions.assertFalse(cell.isFlag, "isFlag should be false when initialised");
        Assertions.assertEquals("unopened", cell.state, "state should be 'unopened' when initialised");
        Assertions.assertEquals(".  ", cell.appearance, " appearance should be '.  ' when initialised");
        Assertions.assertTrue(cell.isClickable, "isClickable should be true when initialised");
        Assertions.assertFalse(cell.isChecked, "isChecked should be false when initialised");
        Assertions.assertEquals(0, cell.adjacentMinesCount, "adjacentMinesCount should be 0 when initialised");
    }




}
