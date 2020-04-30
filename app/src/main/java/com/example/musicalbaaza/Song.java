package com.example.musicalbaaza;

public class Song {
    private String mauthor;
    private String msongname;

    public Song(String author, String songname){
        mauthor = author;
        msongname = songname;
    }

    public String getAuthor(){
        return mauthor;
    }
    public String getSongname(){
        return msongname;
    }
}
