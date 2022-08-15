package com.example.fisher_hanbook;

import android.graphics.Typeface;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.content.Intent;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Text_Content_Activity extends AppCompatActivity {
    private TextView text_content;
    private Typeface face1;
    private ImageView iContent;
    private int category = 0;
    private int position = 0;
    private int[] array_fish = {R.string.fish1, R.string.fish2, R.string.fish3, R.string.fish4, R.string.fish5};
    private int[] array_na = {R.string.na1, R.string.na2, R.string.na3};
    private int[] array_sna = {R.string.sna1, R.string.sna2, R.string.sna3};
    private int[] array_pri = {R.string.pri1, R.string.pri2, R.string.pri3};
    private int[] array_history = {R.string.history1, R.string.history2, R.string.history3};
    private int[] array_advice = {R.string.advice1, R.string.advice2, R.string.advice3};
    private int[] array_image_fish = {R.drawable.ic_carp, R.drawable.ic_big_pike, R.drawable.ic_catfish, R.drawable.ic_fish__1_, R.drawable.ic_fish__2_};
    private int[] array_image_na = {R.drawable.ic_worm, R.drawable.ic_corn__2_, R.drawable.ic_bread};
    private int[] array_image_sna = {R.drawable.ic_sinker, R.drawable.ic_fishing_hook, R.drawable.ic_fishing};
    private int[] array_image_pri = {R.drawable.ic_worm, R.drawable.ic_corn__2_, R.drawable.ic_bread};
    private int[] array_image_history = {R.drawable.ic_fisherman, R.drawable.ic_fisherman, R.drawable.ic_fisherman};
    private int[] array_image_advice = {R.drawable.ic_ocean, R.drawable.ic_ocean, R.drawable.ic_ocean};

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.text_content);
        init();

        resivIntent();
    }

    private void init() {
        text_content = findViewById(R.id.text_main_content);
        iContent = findViewById(R.id.imageContent);
        face1 = Typeface.createFromAsset(this.getAssets(), "fonts/RobotoC.ttf");
        text_content.setTypeface(face1);
    }

    private void resivIntent() {
        Intent i = getIntent();
        if (i != null) {
            category = i.getIntExtra("category", 0);
            position = i.getIntExtra("position", 0);
        }
        switch (category) {
            case 0:
                iContent.setImageResource(array_image_fish[position]);
                text_content.setText(array_fish[position]);
                break;
            case 1:
                iContent.setImageResource(array_image_na[position]);
                text_content.setText(array_na[position]);
                break;
            case 2:
                iContent.setImageResource(array_image_sna[position]);
                text_content.setText(array_sna[position]);
                break;
            case 3:
                iContent.setImageResource(array_image_pri[position]);
                text_content.setText(array_pri[position]);
                break;
            case 4:
                iContent.setImageResource(array_image_history[position]);
                text_content.setText(array_history[position]);
                break;
            case 5:
                iContent.setImageResource(array_image_advice[position]);
                text_content.setText(array_advice[position]);
                break;

        }
    }
}
