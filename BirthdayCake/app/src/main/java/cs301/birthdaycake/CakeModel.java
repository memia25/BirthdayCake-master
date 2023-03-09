package cs301.birthdaycake;

public class CakeModel {

    public boolean candlesOn;
    public int numCandles;
    public boolean hasFrosting;
    public boolean hasCandles;
    public float x;
    public float y;

    public CakeModel() {
        numCandles = 2;
        hasFrosting = true;
        hasCandles = true;
        candlesOn = true;
        x = -1;
        y = -1;
    }
}
