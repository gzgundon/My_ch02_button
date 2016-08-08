package com.eec.qi.my_ch02_button;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int size=30; // init value 30 sp
    int flag=0;
    public void bigger(View v) {
        TextView txv;
        txv= (TextView) findViewById(R.id.txv);
        if(flag==0) {
            txv.setTextSize(++size);
            if(size==40)
                flag=1;
        }
        if (flag == 1) {
            txv.setTextSize(--size);
            if(size==30)
                flag=0;
        }



    }
}
