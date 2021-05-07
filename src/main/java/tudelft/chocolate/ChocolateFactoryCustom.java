package tudelft.chocolate;

public class ChocolateFactoryCustom {

    public final int SMALL_BAR_WEIGHT = 1;
    public final int BIG_BAR_WEIGHT = 5;

    public int calculateBarsInPackage(int totalSmallBars, int totalBigBars, int capacity) {
        int smallBarsUsed = 0;
        while (capacity != 0) {
            if (capacity >= BIG_BAR_WEIGHT && totalBigBars > 0) {
                totalBigBars -= 1;
                capacity -= BIG_BAR_WEIGHT;
            } else if (capacity >= SMALL_BAR_WEIGHT && totalSmallBars > 0) {
                smallBarsUsed += 1;
                totalSmallBars -= 1;
                capacity -= SMALL_BAR_WEIGHT;
            } else {
                return -1;
            }
        }
        return smallBarsUsed;
    }
}
