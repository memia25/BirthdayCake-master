package cs301.birthdaycake;

import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.SeekBar;

public class CakeController implements View.OnClickListener, CompoundButton.OnCheckedChangeListener, SeekBar.OnSeekBarChangeListener, View.OnTouchListener{

    private CakeView cakeLooky;
    private CakeModel cakeGoodLooking;

    public CakeController(CakeView viewCake) {
        cakeLooky = viewCake;
        cakeGoodLooking = cakeLooky.getCakeGoodLooking();
    }

    public void onClick(View view) {
        Log.d("debug", "onClick worked");
        cakeGoodLooking.candlesOn = false;
        cakeLooky.invalidate();

    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        cakeGoodLooking.hasCandles = b;
        cakeLooky.invalidate();
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
        cakeGoodLooking.numCandles = i;
        cakeLooky.invalidate();

    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        cakeGoodLooking.x = motionEvent.getX();
        cakeGoodLooking.y = motionEvent.getY();
        cakeLooky.invalidate();
        return true;
    }
}



