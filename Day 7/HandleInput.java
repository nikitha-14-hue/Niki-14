import java.util.Scanner;
public class HandleInput {
    public static void main(String args[]) {
        int count = 0;
        int intcount = 0;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        int[] integerInputs = new int[100];
        double[] abc = new double[100];
        while (true) {
            System.out.println("Enter number: (Integer or float)");
            try {
                double e = sc.nextDouble();
                abc[count] = e; // Store all inputs in the abc array
                if (e % 1 == 0) { // Check if input is integer
                    integerInputs[intcount] = (int) e;
                    intcount++;
                    sum += (int) e; // Add to sum only if it's an integer
                }
                count++;
            } catch (Exception ex) {
                System.out.println("Invalid input. Please enter a valid number.");
                sc.next(); // Clear the invalid input from the scanner
            }
            System.out.println("Do you want to continue? (YES/NO)");
            String choice = sc.next().toLowerCase();
            if (choice.equals("no")) {
                break;
            }
        }
        int doublecount = count - intcount;
        System.out.println("Number of inputs = " + count);
        System.out.println("Number of integer inputs = " + intcount);
        System.out.println("Number of non-integer inputs = " + doublecount);
        System.out.print("The integer inputs = ");
        for (int i = 0; i < intcount; i++) {
            System.out.print(integerInputs[i]);
            if (i != intcount - 1) {
                System.out.print(",");
            }
        }
        System.out.println();
        System.out.print("The non-integer inputs = ");
        for (int i = 0; i < count; i++) {
            if (abc[i] % 1 != 0) { // Check if input is non-integer
                System.out.print(abc[i]);
                if (i != count - 1) { // Print comma if it's not the last element
                    System.out.print(", ");
                }
            }
        }
        System.out.println();
        System.out.println("Sum of all integer inputs = " + sum);
        sc.close();
    }
}
