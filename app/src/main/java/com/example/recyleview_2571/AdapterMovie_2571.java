package com.example.recyleview_2571;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class  AdapterMovie_2571 extends RecyclerView.Adapter<AdapterMovie_2571.ListViewHolder> {
    private  ArrayList<Movie_2571> ListMovie;

    {
}
    public AdapterMovie_2571(ArrayList<Movie_2571> listMovie) {
        ListMovie = listMovie;
    }

    @NonNull
    @Override
    public AdapterMovie_2571.ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_2571,parent,false);
    return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        Movie_2571 movie = ListMovie.get(position);

        holder.txtTitle.setText(movie.getTitle());
        holder.txtYear.setText(movie.getYear());

    }

    @Override
    public int getItemCount() {
        return ListMovie.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        TextView txtTitle;
        TextView txtYear;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            txtTitle=itemView.findViewById(R.id.txtTitle);
            txtYear=itemView.findViewById((R.id.txtYear));

        }
    }

    }
