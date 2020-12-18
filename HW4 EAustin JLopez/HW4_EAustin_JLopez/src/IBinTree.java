import java.lang.Math;

interface IBinTree {
    // determines whether element is in the tree
    boolean hasElt(int e);
    // returns number of nodes in the tree; counts duplicate elements as separate items
    int size();
    // returns depth of longest branch in the tree
    int height();
    //we want a get right and get left to get the right and left nodes of a BST we also want data at each node
    IBinTree getLeft();
    IBinTree getRight();
    int getData();


    //Added


    int countElt(int e);

    boolean allAccountedFor(IHeap hOrig, int e, IBinTree hAdded);
    boolean allAccountedForMinus1(IHeap hOrig, IBinTree hRemoved);

    boolean isBigger(int data);

    boolean testHeap(IBinTree aTree);

    IBinTree remMinElt();




}



