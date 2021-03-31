package com.example.btnwilnnerclass;

import android.view.View;

public class myOnClickListener implements View.OnClickListener {
    MainActivity mainActivity;
    public myOnClickListener(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
    }

    @Override
    public void onClick(View v) {
        mainActivity.mTextview1.setText("you clicked button 1");
    }
}
