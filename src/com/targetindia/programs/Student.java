package com.targetindia.programs;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString(callSuper = true)
@Getter
@Setter
public class Student extends Person {
    private String Program;
    private int year;
    private double fee;
    Student(String name,String address,String Program,int year,double fee)
    {
          super(name, address);
           this.Program=Program;
           this.year=year;
           this.fee=fee;

    }




}
