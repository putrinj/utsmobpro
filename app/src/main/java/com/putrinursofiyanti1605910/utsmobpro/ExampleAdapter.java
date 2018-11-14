package com.putrinursofiyanti1605910.utsmobpro;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class ExampleAdapter extends RecyclerView.Adapter<ExampleAdapter.ExampleHolder>{

    List<Result> results;

    public ExampleAdapter(List<Result> results){
        this.results = results;
    }

    @NonNull
    @Override
    public ExampleAdapter.ExampleHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_movie, viewGroup, false);
        return new ExampleHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ExampleAdapter.ExampleHolder exampleHolder, int position) {
        Picasso.with(exampleHolder.itemView.getCcntext())
                .load("http://image.tmdb.org/t/p/w185/"+results.get(position).getPosterPath())
                .into(exampleHolder.Poster);
    }

    @Override
    public int getItemCount() {
        return results.size();
    }

    class ExampleHolder extends RecyclerView.ViewHolder{
        ImageView Poster;
        public ExampleHolder(View itemView){
            super(itemView);
            Poster = (ImageView)itemView.findViewById(R.id.poster);
        }
    }
}
