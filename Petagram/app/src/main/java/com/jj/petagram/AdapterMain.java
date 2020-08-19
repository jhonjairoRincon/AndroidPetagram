package com.jj.petagram;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterMain extends RecyclerView.Adapter<AdapterMain.ViewHolderPet> {

    private final Activity activity;
    private ArrayList<Pets> petsList;
    private boolean like;

    public AdapterMain(ArrayList<Pets> petList, Activity activity) {
        this.petsList = petList;
        this.activity = activity;
    }
    @NonNull
    @Override
    public ViewHolderPet onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.carviewpets, parent, false);
        return new ViewHolderPet(view);
    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolderPet holder, int position) {
        holder.ivPhotos.setImageResource(petsList.get(position).getPhoto());
        holder.boneWhites.setImageResource(petsList.get(position).getBoneWhite());
        holder.boneLYellows.setImageResource(petsList.get(position).getBoneYellow());
        holder.tvNames.setText(petsList.get(position).getName());
        holder.tvLikes.setText(petsList.get(position).getPhoto());

    }

    @Override
    public int getItemCount() {
        return petsList.size();
    }

    public class ViewHolderPet extends RecyclerView.ViewHolder {

        private ImageView ivPhotos;
        private ImageView boneWhites;
        private ImageView boneLYellows;
        private TextView  tvNames;
        private TextView tvLikes;

        public ViewHolderPet(@NonNull View itemView) {
            super(itemView);
            ivPhotos = itemView.findViewById(R.id.ivPhoto);
            boneWhites = itemView.findViewById(R.id.boneWhite);
            boneLYellows = itemView.findViewById(R.id.boneLYellow);
            tvLikes = itemView.findViewById(R.id.tvLike);
            tvNames = itemView.findViewById(R.id.tvName);



        }
    }
}
