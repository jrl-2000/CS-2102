
class Shark extends Fish {
    int attacks;

    Shark (int length, int attacks) {
        super(length, 3.75);
        this.attacks = attacks;
    }

    // note: no isNormalSize method because Shark inherits that
    public boolean isLenWithin(int low) {
        return low <= this.length;
    }

    @Override
    public boolean isNormalSize() {
        return isLenWithin(6);

    }

    public boolean isDangerToPeople(){
        if (attacks == 0){
            return false;
        }
        else{
            return true;
        }

    }


}