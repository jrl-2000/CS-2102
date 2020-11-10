import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.Before;
import org.junit.Test;

public class Examples {
    WordList wList;
    Dictionary dict;

    public Examples() {
    }

    @Before
    public void setup() {
        wList = new WordList();
        wList.addWord("apples");
        wList.addWord("pears");
    }



    @Test
    public void testWordsLongerThan1() {
        LinkedList<String> expected = new LinkedList<String>();
        expected.addLast("pears");
        expected.addLast("apples");
        assertEquals(wList.wordsLongerThan(3), expected);
    }



    @Test
    public void testLinkedList() {
        dict = new Dictionary();
        dict.addWord("apples");
        dict.addWord("pears");
        assertEquals(dict.words, wList.words);
    }
//    //Brochure
//    public class Brochure {
//
//
//        String type;
//        public Brochure(String type) {
//            this.type = type;
//        }
//
//    }
//
////BrochureList
//import java.util.LinkedList;
//    public class BrochureList {
//
//
//        LinkedList<Brochure> bList;
//
//        public BrochureList() {
//
//            this.bList = new LinkedList<Brochure>();
//        }
//
//        public BrochureList(LinkedList<Brochure> bList) {
//
//            this.bList = bList;
//        }
//
//
//        public void addBrochure(Brochure item) {
//
//            bList.add(item);
//        }
//
//
//        public LinkedList<Brochure> getAutoBrochures() {
//
//            LinkedList<Brochure> autoBrochures = new LinkedList<Brochure>();
//
//            for(Brochure s : bList) {
//
//                if(s.type.equals("auto")) {
//
//                    autoBrochures.add(s);
//                }
//            }
//
//            return autoBrochures;
//        }
//    }















}




