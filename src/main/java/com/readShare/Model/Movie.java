package com.readShare.Model;

import java.net.MalformedURLException;
import java.net.URL;

public class Movie {
    private int movieId;
    private  String movieName;
    private int movieLength;
    private int movieYear;
    private String genre;
    private URL myURL;

    public Movie( int movieId, String movieName, int movieLength, int movieYear, String genre) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.movieLength = movieLength;
        this.movieYear = movieYear;
        this.genre = genre;
    }

    //Get and Set methods
    public void setMovieId(int id){
        this.movieId = id;
    }

    public int getMovieId(){
        return this.movieId;
    }

    public void setMovieName(String name){
        this.movieName = name;
    }

    public String getMovieName(){
        return this.movieName;
    }

    public void setMovieLength(int movieLength){
        this.movieLength = movieLength;
    }

    public int getMovieLength(){
        return this.movieLength;
    }

    public void setMovieYear(int movieYear){
        this.movieYear = movieYear;
    }

    public int getMovieYear(){
        return this.movieYear;
    }

    public void setGenre(String genre){
        this.genre = genre;
    }

    public String getGenre(){
        return this.genre;
    }

    public void setMyURL(String url) throws MalformedURLException {
        this.myURL = new URL(url);
    }

    public URL getMyURL(){
        return myURL;
    }







}
