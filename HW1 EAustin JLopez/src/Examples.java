
import static org.junit.Assert.*;
import org.junit.Test;

public class Examples {

    //Athlete file test cases:

    ShootingRound r1 = new ShootingRound(4);
    ShootingRound r2 = new ShootingRound(1);
    ShootingRound r3 = new ShootingRound(5);
    ShootingRound r4 = new ShootingRound(2);
    ShootingResult JimShoot = new ShootingResult(r1, r2, r3, r4);
    SkiingResult JimSki = new SkiingResult(3, 12.2, 17.6, 11.8, 0.4,3);
    FinalResult JimResult = new FinalResult(JimShoot, JimSki);
    Athlete Jim = new Athlete(JimResult);

    ShootingRound rd1 = new ShootingRound(4);
    ShootingRound rd2 = new ShootingRound(1);
    ShootingRound rd3 = new ShootingRound(2);
    ShootingRound rd4 = new ShootingRound(2);
    ShootingResult TomShoot = new ShootingResult(rd1, rd2, rd3, rd4);
    SkiingResult TomSki = new SkiingResult(3, 17.2, 17.6, 11.8, 0.4,5);
    FinalResult TomResult = new FinalResult(TomShoot, TomSki);
    Athlete Tom = new Athlete(TomResult);

    ShootingRound rds1 = new ShootingRound(5);
    ShootingRound rds2 = new ShootingRound(5);
    ShootingRound rds3 = new ShootingRound(5);
    ShootingRound rds4 = new ShootingRound(5);
    ShootingResult CindyShoot = new ShootingResult(rds1, rds2, rds3, rds4);
    SkiingResult CindySki = new SkiingResult(1, 20, 24.2, 12.8, 6,7);
    FinalResult CindyResult = new FinalResult(CindyShoot, CindySki);
    Athlete Cindy = new Athlete(CindyResult);

    //Jim is a better Skiier than Tom
    @Test
    public void testbetterSkiierTrue() {
        assertTrue(Jim.betterSkiier(Tom));
    }


    @Test
    public void testbetterSkiierFalse(){
        assertFalse(Tom.betterSkiier(Jim));
    }

    //Jim is a better shooter than Tom
    @Test
    public void testbetterShooterTrue(){
        assertTrue(Jim.betterShooter(Tom));
    }

    @Test
    public void testbetterShooterFalse(){
        assertFalse(Tom.betterShooter(Jim));
    }

    //Cindy is better shooter than Jim, but worse Skiier
    @Test
    public void testhasBeatenTrue(){
        assertTrue(Cindy.hasBeaten(Jim));
    }

    //Jim is a better Skiier than Jin, but worse Shooter
    @Test
    public void testhasBeatenFalse(){
        assertTrue(Jim.hasBeaten(Cindy));
    }

    //Jim is better shooter/skiier than Tom
    @Test
    public void testhasBeatenTrue1(){
        assertTrue(Jim.hasBeaten(Tom));
    }

    //Jim is better shooter/skiier than Tom
    @Test
    public void testhasBeatenFalse1(){
        assertFalse(Tom.hasBeaten(Jim));
    }


    //FinalResult file test cases:

    //Jim 3rd place
    @Test
    public void testfinalScore(){
        assertEquals(JimResult.finalScore(),534,0.01);
    }

    //ShootingResult file test cases:

    @Test
    public void testshootingpointsEarned(){
        assertEquals(JimShoot.pointsEarned(),12, 0.01);
    }

    @Test
    public void testshootinggetPenalties(){
        assertEquals(JimShoot.getPenalties(),480, 0.01);
    }

    //SkiingResult file test cases:
    @Test
    public void testSkiingpointsEarned(){
        assertEquals(JimSki.pointsEarned(),42, 0.01);
    }
    @Test
    public void testSkiinggetPenalties(){
        assertEquals(JimSki.getPenalties(),15, 0.01);
    }

    }



