package com.example.android.kedainiaitourism;

/**
 * Created by lukas on 6/20/17.
 */

public class Data {
    private int picture = -1;
    private String title = "";
    private String description = "";
    public Data(int picture, String title, String description){
        this.picture=picture;
        this.title=title;
        this.description=description;
    }
    public int getPicture(){
        return picture;
    }
    public String getTitle(){
        return title;
    }
    public boolean hasImage(){
        return picture != -1;
    }
    public String getDescription(){
        return description;
    }
}
