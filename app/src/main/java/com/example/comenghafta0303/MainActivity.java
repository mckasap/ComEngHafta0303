package com.example.comenghafta0303;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvCarpim;
    TextView tvSonuc;

    SeekBar sb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sb=(SeekBar) findViewById(R.id.seekBar);
        tvCarpim= (TextView) findViewById(R.id.textView);
        tvSonuc= (TextView) findViewById(R.id.textView2);
        update_();
        sb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                update_();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }

    private  void update_(){

        tvCarpim.setText(""+sb.getProgress());
        int times= sb.getProgress();
        StringBuilder sb= new StringBuilder("");
        for(int i=1;i<12;i++)
        {
            sb.append(times+"*"+i+"="+(times*i)+"\n");
        }
        tvSonuc.setText(sb.toString());
    }
}