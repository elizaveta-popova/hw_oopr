package transport;

public enum Seats {
    EXTRASMALL (1, 10),
    SMALL (10, 25) ,
    MEDIUM (40,50),
    BIG (60, 80),
    EXTRABIG (100, 120);
    private final int minnumber;
    private final int maxnumber;

    @Override
    public String toString() {
        return "Вместимость: " + minnumber + "-" + maxnumber + " мест.";
    }

    Seats(int minnumber, int maxnumber) {
        this.minnumber = minnumber;
        this.maxnumber = maxnumber;
    }

    public int getMinnumber() {
        return minnumber;
    }

    public int getMaxnumber() {
        return maxnumber;
    }
}
