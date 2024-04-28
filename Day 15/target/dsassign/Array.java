package com.target.dsassign;

import target.modules.KeyboardUtil;

import java.util.Arrays;

public class Array {
    static Array ae = new Array();
    private int[] numbers;
    private int size = 0;
    private int capacity = 5;

    public Array() {
        numbers = new int[capacity];
    }

    public void append(int data) {
        if (size == capacity) {
            capacity *= 2;
            var newArray = new int[capacity];
            for (int i = 0; i < size; i++) {
                newArray[i] = numbers[i];
            }
            numbers = newArray;
        }

        numbers[size++] = data;
    }
    public void prepend(int data) {
        capacity++;
        var newNumbers = new int[capacity];
        newNumbers[0] = data;
        for (int i = 0; i < size; i++) {
            newNumbers[i + 1] = numbers[i];
        } // O(n)
        numbers = newNumbers;
        size++;
    }

    public void deleteAtIndex(int index) {
        if (size == 0) {
            throw new RuntimeException("Empty array; nothing to delete");
        }
        if (index < 0 || index >= size) {
            throw new RuntimeException("Invalid index. Must be >=0 and <" + size);
        }

        int[] newNumbers = new int[capacity];
        for (int i = 0; i < index; i++) {
            newNumbers[i] = numbers[i];
        }
        for (int i = index + 1; i < size; i++) {
            newNumbers[i - 1] = numbers[i];
        }
        numbers = newNumbers;
        size--;
    }
    public void deleteatagivenvalue(int value)  {
        int index=-1;
        for(int i=0;i<size;i++)
        {
            if(numbers[i]==value)
            {
                 index=i;
                 break;
            }
        }
        if(index==-1)//if the searching value not present in the array
        {
            throw new RuntimeException("value not present in the array");
        }
        int[] newNumbers = new int[capacity];
        for (int i = 0; i < index; i++) {
            newNumbers[i] = numbers[i];
        }
        for (int i = index + 1; i < size; i++) {
            newNumbers[i - 1] = numbers[i];
        }
        numbers = newNumbers;
        size--;
    }
public void Insertatgivenindex(int index,int value)
{
    if (index < 0 || index > size) {
        throw new RuntimeException("Invalid index. Must be >= 0 and <= " + size);
    }
    if (index == 0) {
        prepend(value);
    } else if (index == size) {
        append(value);
    } else {
        if (size == capacity) {
            // Double the capacity if necessary
            capacity *= 2;
        }
        int[] newArray = new int[capacity];
        for (int i = 0; i < index; i++) {
            newArray[i] = numbers[i];
        }
        newArray[index] = value;
        for (int i = index + 1; i <= size; i++) {
            newArray[i] = numbers[i - 1];
        }
        numbers = newArray;
        size++;
        }

}

            public void display() {
                StringBuffer sb = new StringBuffer(); // O(1)
                sb.append("[");
                for (int i = 0; i < size; i++) { // O(n)
                    sb.append(numbers[i]);
                    if (i < size - 1) {
                        sb.append(", ");
                    }
                }
                sb.append("]");
                System.out.println("Array (raw): " + Arrays.toString(numbers)); // O(n)
                System.out.println("Array content: " + sb);
            } // O(n) --> Linear time complexity

    public static void main(String[] args)  {
        for (int i : Arrays.asList(0, 1, 2, 3, 4)) {
            ae.append(i);//if passed 5,expected output is(0,1,2,3,4,5)

        }
        int choice,data,index;

            do {
                ae.display();
                System.out.println("*** Main Menu ***");
                System.out.println("0. Exit");
                System.out.println("1. Append");
                System.out.println("2.Prepend");
                System.out.println("3.Delete at Index");
                System.out.println("4.Delete a given value");
                System.out.println("5.Insert at given index");

                choice = KeyboardUtil.getInt("enter the choice:");
                switch (choice) {
                    case 0:
                        System.out.println("exiting");
                        return;
                    case 1:
                        data = KeyboardUtil.getInt("enter data to append:");
                        ae.append(data);
                        break;
                    case 2:
                        data = KeyboardUtil.getInt("Enter data to prepend: ");
                        ae.prepend(data);
                        break;
                    case 3:
                        index = KeyboardUtil.getInt("Enter index to delete value at: ");
                        try {
                            ae.deleteAtIndex(index);
                        } catch (Exception e) {
                            System.err.println(e.getMessage());
                        }
                        break;
                    case 4:data=KeyboardUtil.getInt("enter value to deleter:");
                            ae.deleteatagivenvalue(data);
                            break;
                    case 5:index=KeyboardUtil.getInt("enter index to insert ");
                    data=KeyboardUtil.getInt("enter value to insert at the index");
                    ae.Insertatgivenindex(index,data);
                    break;

                    default:
                        System.out.println("incorrect choice");
                }
            }while(choice!=0);
        }
    }

