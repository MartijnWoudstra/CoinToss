package martijn.coin;

/**
 * Created by Martijn on 11-12-2015.
 */
public enum Side {

    HEADS(0), TAILS(1);

    private final int INTPRESENTATION;

    Side(int presentation) {
        this.INTPRESENTATION = presentation;
    }

    public int getIntpresentation() {
        return INTPRESENTATION;
    }
}
