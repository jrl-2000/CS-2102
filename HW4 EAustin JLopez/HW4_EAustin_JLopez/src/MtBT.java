class MtBT implements IBinTree {
    MtBT(){}

    // returns false since empty tree has no elements
    public boolean hasElt(int e) {

        return false;
    }

    // returns 0 since enpty tree has no elements
    public int size() {

        return 0;
    }

    // returns 0 since empty tree has no branches
    public int height() {

        return 0;
    }

    @Override
    public IBinTree getLeft() {

        return null;
    }

    @Override
    public IBinTree getRight() {

        return null;
    }

    @Override
    public int getData() {

        return 0;
    }

    //Added

    public boolean hasRestElt(IBinTree tree){

        return true;
    }
    /**
     * counts the number of times an element appears in a B tree
     * @param e element we are looking for
     * @return the number of time that element (e) appears in a tree
     */
    @Override
    public int countElt(int e) {
        return 0;
    }

    /**
     * checks to see all the elements in the
     * @param hOrig
     * @param e
     * @param hAdded
     * @return
     */
    @Override
    public boolean allAccountedFor(IHeap hOrig, int e, IBinTree hAdded) {
        return true;
    }

    @Override
    public boolean allAccountedForMinus1(IHeap hOrig, IBinTree hRemoved) {
        return true;
    }

    @Override
    public boolean isBigger(int data) {
        return true;
    }

    @Override
    public boolean testHeap(IBinTree aTree) {
        return true;
    }

    @Override
    public IBinTree remMinElt() {
        return null;
    }



}
