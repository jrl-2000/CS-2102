
import static org.junit.Assert.*;
import org.junit.Test;
import java.util.LinkedList;
public class Examples {

    //first comp
    //Athlete file test cases:
    LinkedList<ShootingRound> res1 = new LinkedList<ShootingRound>();
    ShootingRound r1 = new ShootingRound(4, true);
    ShootingRound r2 = new ShootingRound(1, true);
    ShootingRound r3 = new ShootingRound(5, true);
    ShootingRound r4 = new ShootingRound(2, true);
    ShootingResult JimShoot = new ShootingResult(res1);
    SkiingResult JimSki = new SkiingResult(3, 12.2, 17.6, 11.8, 0.4, 3);
    FinalResult JimResult = new FinalResult(JimShoot, JimSki);
    Athlete Jim = new Athlete(JimResult, "Jim");

    LinkedList<ShootingRound> res2 = new LinkedList<ShootingRound>();
    ShootingRound rd1 = new ShootingRound(1, false);
    ShootingRound rd2 = new ShootingRound(1, false);
    ShootingRound rd3 = new ShootingRound(2, false);
    ShootingRound rd4 = new ShootingRound(2, true);
    ShootingResult TomShoot = new ShootingResult(res2);
    SkiingResult TomSki = new SkiingResult(3, 17.2, 17.6, 11.8, 0.4, 5);
    FinalResult TomResult = new FinalResult(TomShoot, TomSki);
    Athlete Tom = new Athlete(TomResult, "Tom");

    LinkedList<ShootingRound> res3 = new LinkedList<ShootingRound>();
    ShootingRound rds1 = new ShootingRound(5, false);
    ShootingRound rds2 = new ShootingRound(5, false);
    ShootingRound rds3 = new ShootingRound(5, true);
    ShootingRound rds4 = new ShootingRound(5, true);
    ShootingResult CindyShoot = new ShootingResult(res3);
    SkiingResult CindySki = new SkiingResult(1, 20, 24.2, 12.8, 6, 7);
    FinalResult CindyResult = new FinalResult(CindyShoot, CindySki);
    Athlete Cindy = new Athlete(CindyResult, "Cindy");



    LinkedList<Athlete> athletes = new LinkedList<Athlete>();
    //int shootingRound = 4;
    LinkedList<String> namesDNF = new LinkedList<String>();
    Competition comp = new Competition(4, athletes);
    LinkedList<String> DNF = new LinkedList<String>();


//testing the points earned for best round by type for jim
    @Test
    public void shootingTest1() {
        res1.add(r1);
        res1.add(r2);
        res1.add(r3);
        res1.add(r4);
        //adds to the list

        //now the functions
        assertEquals(12, JimShoot.pointsEarned(), 0.01);
        assertEquals(r3, JimShoot.bestRoundByType(true));
        assertEquals(null, JimShoot.bestRoundByType(false));
    }


    //testing the points earned for best round by type for tom
    @Test
    public void shootingTest2electricboogaloo() {
        res2.add(rd1);
        res2.add(rd2);
        res2.add(rd3);
        res2.add(rd4);
        //adds to the list

        //now the functions
        assertEquals(6, TomShoot.pointsEarned(), 0.01);
        assertEquals(rd3, TomShoot.bestRoundByType(false));
        assertEquals(rd4, TomShoot.bestRoundByType(true));
    }
    //testing the points earned for best round by type for cindy
    @Test
    public void shootingTest3() {
        res3.add(rds1);
        res3.add(rds2);
        res3.add(rds3);
        res3.add(rds4);
        //adds to the list

        //now the functions
        assertEquals(20, CindyShoot.pointsEarned(), 0.01);
        assertEquals(rds3, CindyShoot.bestRoundByType(true));
        assertEquals(rds1, CindyShoot.bestRoundByType(false));
    }

// testing the skiing results points earned

    @Test
    public void skiingTest1(){
        assertEquals(42, JimSki.pointsEarned(), 0.01);
        assertEquals(47, TomSki.pointsEarned(), 0.01);
        assertEquals(63, CindySki.pointsEarned(), 0.01);
    }

    //testing ther name to final score
    @Test
    public void competitionNametoFinalScoreTest(){
        athletes.add(Jim);
        athletes.add(Tom);
        athletes.add(Cindy);
        res1.add(r1);
        res1.add(r2);
        res1.add(r3);
        res1.add(r4);
        res2.add(rd1);
        res2.add(rd2);
        res2.add(rd3);
        res2.add(rd4);

        assertEquals(534, comp.finalScoreForAthlete("Jim"), 0.01);
        assertEquals(909, comp.finalScoreForAthlete("Tom"), 0.01);
    }


    Competition comp4 = new Competition(5, athletes);
//competiton DNF testing all names

    @Test
    public void competitionTestDNF() {
        res1.add(r1);
        res1.add(r2);
        res1.add(r3);
        res1.add(r4);
        res2.add(rd1);
        res2.add(rd2);
        res2.add(rd3);
        res2.add(rd4);
        res3.add(rds1);
        res3.add(rds2);
        res3.add(rds3);
        res3.add(rds4);
        athletes.add(Jim);
        athletes.add(Tom);
        athletes.add(Cindy);
        DNF.add("Jim");
        DNF.add("Tom");
        DNF.add("Cindy");
        assertEquals(DNF, comp4.shootingDNF());
    }
//empty list
    @Test
    public void competitionTestDNF2electricboogaloo() {
        res1.add(r1);
        res1.add(r2);
        res1.add(r3);
        res1.add(r4);
        res2.add(rd1);
        res2.add(rd2);
        res2.add(rd3);
        res2.add(rd4);
        res3.add(rds1);
        res3.add(rds2);
        res3.add(rds3);
        res3.add(rds4);
        athletes.add(Jim);
        athletes.add(Tom);
        athletes.add(Cindy);
        assertEquals(DNF, comp.shootingDNF());
    }



    LinkedList<Athlete> athletes4 = new LinkedList<Athlete>();

    LinkedList<ShootingRound> res13 = new LinkedList<ShootingRound>();
    ShootingRound qr1 = new ShootingRound(4, true);
    ShootingRound qr2 = new ShootingRound(1, true);
    ShootingRound qr3 = new ShootingRound(5, true);

    ShootingResult JimShoot4 = new ShootingResult(res13);
    SkiingResult JimSki4 = new SkiingResult(3, 12.2, 17.6, 11.8, 0.4, 3);
    FinalResult JimResult4 = new FinalResult(JimShoot4, JimSki4);
    Athlete Jim4 = new Athlete(JimResult4, "Jim");


    LinkedList<ShootingRound> res14 = new LinkedList<ShootingRound>();
    ShootingRound qrd1 = new ShootingRound(1, false);
    ShootingRound qrd2 = new ShootingRound(1, false);
    ShootingRound qrd3 = new ShootingRound(2, false);
    ShootingRound qrd4 = new ShootingRound(2, true);
    ShootingResult TomShoot4 = new ShootingResult(res14);
    SkiingResult TomSki4 = new SkiingResult(3, 17.2, 17.6, 11.8, 0.4, 5);
    FinalResult TomResult4 = new FinalResult(TomShoot4, TomSki4);
    Athlete Tom4 = new Athlete(TomResult4, "Tom");

    LinkedList<ShootingRound> res15 = new LinkedList<ShootingRound>();
    ShootingRound qrds1 = new ShootingRound(5, false);
    ShootingRound qrds2 = new ShootingRound(5, false);
    ShootingRound qrds3 = new ShootingRound(5, true);
    ShootingRound qrds4 = new ShootingRound(5, true);
    ShootingResult CindyShoot4 = new ShootingResult(res15);
    SkiingResult CindySki4 = new SkiingResult(1, 20, 24.2, 12.8, 6, 7);
    FinalResult CindyResult4 = new FinalResult(CindyShoot4, CindySki4);
    Athlete Cindy4 = new Athlete(CindyResult4, "Cindy");


    LinkedList<String> DNF1 = new LinkedList<String>();



//last one!
    @Test
    public void competitionTestDNF3() {
        athletes4.add(Jim4);
        athletes4.add(Tom4);
        athletes4.add(Cindy4);

        res13.add(qr1);
        res13.add(qr2);
        res13.add(qr3);

        res14.add(qrd1);
        res14.add(qrd2);
        res14.add(qrd3);
        res14.add(qrd4);

        res15.add(qrds1);
        res15.add(qrds2);
        res15.add(qrds3);
        res15.add(qrds4);

        Competition comp5 = new Competition(4, athletes4);




        DNF1.add("Jim");


        assertEquals(DNF1, comp5.shootingDNF());
    }





    MassStartResult massStart1 = new MassStartResult(1,1, 12.2, 17.6, 11.8, 0.4, 3);
    MassStartResult massStart2 = new MassStartResult(2,2, 18.2, 19.6, 9.8, 0.4, 5);
    MassStartResult massStart3 = new MassStartResult(1,1, 0, 0, 0, 0, 3);
    MassStartResult massStart4 = new MassStartResult(1,1, 0, 10.1, 0, 15.6, 3);
//mass start result tests
//points earned and get penalties
    @Test
    public void massStartTest(){
        assertEquals(42, massStart1.pointsEarned(), 0.01);
    }

    @Test
    public void massStartTest2(){
        assertEquals(25, massStart2.getPenalties(), 0.01);

    }
    @Test
    public void massStartTest3(){
        assertEquals(0, massStart3.pointsEarned(), 0.01);

    }
    @Test
    public void massStartTest4(){
        assertEquals(25.7, massStart4.pointsEarned(), 0.01);

    }

    //any improvement tests setup
    LinkedList<Athlete> athletes1 = new LinkedList<Athlete>();
    Competition comp1 = new Competition(4, athletes1);
    LinkedList<ShootingRound> res4 = new LinkedList<ShootingRound>();
    ShootingRound a1 = new ShootingRound(4, true);
    ShootingRound a2 = new ShootingRound(1, true);
    ShootingRound a3 = new ShootingRound(5, true);
    ShootingRound a4 = new ShootingRound(2, true);
    ShootingResult JimShoot1 = new ShootingResult(res4);
    SkiingResult JimSki1 = new SkiingResult(3, 12.2, 17.6, 11.8, 0.4, 3);
    FinalResult JimResult1 = new FinalResult(JimShoot1, JimSki1);
    Athlete Jim1 = new Athlete(JimResult1, "Jim");

    LinkedList<ShootingRound> res5 = new LinkedList<ShootingRound>();
    ShootingRound ad1 = new ShootingRound(1, false);
    ShootingRound ad2 = new ShootingRound(1, false);
    ShootingRound ad3 = new ShootingRound(2, false);
    ShootingRound ad4 = new ShootingRound(2, true);
    ShootingResult TomShoot1 = new ShootingResult(res5);
    SkiingResult TomSki1 = new SkiingResult(3, 17.2, 17.6, 11.8, 0.4, 5);
    FinalResult TomResult1 = new FinalResult(TomShoot1, TomSki1);
    Athlete Tom1 = new Athlete(TomResult1, "Tom");

    LinkedList<ShootingRound> res6 = new LinkedList<ShootingRound>();
    ShootingRound ads1 = new ShootingRound(5, false);
    ShootingRound ads2 = new ShootingRound(5, false);
    ShootingRound ads3 = new ShootingRound(5, true);
    ShootingRound ads4 = new ShootingRound(5, true);
    ShootingResult CindyShoot1 = new ShootingResult(res6);
    SkiingResult CindySki1 = new SkiingResult(1, 20, 24.2, 12.8, 6, 7);
    FinalResult CindyResult1 = new FinalResult(CindyShoot1, CindySki1);
    Athlete Cindy1 = new Athlete(CindyResult1, "Cindy");


//same comp numbers
    @Test
    public void anyImprovement(){
        athletes1.add(Jim1);
        athletes1.add(Tom1);
        athletes1.add(Cindy1);
        assertFalse(comp1.anyImprovement(comp));

    }

    LinkedList<Athlete> athletes2 = new LinkedList<Athlete>();
    Competition comp2 = new Competition(4, athletes2);
    LinkedList<ShootingRound> res7 = new LinkedList<ShootingRound>();
    ShootingRound b1 = new ShootingRound(4, true);
    ShootingRound b2 = new ShootingRound(1, true);
    ShootingRound b3 = new ShootingRound(5, true);
    ShootingRound b4 = new ShootingRound(2, true);
    ShootingResult JimShoot2 = new ShootingResult(res7);
    SkiingResult JimSki2 = new SkiingResult(3, 12.2, 17.6, 11.8, 0.4, 3);
    FinalResult JimResult2 = new FinalResult(JimShoot2, JimSki2);
    Athlete Jim2 = new Athlete(JimResult2, "Jim");

    LinkedList<ShootingRound> res8 = new LinkedList<ShootingRound>();
    ShootingRound bd1 = new ShootingRound(5, false);
    ShootingRound bd2 = new ShootingRound(5, false);
    ShootingRound bd3 = new ShootingRound(5, false);
    ShootingRound bd4 = new ShootingRound(5, true);
    ShootingResult TomShoot2 = new ShootingResult(res8);
    SkiingResult TomSki2 = new SkiingResult(1, 10.2, 10.6, 10.8, 0.1, 0);
    FinalResult TomResult2 = new FinalResult(TomShoot2, TomSki2);
    Athlete Tom2 = new Athlete(TomResult2, "Tom");

    LinkedList<ShootingRound> res9 = new LinkedList<ShootingRound>();
    ShootingRound bds1 = new ShootingRound(5, false);
    ShootingRound bds2 = new ShootingRound(5, false);
    ShootingRound bds3 = new ShootingRound(5, true);
    ShootingRound bds4 = new ShootingRound(5, true);
    ShootingResult CindyShoot2 = new ShootingResult(res9);
    SkiingResult CindySki2 = new SkiingResult(1, 20, 24.2, 12.8, 6, 7);
    FinalResult CindyResult2 = new FinalResult(CindyShoot2, CindySki2);
    Athlete Cindy2 = new Athlete(CindyResult2, "Cindy");

    //only one does better
    @Test
    public void anyImprovement2electricboogaloo(){
        athletes2.add(Jim2);
        athletes2.add(Tom2);
        athletes2.add(Cindy2);
        athletes1.add(Jim1);
        athletes1.add(Tom1);
        athletes1.add(Cindy1);
        assertTrue(comp2.anyImprovement(comp1));

    }
//everyone is maxed out
    LinkedList<Athlete> athletes3 = new LinkedList<Athlete>();
    Competition comp3 = new Competition(4, athletes3);
    LinkedList<ShootingRound> res10 = new LinkedList<ShootingRound>();
    ShootingRound cb1 = new ShootingRound(5, true);
    ShootingRound cb2 = new ShootingRound(5, true);
    ShootingRound cb3 = new ShootingRound(5, true);
    ShootingRound cb4 = new ShootingRound(5, true);
    ShootingResult JimShoot3 = new ShootingResult(res10);
    SkiingResult JimSki3 = new SkiingResult(1, 0.0, 0.0, 0.0, 0.0, 0);
    FinalResult JimResult3 = new FinalResult(JimShoot3, JimSki3);
    Athlete Jim3 = new Athlete(JimResult3, "Jim");

    LinkedList<ShootingRound> res11 = new LinkedList<ShootingRound>();
    ShootingRound cbd1 = new ShootingRound(5, false);
    ShootingRound cbd2 = new ShootingRound(5, false);
    ShootingRound cbd3 = new ShootingRound(5, false);
    ShootingRound cbd4 = new ShootingRound(5, true);
    ShootingResult TomShoot3 = new ShootingResult(res11);
    SkiingResult TomSki3 = new SkiingResult(1, 0.0, 0.0, 0.0, 0.0, 0);
    FinalResult TomResult3 = new FinalResult(TomShoot3, TomSki3);
    Athlete Tom3 = new Athlete(TomResult3, "Tom");

    LinkedList<ShootingRound> res12 = new LinkedList<ShootingRound>();
    ShootingRound cbds1 = new ShootingRound(5, false);
    ShootingRound cbds2 = new ShootingRound(5, false);
    ShootingRound cbds3 = new ShootingRound(5, true);
    ShootingRound cbds4 = new ShootingRound(5, true);
    ShootingResult CindyShoot3 = new ShootingResult(res12);
    SkiingResult CindySki3 = new SkiingResult(1, 0.0, 0.0, 0.0, 0.0, 7);
    FinalResult CindyResult3 = new FinalResult(CindyShoot3, CindySki3);
    Athlete Cindy3 = new Athlete(CindyResult3, "Cindy");

//no one does better
    @Test
    public void anyImprovement3(){
        athletes3.add(Jim3);
        athletes3.add(Tom3);
        athletes3.add(Cindy3);
        athletes1.add(Jim1);
        athletes1.add(Tom1);
        athletes1.add(Cindy1);
        assertFalse(comp3.anyImprovement(comp1));

    }































}






//HW 1 tests

//    //Jim is a better Skiier than Tom
//    @Test
//    public void testbetterSkiierTrue() {
//        assertTrue(Jim.betterSkiier(Tom));
//    }
//
//
//    @Test
//    public void testbetterSkiierFalse(){
//        assertFalse(Tom.betterSkiier(Jim));
//    }
//
//    //Jim is a better shooter than Tom
//    @Test
//    public void testbetterShooterTrue(){
//        assertTrue(Jim.betterShooter(Tom));
//    }
//
//    @Test
//    public void testbetterShooterFalse(){
//        assertFalse(Tom.betterShooter(Jim));
//    }
//
//    //Cindy is better shooter than Jim, but worse Skiier
//    @Test
//    public void testhasBeatenTrue(){
//        assertTrue(Cindy.hasBeaten(Jim));
//    }
//
//    //Jim is a better Skiier than Jin, but worse Shooter
//    @Test
//    public void testhasBeatenFalse(){
//        assertTrue(Jim.hasBeaten(Cindy));
//    }
//
//    //Jim is better shooter/skiier than Tom
//    @Test
//    public void testhasBeatenTrue1(){
//        assertTrue(Jim.hasBeaten(Tom));
//    }
//
//    //Jim is better shooter/skiier than Tom
//    @Test
//    public void testhasBeatenFalse1(){
//        assertFalse(Tom.hasBeaten(Jim));
//    }
//
//
//    //FinalResult file test cases:
//
//    //Jim 3rd place
//    @Test
//    public void testfinalScore(){
//        assertEquals(JimResult.finalScore(),534,0.01);
//    }
//
//    //ShootingResult file test cases:
//
//    @Test
//    public void testshootingpointsEarned(){
//        assertEquals(JimShoot.pointsEarned(),12, 0.01);
//    }
//
//    @Test
//    public void testshootinggetPenalties(){
//        assertEquals(JimShoot.getPenalties(),480, 0.01);
//    }
//
//    //SkiingResult file test cases:
//    @Test
//    public void testSkiingpointsEarned(){
//        assertEquals(JimSki.pointsEarned(),42, 0.01);
//    }
//    @Test
//    public void testSkiinggetPenalties(){
//        assertEquals(JimSki.getPenalties(),15, 0.01);
//    }
//
//    }
//


