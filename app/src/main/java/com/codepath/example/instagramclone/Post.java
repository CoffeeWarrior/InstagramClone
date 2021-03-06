package com.codepath.example.instagramclone;

import com.parse.ParseClassName;
import com.parse.ParseException;
import com.parse.ParseFile;
import com.parse.ParseObject;
import com.parse.ParseUser;

@ParseClassName("Post")
public class Post extends ParseObject {
    public static final String KEY_DESCRIPTION = "Description";
    public static final String KEY_IMAGE = "image";
    public static final String KEY_USER = "user";
    private String username;


    //getters:
    public String getDescription(){
        return getString(KEY_DESCRIPTION);
    }

    public ParseUser getUser(){ //get the user and make it accessible through the user variable
        return getParseUser(KEY_USER);
    }


    public ParseFile getImage(){
        return getParseFile(KEY_IMAGE);
    }

    public String getUsername(){
        return username;
    }

    //setters:
    public void setDescription(String description){
        put(KEY_DESCRIPTION, description);
    }

    public void setUsername(String username){
        this.username = username;
    }



    public void setImage(ParseFile parseFile){
        put(KEY_IMAGE, parseFile);
    }

    public void setUser(ParseUser user){
        put(KEY_USER, user);
    }

}
