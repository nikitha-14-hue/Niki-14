package com.targetindia.pack2;

import com.targetindia.pack1.ClassA;

public class ClassD extends ClassA {
    public static void main(String args[])
    {
        ClassD c=new ClassD();
        //c.packagefun();
        //c.privatefun();
        c.protectedfun();//protected can be accesses because this class has been inherites
        c.publicfun();
    }
}
