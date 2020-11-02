package com.example.recyleview_2571;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private String[] movie = {"Bad Boys for Life","The Old Guard","Raised by Wolves","Elite","The Walking Dead: World Beyond","Artemis Fowl","Black Box","Riverdale","Law & Order: Special Victims Unit","Scary Movie 5","Star Trek: Discovery","Hubie Halloween","District 9","The Hurricane Heist","Paddington 2","Pride & Prejudice "};
    private String[] movieYear = {"2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015","2016"};

    private ArrayList<Movie_2571> movieList;

    private RecyclerView rvMovie2571;
    private ArrayList<Movie_2571> ListMovie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListMovie= new ArrayList<Movie_2571>();
        for (int i =0; i < movie.length; i++) {
            Movie_2571 mov = new Movie_2571(movie[i], movieYear[i]);
            ListMovie.add(mov);
        }

        rvMovie2571= findViewById(R.id.rv_Movie_2571);
        rvMovie2571.setHasFixedSize(true);

        rvMovie2571.setLayoutManager((new LinearLayoutManager(this)));

        AdapterMovie_2571 MovieAdapter = new AdapterMovie_2571(ListMovie);
        rvMovie2571.setAdapter(MovieAdapter);
    }
}
