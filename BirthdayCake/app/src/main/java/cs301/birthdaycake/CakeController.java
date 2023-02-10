package cs301.birthdaycake;

public class CakeController {

    private CakeView cakeLooky;
    private CakeModel cakeGoodLooking;
    public CakeController(CakeView viewCake) {
        cakeLooky = viewCake;
        cakeGoodLooking = cakeLooky.getCakeGoodLooking();
    }
}



