package cs301.birthdaycake;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.util.Log;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main);
        CakeView cakeview = findViewById(R.id.cakeview);
        CakeController cakeController = new CakeController(cakeview);


        Button blowOut = findViewById(R.id.blowButton);
        blowOut.setOnClickListener(cakeController);

        Switch candles = findViewById(R.id.candlesSwitch);
        candles.setOnCheckedChangeListener(cakeController);

        SeekBar candleBar = findViewById(R.id.seekCandle);
        candleBar.setOnSeekBarChangeListener(cakeController);
    }

    public void goodbye(View button){
        Log.i("button", "Goodbye");
        finishAffinity();
    }
}
