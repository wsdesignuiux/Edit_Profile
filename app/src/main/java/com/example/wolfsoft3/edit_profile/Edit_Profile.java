package com.example.wolfsoft3.edit_profile;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Edit_Profile extends AppCompatActivity {


    ImageView search_bar,location_img;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.edit__profile);



        search_bar = findViewById(R.id.search_bar);
        search_bar.setVisibility(View.GONE);

        location_img = findViewById(R.id.location_img);
        location_img.setVisibility(View.GONE);

        text = findViewById(R.id.text);
        text.setText("change password");


    }
}
