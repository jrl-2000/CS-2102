import static org.junit.Assert.*;
import org.junit.Test;

public class Examples {

    public Examples(){

    }

    /*
    // This shows what a test case looks like
    @Test
    public void simpleCheck() {
	assertEquals(4, 4);
    }
    */
    Album song1 = new Album("Jon", "Uplifting");
    Album song2 = new Album("Rezonate", "Glitch Hop");
    Album song3 = new Album("Rezonate", "Future House");

    Song HapBD = new Song("Happy Birthday", 18, song1);
    Song Rebirth = new Song("Rebirth", 367, song2);
    Song TOR = new Song("The Only Road",293, song3);

    @Test
    public void checkHBLen() {
        assertEquals(18, HapBD.lenInSeconds);
        assertEquals("Glitch Hop", Rebirth.onAlbum.genre);
        assertEquals("Future House", TOR.onAlbum.genre);
        assertEquals(293, TOR.lenInSeconds);
    }


}
