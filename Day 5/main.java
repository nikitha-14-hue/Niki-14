package com.stacks;


    // Import statements

import java.util.NoSuchElementException;
import java.util.stream.Stream;

public class main {
        public static void main(String[] args) {

            doubly list = new doubly();

            // let's populate the list with some initial values
            Stream.of(19, 49, 13, 59, 333, 283, 293, 100).forEach(list::append);

            the_loop:
            while (true) {
                list.displayForward();
                list.displayBackward();

                System.out.println("\n*** Main Menu ***");
                System.out.println("0. Exit");
                System.out.println("1. Prepend");
                System.out.println("2. Append");
                System.out.println("3. Size");
                System.out.println("4. Search");
                System.out.println("5. Delete the first element");
                System.out.println("6. Delete the last element");
                System.out.println("7. Insert data at a given index");
                System.out.println("8. Delete data at a given index");

                int choice;

                try {
                    choice = KeyboardUtil.getInt("Enter your choice: ");
                } catch (Exception e) {
                    choice = -1;
                }

                switch (choice) {
                    case 0:
                        System.out.println("Exiting...");
                        break the_loop;
                    case 1:
                        try {
                            int data = KeyboardUtil.getInt("Enter data: ");
                            list.prepend(data);
                        } catch (Exception e) {
                            System.out.println("Invalid data type");
                        }
                        break;
                    case 2:
                        try {
                            int data = KeyboardUtil.getInt("Enter data: ");
                            list.append(data);
                        } catch (Exception e) {
                            System.out.println("Invalid data type");
                        }
                        break;
                    case 3:
                        System.out.println("Size = " + list.size());
                        break;
                    case 4:
                        try {
                            int searchData = KeyboardUtil.getInt("Enter data to search: ");
                            if (list.search(searchData)) {
                                System.out.println(searchData + " found in the list.");
                            } else {
                                System.out.println(searchData + " not found in the list.");
                            }
                        } catch (Exception e) {
                            System.out.println("Invalid data type");
                        }
                        break;
                    case 5:
                        try {
                            int deleteData = list.deleteFirst();
                            System.out.println("Deleted data = " + deleteData);
                        } catch (NoSuchElementException e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case 6:
                        try {
                            int deleteData = list.deleteLast();
                            System.out.println("Deleted data = " + deleteData);
                        } catch (NoSuchElementException e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case 7:
                        try {
                            int index = KeyboardUtil.getInt("Enter index to insert data: ");
                            int data = KeyboardUtil.getInt("Enter data to insert: ");
                            list.insertAtIndex(index, data);
                        } catch (IndexOutOfBoundsException | NoSuchElementException e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case 8:
                        try {
                            int index = KeyboardUtil.getInt("Enter index to delete data: ");
                            int deleteData = list.deleteAt(index);
                            System.out.println("Deleted data at index " + index + " = " + deleteData);
                        } catch (IndexOutOfBoundsException | NoSuchElementException e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        }
    }


