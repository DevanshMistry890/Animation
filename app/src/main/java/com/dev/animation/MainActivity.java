package com.dev.animation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import android.graphics.Color;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private CardView rotor;
    private Animation rotate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rotate= AnimationUtils.loadAnimation(this,R.anim.rotate);
        TextView rad2 = findViewById(R.id.r2);
        TextView rad4 = findViewById(R.id.r4);
        TextView rad6 = findViewById(R.id.r6);
        rotor=findViewById(R.id.rotor);
        rad2.setOnClickListener(v -> changeradius(95,"#ff0000"));
        rad4.setOnClickListener(v -> changeradius(155,"#0000ff"));
        rad6.setOnClickListener(v -> changeradius(205,"#008F00"));
    }
    private void changeradius(int i, String color) {
        rotor.startAnimation(rotate);
        ViewGroup.LayoutParams params = rotor.getLayoutParams();
        params.width=i;
        params.height=i;
        rotor.setRadius(i/2);
        rotor.setCardBackgroundColor(Color.parseColor(color));
        rotor.setLayoutParams(params);
    }

}