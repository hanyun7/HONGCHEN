package com.example.hongchen.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.hongchen.Activity.HomePage;
import com.example.hongchen.Model.Playlist;
import com.example.hongchen.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class PlaylistAdapter extends ArrayAdapter<Playlist> {

    public PlaylistAdapter(@NonNull Context context, int resource, @NonNull List<Playlist> objects) {
        super(context, resource, objects);
    }

    class ViewHolder{
        TextView textviewplaylist;
        ImageView imageplaylist;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ViewHolder viewHolder = null;
        if (convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.dong_playlist,null);
            viewHolder = new ViewHolder();
            viewHolder.textviewplaylist = convertView.findViewById(R.id.textviewtenplaylist);
            viewHolder.imageplaylist = convertView.findViewById(R.id.imageplaylist);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        Playlist playlist = getItem(position);
        Picasso.get().load(playlist.getHinhNen()).into(viewHolder.imageplaylist);
        viewHolder.textviewplaylist.setText(playlist.getTen());

        return convertView;
    }
}
