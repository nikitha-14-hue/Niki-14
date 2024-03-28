package com.targetindia.pack1;

public class ClassB
{
    public static void main(String args[])
    {
        ClassA c=new ClassA();
        c.packagefun();
       // c.privatefun();//private cannot be accessed even if it is in the same package
        c.protectedfun();
        c.publicfun();
    }
}
