package com.example.mymovie;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
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
