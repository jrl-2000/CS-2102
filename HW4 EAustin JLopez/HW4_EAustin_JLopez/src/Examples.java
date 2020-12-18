import static org.junit.Assert.*;

import org.junit.Test;

public class Examples {

    HeapChecker HT = new HeapChecker();
    DataHeap heapA = new DataHeap(1);
    DataHeap heapB = new DataHeap(2);
    DataHeap heapC = new DataHeap(3);


    IBinTree btempty = new MtHeap();
    IBinTree btempty1 = new DataHeap(1, new MtHeap(), new MtHeap());
    IHeap hempty = new MtHeap();
    DataHeap test = new DataHeap(1, heapB, heapC);
    IBinTree testbt = test.addElt(4);
    DataHeap sameNumH = new DataHeap(3, heapC, heapC);
    IBinTree sameNumBT = sameNumH.addElt(3);
    DataHeap notaHeap =  new DataHeap(3,heapB,heapA);
    IBinTree notHeap = notaHeap.addElt(1);
    DataHeap multdata = new DataHeap(2, new DataHeap(7, new DataHeap(15, new MtHeap(), new MtHeap()), new DataHeap(17, new MtHeap(), new MtHeap())), new DataHeap(19, new MtHeap(), new MtHeap()));
    IBinTree multitree = new DataHeap(2, new DataHeap(7, new DataHeap(15, new MtHeap(), new MtHeap()), new DataHeap(17, new MtHeap(), new MtHeap())), new DataHeap(8, new MtHeap(), new DataHeap(19, new MtHeap(), new MtHeap())));
    DataHeap multdata1 = new DataHeap(2, new DataHeap(3, new DataHeap(5, new MtHeap(), new MtHeap()), new DataHeap(6, new MtHeap(), new MtHeap())), new DataHeap(4, new DataHeap(7, new MtHeap(), new MtHeap()), new DataHeap(8, new MtHeap(), new MtHeap())));
    IBinTree removemultidata = new DataHeap(3, new DataHeap(5, new DataHeap(6, new MtHeap(), new MtHeap()), new MtHeap()), new DataHeap(4, new DataHeap(7, new MtHeap(), new MtHeap()), new DataHeap(8, new MtHeap(), new MtHeap())));
    IBinTree remove = test.remMinElt();
    DataHeap test2 = new DataHeap(1, heapC, new MtHeap());
    IBinTree testbt2 = test.remMinElt();
    IBinTree getSameNumRemBT = sameNumH.remMinElt();
    IBinTree getnotHeap = notaHeap.remMinElt();




    //addEltTester test cases:
    //empty test
    @Test
    public void testempty(){
        assertFalse(HT.addEltTester(hempty, 1, btempty));
    }

    //tests a normal case of adding a element to a heap
    @Test
    public void testnormal(){
        assertTrue(HT.addEltTester(test, 4, testbt));

    }

    //tests duplicate numbers
    @Test
    public void sameNumbers(){
        assertTrue(HT.addEltTester(sameNumH, 3, sameNumBT));
    }


    //not a heap
    @Test
    public void noHeapOg(){
        assertFalse(HT.addEltTester(notaHeap, 1, notHeap));
    }

    //tests to see if a element is placed in the correct spot within a heap with multiple elements
    @Test
    public void multipleElements(){
        assertTrue(HT.addEltTester(multdata, 8, multitree));
    }

    //tests the all Accounted for helper method
    @Test
    public void test6(){
        assertTrue(test.allAccountedFor(test,4, testbt));
    }

//remMinEltTester test cases:
// empty
    @Test
    public void atest1(){
        assertTrue(HT.remMinEltTester(hempty,btempty));
    }

    //removing an element from a heap
    @Test
    public void atest2(){
        assertFalse(HT.remMinEltTester(test, remove));
    }

    //duplicate testing removal
    @Test
    public void atest3(){
        assertTrue(HT.remMinEltTester(sameNumH,getSameNumRemBT));
    }

    //not a heap
    @Test
    public void atest4(){
        assertFalse(HT.remMinEltTester(notaHeap, getnotHeap));
    }

    //removing an element from a heap with multiple elements
    @Test
    public void atest5(){
        assertFalse(HT.remMinEltTester(multdata1, removemultidata));
    }

    //test for the all accounted for minus 1
    @Test
    public void atest6(){
        assertTrue(test2.allAccountedForMinus1(test2, testbt2));
    }

}
