package com.workintech.cylinder;

public class Cylinder extends Circle {

    private double height;

    public Cylinder(double radius, double height){
        super(radius);
        //this.height=height;
        this.setHeight(height);
    }

    public double getHeight(){
        return  this.height;
    }
    public void setHeight(double height){
        this.height = height < 0 ? 0 : height;
    }

    public double getVolume(){
        return  height * getArea();
    }

}
