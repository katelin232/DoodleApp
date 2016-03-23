package com.example.katelinmontgomery.newdoodle;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by katelinmontgomery on 3/22/16.
 */
public class BrushTool extends Activity {
    Button back;

    private Button p1;
    private Button p2;
    private Button p3;
    private Button p4;
    private Button p5;

    private Button n1;
    private Button n2;
    private Button n3;
    private Button n4;
    private Button n5;

    private Button r1;
    private Button r2;
    private Button r3;
    private Button r4;
    private Button r5;

    private Button b1;
    private Button b2;
    private Button b3;
    private Button b4;
    private Button b5;

    private Button o1;
    private Button o2;
    private Button o3;
    private Button o4;
    private Button o5;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.brush_activity);
        back = (Button) findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        /*******************PASTELS************************/
        p1 = (Button) findViewById(R.id.p1);
        p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                DoodleView.doodleView.setColor(232, 211, 255);
            }
        });

        p2 = (Button) findViewById(R.id.p2);
        p2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DoodleView.doodleView.setColor(140, 224, 249);
            }
        });

        p3 = (Button) findViewById(R.id.p3);
        p3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DoodleView.doodleView.setColor(167, 253, 186);
            }
        });

        p4 = (Button) findViewById(R.id.p4);
        p4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DoodleView.doodleView.setColor(255, 231, 164);
            }
        });

        p5 = (Button) findViewById(R.id.p5);
        p5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DoodleView.doodleView.setColor(253, 214, 233);
            }
        });

        /*******************NEONS************************/
        n1 = (Button) findViewById(R.id.n1);
        n1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DoodleView.doodleView.setColor(255, 40, 226);
            }
        });

        n2 = (Button) findViewById(R.id.n2);
        n2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DoodleView.doodleView.setColor(255, 181, 32);
            }
        });

        n3 = (Button) findViewById(R.id.n3);
        n3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DoodleView.doodleView.setColor(227, 255, 48);
            }
        });

        n4 = (Button) findViewById(R.id.n4);
        n4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DoodleView.doodleView.setColor(169, 254, 88);
            }
        });

        n5 = (Button) findViewById(R.id.n5);
        n5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DoodleView.doodleView.setColor(5, 254, 221);
            }
        });

        /*******************NEONS************************/
        r1 = (Button) findViewById(R.id.r1);
        r1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DoodleView.doodleView.setColor(245, 30, 27);
            }
        });

        r2 = (Button) findViewById(R.id.r2);
        r2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DoodleView.doodleView.setColor(247, 224, 16);
            }
        });

        r3 = (Button) findViewById(R.id.r3);
        r3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DoodleView.doodleView.setColor(19, 29, 236);
            }
        });

        r4 = (Button) findViewById(R.id.r4);
        r4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DoodleView.doodleView.setColor(28, 120, 40);
            }
        });

        r5 = (Button) findViewById(R.id.r5);
        r5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DoodleView.doodleView.setColor(0, 0, 0);
            }
        });


        /*******************Widths************************/
        b1 = (Button) findViewById(R.id.b1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DoodleView.doodleView.setWidth(5);
            }
        });

        b2 = (Button) findViewById(R.id.b2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DoodleView.doodleView.setWidth(10);
            }
        });

        b3 = (Button) findViewById(R.id.b3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DoodleView.doodleView.setWidth(20);
            }
        });

        b4 = (Button) findViewById(R.id.b4);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DoodleView.doodleView.setWidth(30);
            }
        });

        b5 = (Button) findViewById(R.id.b5);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 DoodleView.doodleView.setWidth(50);
            }
        });

        /*******************OPACITY************************/
        o1 = (Button) findViewById(R.id.o1);
        o1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DoodleView.doodleView.setOpacity(0);
            }
        });

        o2 = (Button) findViewById(R.id.o2);
        o2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DoodleView.doodleView.setOpacity(63);
            }
        });

        o3 = (Button) findViewById(R.id.o3);
        o3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DoodleView.doodleView.setOpacity(127);
            }
        });

        o4 = (Button) findViewById(R.id.o4);
        o4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DoodleView.doodleView.setOpacity(190);
            }
        });

        o5 = (Button) findViewById(R.id.o5);
        o5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DoodleView.doodleView.setOpacity(255);
            }
        });
    }
   }





