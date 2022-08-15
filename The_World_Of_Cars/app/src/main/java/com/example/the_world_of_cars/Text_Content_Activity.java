package com.example.the_world_of_cars;

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
    private int[] array_american_cars = {R.string.american_cars1, R.string.american_cars2, R.string.american_cars3,
            R.string.american_cars4, R.string.american_cars5, R.string.american_cars6, R.string.american_cars7, R.string.american_cars8,
            R.string.american_cars9, R.string.american_cars10, R.string.american_cars11};
    private int[] array_european_cars = {R.string.european_cars1, R.string.european_cars2, R.string.european_cars3, R.string.european_cars4,
            R.string.european_cars5, R.string.european_cars6, R.string.european_cars7, R.string.european_cars8, R.string.european_cars9,
            R.string.european_cars10, R.string.european_cars11, R.string.european_cars12, R.string.european_cars13, R.string.european_cars14,
            R.string.european_cars15, R.string.european_cars16, R.string.european_cars17, R.string.european_cars18, R.string.european_cars19,
            R.string.european_cars20, R.string.european_cars21, R.string.european_cars22};
    private int[] array_chinese_cars = {R.string.chinese_cars1, R.string.chinese_cars2, R.string.chinese_cars3, R.string.chinese_cars4,
            R.string.chinese_cars5, R.string.chinese_cars6, R.string.chinese_cars7};
    private int[] array_korean_cars = {R.string.korean_cars1, R.string.korean_cars2, R.string.korean_cars3, R.string.korean_cars4};
    private int[] array_german_cars = {R.string.german_cars1, R.string.german_cars2, R.string.german_cars3, R.string.german_cars4, R.string.german_cars5,
            R.string.german_cars6};
    private int[] array_russian_cars = {R.string.russian_cars1, R.string.russian_cars2};
    private int[] array_japanese_cars = {R.string.japanese_cars1, R.string.japanese_cars2, R.string.japanese_cars3, R.string.japanese_cars4,
            R.string.japanese_cars5, R.string.japanese_cars6, R.string.japanese_cars7, R.string.japanese_cars8, R.string.japanese_cars9, R.string.japanese_cars10, R.string.japanese_cars11};
    private int[] array_facts = {R.string.japanese_cars7};
    private int[] array_persons = {R.string.japanese_cars7};

    private int[] array_image_american_cars = {R.drawable.ic_buick, R.drawable.ic_cadillac, R.drawable.ic_chevrolet, R.drawable.ic_chrysler,
            R.drawable.ic_dodge, R.drawable.ic_ford, R.drawable.ic_gmc, R.drawable.ic_hummer, R.drawable.ic_jeep, R.drawable.ic_lincoln,
            R.drawable.ic_tesla};
    private int[] array_image_european_cars = {R.drawable.ic_alfa_romeo, R.drawable.ic_aston_martin, R.drawable.ic_bentley, R.drawable.ic_bugatti,
            R.drawable.ic_citroen, R.drawable.ic_ferrari, R.drawable.ic_fiat_01, R.drawable.ic_jaguar, R.drawable.ic_lamborghini,
            R.drawable.ic_lancia, R.drawable.ic_landrover, R.drawable.ic_maserati, R.drawable.ic_maybach, R.drawable.ic_mini,
            R.drawable.ic_peugeot, R.drawable.ic_renault, R.drawable.ic_rollsroyce, R.drawable.ic_saab, R.drawable.ic_seat,
            R.drawable.ic_skoda, R.drawable.ic_smart, R.drawable.ic_volvo};
    private int[] array_image_chinese_cars = {R.drawable.ic_brilliance, R.drawable.ic_byd, R.drawable.ic_chery, R.drawable.ic_dongfeng,
            R.drawable.ic_foton, R.drawable.ic_geely, R.drawable.ic_great_wall};
    private int[] array_image_korean_cars = {R.drawable.ic_daewoo, R.drawable.ic_hyundai, R.drawable.ic_kia, R.drawable.ic_ssangyong};
    private int[] array_image_german_cars = {R.drawable.ic_audi, R.drawable.ic_bmw, R.drawable.ic_mercedes, R.drawable.ic_opel,
            R.drawable.ic_porsche, R.drawable.ic_volkswagen};
    private int[] array_image_russian_cars = {R.drawable.ic_lada, R.drawable.ic_uaz};
    private int[] array_image_japanese_cars = {R.drawable.ic_acura, R.drawable.ic_honda, R.drawable.ic_infiniti, R.drawable.ic_isuzu,
            R.drawable.ic_lexus, R.drawable.ic_mazda, R.drawable.ic_mitsubishi, R.drawable.ic_nissan, R.drawable.ic_subaru,
            R.drawable.ic_suzuki, R.drawable.ic_toyota};
    private int[] array_image_facts = {R.drawable.ic_lada, R.drawable.ic_uaz};
    private int[] array_image_persons = {R.drawable.ic_lada, R.drawable.ic_uaz};

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
        face1 = Typeface.createFromAsset(this.getAssets(), "fonts/RobotoCondensed-Regular.ttf");
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
                iContent.setImageResource(array_image_american_cars[position]);
                text_content.setText(array_american_cars[position]);
                break;
            case 1:
                iContent.setImageResource(array_image_european_cars[position]);
                text_content.setText(array_european_cars[position]);
                break;
            case 2:
                iContent.setImageResource(array_image_chinese_cars[position]);
                text_content.setText(array_chinese_cars[position]);
                break;
            case 3:
                iContent.setImageResource(array_image_korean_cars[position]);
                text_content.setText(array_korean_cars[position]);
                break;
            case 4:
                iContent.setImageResource(array_image_german_cars[position]);
                text_content.setText(array_german_cars[position]);
                break;
            case 5:
                iContent.setImageResource(array_image_russian_cars[position]);
                text_content.setText(array_russian_cars[position]);
                break;
            case 6:
                iContent.setImageResource(array_image_japanese_cars[position]);
                text_content.setText(array_japanese_cars[position]);
                break;
            case 7:
                iContent.setImageResource(array_image_facts[position]);
                text_content.setText(array_facts[position]);
                break;
            case 8:
                iContent.setImageResource(array_image_persons[position]);
                text_content.setText(array_persons[position]);
                break;
        }
    }
}
