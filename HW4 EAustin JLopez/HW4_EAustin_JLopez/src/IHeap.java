import java.util.Random;

interface IHeap extends IBinTree {
    // adds given element to the heap without removing other elements
    IHeap addElt(int e);

    // removes one occurrence of the smallest element from the heap
    IHeap remMinElt();

    // Merge the current heap with another heap
    IHeap merge(IHeap withHeap);

    // Determine if the root of this heap is bigger than the given element
    boolean isBigger(int e);
    //we want a get right and get left to get the right and left nodes of a BST we also want data at each node
    IHeap getLeft();
    IHeap getRight();

    int getData();

}




