import static org.junit.Assert.*;
import org.junit.Test;

public class Examples {

    public Examples(){}

    /*
    // This shows what a test case looks like
    @Test
    public void simpleCheck() {
	assertEquals(4, 4);
    }
    */

    @Test
    public void testShark(){
        Shark newShark = new Shark(6,15);
        assertTrue(newShark.isNormalSize());
    }
}