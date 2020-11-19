public class EmptyAVL implements IAVL {
    EmptyAVL(){}



    // returns the number of distinct elements in the BST
    @Override
    public int size () { return 0; }

    // returns BST containing all existing elements and the given element
    @Override
    public IAVL addElt (String elt) {
        return new DataAVL(elt, new EmptyAVL(), new EmptyAVL());
    }

    // determines whether the given element is in the BST
    @Override
    public boolean hasElt (String elt) { return false; }





}
