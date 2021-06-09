package com.example.animelistrv;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    public static ClickListener clickListener;
    Context context;
    String[] anime_name;
    String[] anime_status;
    int[] image;

    public MyAdapter(Context context, String[] anime_name, String[] anime_status, int[] image) {
        this.context = context;
        this.anime_name = anime_name;
        this.anime_status = anime_status;
        this.image = image;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.sample_view, parent, false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.textView.setText(anime_name[position]);
        holder.textView1.setText(anime_status[position]);
        holder.imageView.setImageResource(image[position]);
    }

    @Override
    public int getItemCount() {
        return anime_name.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView textView, textView1;
        ImageView imageView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageViewID);
            textView = itemView.findViewById(R.id.aNameID);
            textView1 = itemView.findViewById(R.id.astatus);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            clickListener.onItemClick(getBindingAdapterPosition(), view);
        }
    }


    public interface ClickListener{
        public void onItemClick(int position, View view);
    }

    public void setOnItemClickListener(ClickListener clickListener){
        MyAdapter.clickListener = clickListener;
    }
}

