package com.example.mymovie.openmoviedb;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mymovie.ItemClickListener;
import com.example.mymovie.R;
import com.example.mymovie.appclasses.Result;

import java.util.ArrayList;
import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    public Context context;
    public List<Result> results = new ArrayList<>();

    public RecyclerAdapter(){

    }

    public RecyclerAdapter(List<Result> results, Context context){
        this.results = results;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.title.setText(results.get(position).getTitle());
        holder.director.setText(results.get(position).getDirectors().getDirector().get(0).getDirectorNm());
        holder.plot.setText(results.get(position).getPlots().getPlot().get(0).getPlotText());

        holder.setItemClickListener(new ItemClickListener() {
            @Override
            public void onItemClickListener(View v, int position) {

                String title = results.get(position).getTitle();
                String plot = results.get(position).getPlots().getPlot().get(0).getPlotText();

                int directorNum = results.get(position).getDirectors().getDirector().size();
                String directors = "";
                for(int i=0; i<directorNum ; i++){
                    directors += results.get(position).getDirectors().getDirector().get(i).getDirectorNm();
                }

                String[] hashes = results.get(position).getKeywords().split(",");
                int hashNum = hashes.length;
                String hashTags = "";
                if(hashNum > 1){
                    hashTags = "#" +  hashes[0];
                    for(int j=1;j<hashNum;j++){
                        hashTags += " #" + hashes[j];
                    }
                }else hashTags = "...";

                Log.d("Adapter", "clicked : " + position);

                Intent intent = new Intent(v.getContext(), DetailActivity.class);
                intent.putExtra("dTitle", title);
                intent.putExtra("dDirectors", directors);
                intent.putExtra("dPlot", plot);
                intent.putExtra("dHashTags", hashTags);
                v.getContext().startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return results.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView title, director, plot;
        ItemClickListener ic;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            title = itemView.findViewById(R.id.title);
            director = itemView.findViewById(R.id.director);
            plot = itemView.findViewById(R.id.plot);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {

            this.ic.onItemClickListener(v, getLayoutPosition());

        }

        public void setItemClickListener(ItemClickListener ic){
            this.ic = ic;
        }
    }

}
