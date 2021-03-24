package com.example.practicejavamod;

public class Country {
    private double area;
    private String country;

    public Country(String country,int area){
        this.country = country;
        this.area = area;
    }

    public double getArea(){
        return area;
    }

    public void setArea(){
        this.area = area;
    }

    public void setCountry(String contry){ this.country = contry;
    }
}
