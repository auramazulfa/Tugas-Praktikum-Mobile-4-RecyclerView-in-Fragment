package com.aurama.aplikasiandroid.fragment.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.aurama.aplikasiandroid.fragment.DetailActivity;
import com.aurama.aplikasiandroid.fragment.R;
import com.aurama.aplikasiandroid.fragment.model.Clubs;
import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class ListClubsAdapter extends RecyclerView.Adapter<ListClubsAdapter.viewHolder> {
    private ArrayList<Clubs> listClubs = new ArrayList<>();
    private Context context;

    public ArrayList<Clubs> getListClubs() {
        return listClubs;
    }

    public ListClubsAdapter(ArrayList<Clubs> listClubs, Context context) {
        this.listClubs = listClubs;
        this.context = context;
    }

    public void setListClubs(ArrayList<Clubs> listClubs) {
        this.listClubs = listClubs;
    }

    @NonNull
    @Override
    public ListClubsAdapter.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_club, parent, false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListClubsAdapter.viewHolder holder, final int position) {
        Glide.with(context).load(getListClubs().get(position).getImage()).into(holder.ivClub);
        holder.tvName.setText(getListClubs().get(position).getName());

        holder.btnMove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(holder.itemView.getContext(),"Kamu Memilih " +
                        listClubs.get(holder.getAdapterPosition()).getName(),Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(context, DetailActivity.class);
                intent.putExtra("club_image",getListClubs().get(position).getImage());
                intent.putExtra("club_name",getListClubs().get(position).getName());
                intent.putExtra("club_info",getListClubs().get(position).getInfo());
                context.startActivity(intent);
            }
        });

        holder.btnShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(holder.itemView.getContext(), "Share Info " +
                        listClubs.get(holder.getAdapterPosition()).getName(),Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                String clubInfo = "Club Sepakbola "+getListClubs().get(position).getInfo();
                intent.putExtra(Intent.EXTRA_TEXT,clubInfo);
                context.startActivity(Intent.createChooser(intent,"Share Using"));
            }
        });
    }

    @Override
    public int getItemCount() {
        return getListClubs().size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        ImageView ivClub;
        TextView tvName;
        Button btnMove,btnShare;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            ivClub = itemView.findViewById(R.id.iv_item_club);
            tvName = itemView.findViewById(R.id.tv_club_name);
            btnMove = itemView.findViewById(R.id.btn_lihat);
            btnShare = itemView.findViewById(R.id.btn_share);
        }
    }
}
