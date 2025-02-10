package com.workintech.cylinder;

public class Circle {
    private double radius;

    public Circle(double radius){
        //this.radius=radius;
        this.setRadius(radius);
    }

    public  double getRadius(){
        return this.radius;
    }

    public void setRadius(double radius){
        this.radius = radius < 0 ? 0 : radius;
    }

    public double getArea(){
        return radius * radius * Math.PI;
        //radius * radius = Math.pow(radius,2) bu şekilde de gösterilebilinir.
    }
}
