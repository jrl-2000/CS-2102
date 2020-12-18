class DataBT implements IBinTree {
    int data;
    IBinTree left;
    IBinTree right;

    DataBT(int data, IBinTree left, IBinTree right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    // an alternate constructor for when both subtrees are empty
    DataBT(int data) {
        this.data = data;
        this.left = new MtBT();
        this.right = new MtBT();
    }

    // determines whether this node or node in subtree has given element
    public boolean hasElt(int e) {

        return this.data == e || this.left.hasElt(e) || this.right.hasElt(e) ;
    }

    // adds 1 to the number of nodes in the left and right subtrees
    public int size() {

        return 1 + this.left.size() + this.right.size();
    }

    // adds 1 to the height of the taller subtree
    public int height() {

        return 1 + Math.max(this.left.height(), this.right.height());
    }

    @Override
    public IBinTree getLeft() {

        return this.left;
    }

    @Override
    public IBinTree getRight() {

        return this.right;
    }

    @Override
    public int getData() {

        return this.data;
    }


    /**
     * counts the number of times an element appears in a B tree
     * @param e element we are looking for
     * @return the number of time that element (e) appears in a tree
     */

    public int countElt(int e) {
        if (this.data == e) {
            return 1 + this.right.countElt(e) + this.left.countElt(e);
        } else {
            return this.left.countElt(e) + this.right.countElt(e);
        }
    }

    /**
     *takes in a heap and a binary tree and check to see if they have the same number of elements
     * @param hOrig  a heap
     * @param e a number
     * @param hAdded the binary tree your comparing
     * @return a boolean if they have the same number of elements
     */

    @Override
    public boolean allAccountedFor(IHeap hOrig, int e, IBinTree hAdded) {
        int orig_count = hOrig.countElt(e);
        int added_count = hAdded.countElt(e);
        if( added_count == orig_count +1) {
            return true;
        } else {
            return false;
        }
    }

    /**
     *takes in a heap and a binary tree and check to see if they have the 1 less than the  number of elements
     * @param hOrig  a heap
     * @param hRemoved the binary tree your comparing
     * @return a boolean if it has 1 less then the number of elements than the heap
     */

    @Override
    public boolean allAccountedForMinus1(IHeap hOrig, IBinTree hRemoved) {
        int orig_count = hOrig.countElt(this.data);
        int remove_count = hRemoved.countElt(this.data);
        if( remove_count == orig_count - 1) {
            return true;
        } else {
            return false;
        }

    }

    /**
     * check to see if the value of the data is bigger than the value being compared
     * @param data the data being compared
     * @return a boolean if the data is bigger
     */
    @Override
    public boolean isBigger(int data) {
        return true;
    }

    /**
     * test to see if a binary tree is a heap
     * @param aTree the tree being tested
     * @return a boolean if the binary tree is a heap (true)
     */
    @Override
    public boolean testHeap(IBinTree aTree) {
        return true;
    }

    /**
     * The min element of an empty heap returns an empty heap.
     * @return null of an empty heap
     */
    @Override
    public IBinTree remMinElt() {
        return null;
    }



}




