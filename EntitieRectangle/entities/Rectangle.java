package entities;

public class Rectangle {
    public double width;
    public double height;

    public double area(){
        double result = width*height; 
        return result;
    }

    public double perimeter(){
        double result = (width+height)*2;
        return result;
    }

    public double diagonal(){
        double result = Math.sqrt((height*height)+(width*width));
        return result;
    }
}

