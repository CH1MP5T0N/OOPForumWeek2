import java.util.Arrays;
import java.util.Scanner;
public class PrintArray {
    public static void main(String[] args) {
        //MACHINE PROBLEM 1
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of items: ");
        int numbers = input.nextInt();
        int array[] = new int[numbers];
        System.out.print("Enter the value of all items (separated by space): ");
        for(int i = 0; i < array.length; i++){
            array[i] = input.nextInt();
        }
        System.out.print(Arrays.toString(array));
    }
}