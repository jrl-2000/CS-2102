public class HeapChecker {

    public HeapChecker() {
    }

    /**
     * adds an element to a heap and check to see if the new heap is valid
     *
     * @param hOrig  test heap
     * @param elt    the element you want to add
     * @param hAdded the tree to pass in
     * @return a boolean to check if the tree is valid solution
     */
    boolean addEltTester(IHeap hOrig, int elt, IBinTree hAdded) {
        //...code to compare hOrig and hAdded around the addition of elt as appropriate...
        if (hAdded.size() == 0) {
            return false;
        } else {
            if (testHeap(hOrig)) {
                //Checks to see if they're heaps and if the new element was added
                if (testHeap(hAdded) && hAdded.hasElt(elt)) {
                    //Does it still have all the previous elements
                    if (hOrig.allAccountedFor(hOrig, elt, hAdded)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }


    /**
     * removes the smallest element in a heap and tests to see if the heap
     *
     * @param hOrig    a test heap
     * @param hRemoved the tree to remove the element
     * @return a boolean whether the new heap is valid for removing the minimum element
     */
    boolean remMinEltTester(IHeap hOrig, IBinTree hRemoved) {
        //...code to compare hOrig and hRemoved as appropriate...
        if (hRemoved.getData() == 0 && hRemoved.size() == 0) {
            return true;
        } else {
            if (testHeap(hOrig)) {
                if (testHeap(hRemoved) && hRemoved.allAccountedForMinus1(hOrig, hRemoved)) {
                    return true;
                }
            }
        }
        return false;
    }


    //Added

    /**
     * tests to see if a Binary Tree is considered a heap
     *
     * @param aTree a tree to be tested
     * @return a boolean whether it's a heap (true) or not a heap (false)
     */
    boolean testHeap(IBinTree aTree) {

        if (aTree.getRight() == new MtBT() && aTree.getLeft() == new MtBT()) {
            return true;
        }

        if (aTree.getRight().isBigger(aTree.getData()) && aTree.getLeft().isBigger(aTree.getData())) {
            return aTree.getRight().testHeap(aTree) && aTree.getLeft().testHeap(aTree);
        } else {
            return false;
        }
    }
}


















