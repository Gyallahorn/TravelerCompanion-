package com.example.travelercompanion;

import java.net.URL;

public class GidModel {

    public final String name;
    public final String about;
    public final String bio;
    public String href;
 //   public final String imageUrl;

    public GidModel(String s, String name, String about, String bio){
        this.name=name;
        this.about=about;
        this.bio=bio;
       // this.href=href;
    //    this.imageUrl = imageUrl;
    }

    public String getName() {
        return name;
    }

    public String getAbout() {
        return about;
    }

    public String getBio() {
        return bio;
    }

  //  public String getHref() {
     //   return href;


   // }


    //public String getImageUrl() {
      //  return imageUrl;
   // }
}
