package com.adiller.studyjam.thanksgiving911;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toggleSolution1(View view) {
        TextView t = (TextView)findViewById(R.id.solution1);
        if (t.getVisibility() == View.GONE) {
            t.setVisibility(View.VISIBLE);
        } else {
            t.setVisibility(View.GONE);
        }
    }

    public void toggleSolution2(View view) {
        TextView t = (TextView)findViewById(R.id.solution2);
        if (t.getVisibility() == View.GONE) {
            t.setVisibility(View.VISIBLE);
        } else {
            t.setVisibility(View.GONE);
        }
    }

    public void toggleSolution3(View view) {
        TextView t = (TextView)findViewById(R.id.solution3);
        if (t.getVisibility() == View.GONE) {
            t.setVisibility(View.VISIBLE);
        } else {
            t.setVisibility(View.GONE);
        }
    }

    public void toggleSolution4(View view) {
        TextView t = (TextView)findViewById(R.id.solution4);
        if (t.getVisibility() == View.GONE) {
            t.setVisibility(View.VISIBLE);
        } else {
            t.setVisibility(View.GONE);
        }
    }

    public void toggleSolution5(View view) {
        TextView t = (TextView)findViewById(R.id.solution5);
        if (t.getVisibility() == View.GONE) {
            t.setVisibility(View.VISIBLE);
        } else {
            t.setVisibility(View.GONE);
        }
    }

}
