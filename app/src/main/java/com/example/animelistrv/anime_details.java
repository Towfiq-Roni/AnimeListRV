package com.example.animelistrv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class anime_details extends AppCompatActivity{
    String [] animeDetails;
    String imageID;
    ImageView imageView;
    TextView name, details, date, episodes, mainCharacter, voiceActs, company;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        Intent intent = getIntent();
        animeDetails = intent.getStringArrayExtra("details");
        imageID = intent.getStringExtra("image");
        int ID = Integer.parseInt(imageID);

        imageView = findViewById(R.id.animage);
        name = findViewById(R.id.a_name);
        details = findViewById(R.id.a_details);
        date = findViewById(R.id.a_redate);
        episodes = findViewById(R.id.a_toteps);
        mainCharacter = findViewById(R.id.a_macha);
        voiceActs = findViewById(R.id.a_voac);
        company = findViewById(R.id.a_comp);

        imageView.setImageResource(ID);
        name.setText(animeDetails[0]);
        details.setText(animeDetails[1]);
        date.setText(animeDetails[2]);
        episodes.setText(animeDetails[3]);
        mainCharacter.setText(animeDetails[4]);
        voiceActs.setText(animeDetails[5]);
        company.setText(animeDetails[6]);
    }
}
