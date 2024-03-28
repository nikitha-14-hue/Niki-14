package com.targetindia.pack1;

public class ClassA {
    private void privatefun()
    {
        System.out.println("private");
    }
    void packagefun()
    {

        System.out.println("pack fun");
    }
    protected void protectedfun()
    {
        System.out.println("protected fun");
    }
    public void publicfun()
    {
        System.out.println("public fun");
    }
    public static void main(String args[])
    {
        ClassA c=new ClassA();
        c.packagefun();
        c.privatefun();
        c.protectedfun();
        c.publicfun();
    }
}
