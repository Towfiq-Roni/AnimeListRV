package com.example.animelistrv;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private int[] flags = {R.drawable.a1,  R.drawable.a2, R.drawable.a3, R.drawable.a4,
            R.drawable.a5, R.drawable.a6, R.drawable.a7, R.drawable.a8, R.drawable.a9,
            R.drawable.a10, R.drawable.a11, R.drawable.a12, R.drawable.a13};
    MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] anime_name = getResources().getStringArray(R.array.anime_name);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerid);

        String[] anime_status = getResources().getStringArray(R.array.anime_status);
        myAdapter = new MyAdapter(this, anime_name, anime_status, flags);

        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        myAdapter.setOnItemClickListener(new MyAdapter.ClickListener() {
            @Override
            public void onItemClick(int position, View view) {
                if(position==0) {
                    String[] anime_details = getResources().getStringArray(R.array.DB);
                    Intent intent = new Intent(MainActivity.this, anime_details.class);
                    Bundle extras = new Bundle();
                    extras.putString("image", String.valueOf(flags[0]));
                    extras.putStringArray("details", anime_details);
                    intent.putExtras(extras);
                    startActivity(intent);

                }
                if(position==1) {
                    String[] anime_details = getResources().getStringArray(R.array.NRT);
                    Intent intent = new Intent(MainActivity.this, anime_details.class);
                    Bundle extras = new Bundle();
                    extras.putString("image", String.valueOf(flags[1]));
                    extras.putStringArray("details", anime_details);
                    intent.putExtras(extras);
                    startActivity(intent);

                }
                if(position==2) {
                    String[] anime_details = getResources().getStringArray(R.array.RK);
                    Intent intent = new Intent(MainActivity.this, anime_details.class);
                    Bundle extras = new Bundle();
                    extras.putString("image", String.valueOf(flags[2]));
                    extras.putStringArray("details", anime_details);
                    intent.putExtras(extras);
                    startActivity(intent);

                }
                if(position==3) {
                    String[] anime_details = getResources().getStringArray(R.array.BLCH);
                    Intent intent = new Intent(MainActivity.this, anime_details.class);
                    Bundle extras = new Bundle();
                    extras.putString("image", String.valueOf(flags[3]));
                    extras.putStringArray("details", anime_details);
                    intent.putExtras(extras);
                    startActivity(intent);

                }
                if(position==4) {
                    String[] anime_details = getResources().getStringArray(R.array.OP);
                    Intent intent = new Intent(MainActivity.this, anime_details.class);
                    Bundle extras = new Bundle();
                    extras.putString("image", String.valueOf(flags[4]));
                    extras.putStringArray("details", anime_details);
                    intent.putExtras(extras);
                    startActivity(intent);

                }
                if(position==5) {
                    String[] anime_details = getResources().getStringArray(R.array.BNHA);
                    Intent intent = new Intent(MainActivity.this, anime_details.class);
                    Bundle extras = new Bundle();
                    extras.putString("image", String.valueOf(flags[5]));
                    extras.putStringArray("details", anime_details);
                    intent.putExtras(extras);
                    startActivity(intent);

                }
                if(position==6) {
                    String[] anime_details = getResources().getStringArray(R.array.KNY);
                    Intent intent = new Intent(MainActivity.this, anime_details.class);
                    Bundle extras = new Bundle();
                    extras.putString("image", String.valueOf(flags[6]));
                    extras.putStringArray("details", anime_details);
                    intent.putExtras(extras);
                    startActivity(intent);

                }
                if(position==7) {
                    String[] anime_details = getResources().getStringArray(R.array.FT);
                    Intent intent = new Intent(MainActivity.this, anime_details.class);
                    Bundle extras = new Bundle();
                    extras.putString("image", String.valueOf(flags[7]));
                    extras.putStringArray("details", anime_details);
                    intent.putExtras(extras);
                    startActivity(intent);

                }
                if(position==8) {
                    String[] anime_details = getResources().getStringArray(R.array.DS);
                    Intent intent = new Intent(MainActivity.this, anime_details.class);
                    Bundle extras = new Bundle();
                    extras.putString("image", String.valueOf(flags[8]));
                    extras.putStringArray("details", anime_details);
                    intent.putExtras(extras);
                    startActivity(intent);

                }
                if(position==9) {
                    String[] anime_details = getResources().getStringArray(R.array.DN);
                    Intent intent = new Intent(MainActivity.this, anime_details.class);
                    Bundle extras = new Bundle();
                    extras.putString("image", String.valueOf(flags[9]));
                    extras.putStringArray("details", anime_details);
                    intent.putExtras(extras);
                    startActivity(intent);

                }
                if(position==10) {
                    String[] anime_details = getResources().getStringArray(R.array.CB);
                    Intent intent = new Intent(MainActivity.this, anime_details.class);
                    Bundle extras = new Bundle();
                    extras.putString("image", String.valueOf(flags[10]));
                    extras.putStringArray("details", anime_details);
                    intent.putExtras(extras);
                    startActivity(intent);

                }
                if(position==11) {
                    String[] anime_details = getResources().getStringArray(R.array.AC);
                    Intent intent = new Intent(MainActivity.this, anime_details.class);
                    Bundle extras = new Bundle();
                    extras.putString("image", String.valueOf(flags[11]));
                    extras.putStringArray("details", anime_details);
                    intent.putExtras(extras);
                    startActivity(intent);

                }
                if(position==12) {
                    String[] anime_details = getResources().getStringArray(R.array.OPM);
                    Intent intent = new Intent(MainActivity.this, anime_details.class);
                    Bundle extras = new Bundle();
                    extras.putString("image", String.valueOf(flags[12]));
                    extras.putStringArray("details", anime_details);
                    intent.putExtras(extras);
                    startActivity(intent);

                }
            }
        });


    }
}