package target.modules;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Circle extends Shape {
    private double radius=1.0;
    Circle(double radius,String color,boolean filled)
    {
        this.radius=radius;
        setFilled(filled);
        setColor(color);
    }
    public double getArea()
    {
        return Math.PI*radius*radius;
    }
    public double getPerimeter()
    {
        return 2*Math.PI*radius;
    }
    public String toString() {
        return "A Circle with radius=" + radius + ", which is a subclass of " + super.toString();
    }



}
