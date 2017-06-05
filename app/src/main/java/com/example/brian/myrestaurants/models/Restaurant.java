package com.example.brian.myrestaurants.models;

import org.parceler.Parcel;

import java.util.ArrayList;

@Parcel
public class Restaurant {
    String mName;
    String mPhone;
    String mWebsite;
    double mRating;
    String mImageUrl;
    ArrayList<String> mAddress = new ArrayList<>();
    double mLatitude;
    double mLongitude;
    ArrayList<String> mCategories = new ArrayList<>();
    
    public Restaurant() {}

    public Restaurant(String name, String phone, String website,
                      double rating, String imageUrl, ArrayList<String> address,
                      double latitude, double longitude, ArrayList<String> categories) {
        this.mName = name;
        this.mPhone = phone;
        this.mWebsite = website;
        this.mRating = rating;
        this.mImageUrl = imageUrl;
        this.mAddress = address;
        this.mLatitude = latitude;
        this.mLongitude = longitude;
        this.mCategories = categories;
    }

    public String getmName() {
        return mName;
    }

    public String getmPhone() {
        return mPhone;
    }

    public String getmWebsite() {
        return mWebsite;
    }

    public double getmRating() {
        return mRating;
    }

    public String getmImageUrl() {
        return mImageUrl;
    }

    public ArrayList<String> getmAddress() {
        return mAddress;
    }

    public double getmLatitude() {
        return mLatitude;
    }

    public double getmLongitude() {
        return mLongitude;
    }

    public ArrayList<String> getmCategories() {
        return mCategories;
    }
}
