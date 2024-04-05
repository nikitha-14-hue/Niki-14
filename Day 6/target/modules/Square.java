package target.modules;
import lombok.*;
@NoArgsConstructor
@Getter
@Setter
@ToString
@AllArgsConstructor
public class Square extends Rectangle
{
    private double side=1.0;
    Square(double side,String color,boolean filled)
    {
        this.side=side;
        setColor(color);
        setFilled(filled);
    }
    public double getArea()
    {
        return side*side;
    }
    public double getPerimeter()
    {
        return 4*side;

    }
    public String toString() {
        return "A Square with side=" + getSide() + ", which is a subclass of " + super.toString();
    }
}
