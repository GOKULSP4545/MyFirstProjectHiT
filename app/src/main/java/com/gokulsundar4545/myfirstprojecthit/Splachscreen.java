package com.gokulsundar4545.myfirstprojecthit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class Splachscreen extends AppCompatActivity {

    ImageView Splachimage1;
    TextView Txt,Txt1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splachscreen);


        Splachimage1=findViewById(R.id.Splachimage);
        Txt=findViewById(R.id.Txt);
        Txt1=findViewById(R.id.Txt1);

        Animation animation= AnimationUtils.loadAnimation(this,R.anim.splachscreen);
        Splachimage1.setAnimation(animation);
        Txt.setAnimation(animation);
        Txt1.setAnimation(animation);



        Handler handler=new Handler();

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(Splachscreen.this,MainActivity.class);
                startActivity(intent);

            }
        },2000);



    }
}