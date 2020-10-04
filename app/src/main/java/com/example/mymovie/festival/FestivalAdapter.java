package com.example.mymovie.festival;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.annotation.GlideModule;
import com.bumptech.glide.load.resource.bitmap.CenterCrop;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.Target;
import com.example.mymovie.R;

import java.util.ArrayList;

public class FestivalAdapter extends RecyclerView.Adapter<FestivalAdapter.ViewHolder> {

    private ArrayList<FestivalModel> festivalList;

    public FestivalAdapter(ArrayList<FestivalModel> list){
        this.festivalList = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.mfcardview, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        GlideApp.with(holder.itemView)
                .load(festivalList.get(position).getImg_url())
                .apply(new RequestOptions().override(Target.SIZE_ORIGINAL))
                .into(holder.poster);

        holder.title.setText(String.valueOf(festivalList.get(position).getTitle()));

    }

    @Override
    public int getItemCount() {
        return festivalList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        private ImageView poster;
        private TextView title;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            poster = itemView.findViewById(R.id.posterMF);
            title = itemView.findViewById(R.id.titleMF);
        }
    }
}
