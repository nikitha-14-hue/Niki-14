package target.modules;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class Rectangle extends Shape{
    private double width=1.0;
    private double length=1.0;
    Rectangle(double width,double length,String color,boolean filled)
    {
        this.width=width;
        this.length=length;
        setColor(color);
        setFilled(filled);
    }
    public double getArea()
    {
        return length*width;
    }
    public double getPerimeter()
    {
        return 2*(length+width);
    }
    public String toString() {
        return "A Rectangle with width=" + width + " and length=" + length + ", which is a subclass of " + super.toString();
    }



}
