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
    Album song3 = new Album("Puppet", "Indie Dance");

    Song HapBD = new Song("Happy Birthday", 18, song1);
    Song Rebirth = new Song("Rebirth", 367, song2);
    Song EnisEn = new Song("Enough is Enough",197, song3);

    @Test
    public void checkHBLen() {
        assertEquals(18, HapBD.lenInSeconds);
        assertEquals("Glitch Hop", song2.genre);
        assertEquals(197, EnisEn.lenInSeconds);
    }


}
