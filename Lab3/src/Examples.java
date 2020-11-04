import org.junit.*;
import static org.junit.Assert.*;

import java.awt.peer.LabelPeer;
import java.util.LinkedList;

public class Examples {
    LinkedList<Double> rainFalls = new LinkedList<Double>();
    //new planning instance
    Planning newPL = new Planning(rainFalls);


    @Test
    public void rainFallsTest() { //the one form the canvas page
        rainFalls.add(1.0);//this one
        rainFalls.add(-2.0);
        rainFalls.add(5.0);
        rainFalls.add(-999.0);
        rainFalls.add(8.0);
        assertEquals(newPL.rainfall(rainFalls), 3.0);
                //assertEquals(newPL.rainfall(rainFalls), 3.0);



    }









}
