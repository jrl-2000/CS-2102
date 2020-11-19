public class DataAVL {

    IAVL r;
    IAVL l;
    String data;


    public DataAVL(String data, IAVL l, IAVL r) {
        this.l = l;
        this.r = r;
        this.data = data;
    }


    // returns the number of distinct elements in the BST
    public int size() {
        return 1 + this.l.size() + this.r.size();
    }


    public IAVL addElt (String elt) {
        if (elt.equals(this.data))
            return this; // not storing duplicate values
        else if (elt.compareTo(this.data) < 0)
            return new DataAVL (this.data,
                    this.l.addElt(elt),
                    this.r);
        else // elt > this.data
            return new DataAVL (this.data,
                    this.l,
                    this.r.addElt(elt));
    }


    // determines whether the given element is in the BST
    public boolean hasElt (String elt) {
        if (elt.equals(this.data))
            return true;
        else if (elt.compareTo(this.data) < 0)
            return this.l.hasElt(elt);
        else // elt > this.data
            return this.r.hasElt(elt);
    }



}
