import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;
public class work {
    public static void main(String[] args) {
        //MACHINE PROBLEM 3
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students:");
        int numbers = input.nextInt();
        int array[] = new int[numbers];
        double sum = 0;
        int minimum = 0;
        int maximum = 0;
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter the grade for student" + (i + 1) + ":");
            int grade = input.nextInt();
            array[i] = grade;
            sum += grade;
            minimum = array[0];
            maximum = array[0];
            if (array[i] < minimum) {
                minimum = array[i];
            }
            if (array[i] > minimum) {
                maximum = array[i];
            }
        }
        double formula = (sum / numbers);
        System.out.printf("The average is: %.2f \n", formula);
        System.out.print("Minimum : " + minimum + "\n");
        System.out.print("Maximum : " + maximum);
    }}
