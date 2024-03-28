package com.targetindia.programs;
import lombok.*;
@ToString(callSuper = true)
@Getter
@Setter

public class Staff extends Person {
    private String school;
    private double pay;
    Staff(String name,String address,String school,double pay)
    {
        super(name, address);
        this.pay=pay;
        this.school=school;
    }
}
