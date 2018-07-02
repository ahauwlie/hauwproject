package com.pointwar.hauwproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TextView;

public class menu_awal extends AppCompatActivity {
    Button sub;
//    Button englishBut,indoBut;
//    TextView languageText;
//    TableLayout languagePick;
    Animation frombottom, fromtop;
    ImageView ballon1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_awal);
        sub = findViewById(R.id.sub);
        ballon1 = (ImageView) findViewById(R.id.ballon1);
//        languageText = (TextView) findViewById(R.id.languageText);
//        languagePick = (TableLayout) findViewById(R.id.languagePick);
//        languageText.setVisibility(View.INVISIBLE);
//        languagePick.setVisibility(View.INVISIBLE);
        fromtop = AnimationUtils.loadAnimation(this, R.anim.fromtop);
        frombottom = AnimationUtils.loadAnimation(this, R.anim.frombottom);
        sub.setAnimation(frombottom);
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                languageText.setAnimation(frombottom);
//                languagePick.setAnimation(frombottom);
//                languageText.setVisibility(View.VISIBLE);
//                languagePick.setVisibility(View.VISIBLE);
                Intent i = new Intent(menu_awal.this, login.class);
                startActivity(i);
                finish();
            }
        });
        ballon1.setAnimation(fromtop);
//        englishBut = (Button) findViewById(R.id.englishBtn);
//        englishBut.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i = new Intent(menu_awal.this, login.class);
//                i.putExtra("LANG","ENG");
//                startActivity(i);
//                finish();
//            }
//        });
//        indoBut = (Button) findViewById(R.id.indoBtn);
//        indoBut.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i = new Intent(menu_awal.this, login.class);
//                i.putExtra("LANG","INDO");
//                startActivity(i);
//                finish();
//            }
//        });
    }
}
