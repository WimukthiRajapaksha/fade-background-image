package com.example.fadingimages;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void fade(View view) {
        ImageView img1 = findViewById(R.id.imageView1);

        float alpha1 = img1.getAlpha();
//        Log.i("alpha 1", String.valueOf(alpha1));

        img1.animate().alpha(1 - alpha1).setDuration(2000);

        ImageView img2 = findViewById(R.id.imageView2);

        float alpha2 = img2.getAlpha();

        img2.animate().alpha(1 - alpha2).setDuration(2000);
    }
}
