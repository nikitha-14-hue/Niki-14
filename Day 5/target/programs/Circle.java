package target.programs;
import lombok.*;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Circle  {
    private double radius=1.0;
    private String color="red";
    Circle(double radius)
    {
        this.radius=radius;

    }
    public  double getArea()
    {
        return radius*radius;
    }


}
