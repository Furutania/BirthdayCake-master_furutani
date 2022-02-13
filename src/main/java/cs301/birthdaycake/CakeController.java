package cs301.birthdaycake;

import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.SeekBar;

public class CakeController implements View.OnClickListener, CompoundButton.OnCheckedChangeListener, SeekBar.OnSeekBarChangeListener {
        private CakeView cakeView;
        private CakeModel cakeModel;

        public CakeController(CakeView cv) {
            cakeView = cv;
            cakeModel = cv.getCake();
        }

    @Override
    public void onClick(View v) {
        Log.d("v", "blowout");
        cakeModel.candleLit = false;
        cakeView.invalidate();
    }


    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        Log.d("buttonView", "Candles on or off");

        cakeModel.candles = isChecked;
        cakeView.invalidate();
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        Log.i("seekBar", "Moving");
        cakeModel.numCandles = progress;
        cakeView.invalidate();
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}
