package com.example.hongchen.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hongchen.Model.Playlist;
import com.example.hongchen.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class DanhsachcacplaylistAdapter extends RecyclerView.Adapter<DanhsachcacplaylistAdapter.ViewHolder>{

    Context context;
    ArrayList<Playlist> playlistArrayList;

    public DanhsachcacplaylistAdapter(Context context, ArrayList<Playlist> playlistArrayList) {
        this.context = context;
        this.playlistArrayList = playlistArrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.dong_danhsachcacplaylist,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Playlist playlist = playlistArrayList.get(position);
        Picasso.with(context).load(playlist.getHinhNen()).into(holder.imageviewplaylist);
        holder.textviewplaylist.setText(playlist.getTen());
    }

    @Override
    public int getItemCount() {
        return playlistArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageviewplaylist;
        TextView textviewplaylist;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageviewplaylist = itemView.findViewById(R.id.imageplaylist);
            textviewplaylist = itemView.findViewById(R.id.textviewplaylist);
        }
    }
}
