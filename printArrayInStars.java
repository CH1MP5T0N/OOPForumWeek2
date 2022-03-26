import java.util.Scanner;
public class printArrayInStars{
    public static void main(String[] args){
        //MACHINE PROBLEM 2
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of items: ");
        int numbers = input.nextInt();
        int array[] = new int[numbers];
        String asterisk = "*";
        System.out.print("Enter the value of all items (separated by space): ");
        for(int i = 0; i < array.length; i++){
            array[i] = input.nextInt();
            System.out.println( i + ":" + asterisk.repeat(array[i]) + "(" + array[i] + ")");
            }
        }
    }

