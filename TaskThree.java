import java.util.Scanner;

public class TaskThree {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int[] num = {10, 20, 30, 40, 50};
        int[] chnum = new int[5];
        System.out.print("Array: ");
        for (int n : num){
            System.out.print(n + " ");
        }
        System.out.print("\n\nEnter index to remove(from 0 to 4): ");
        int index = s.nextInt();
        if (index < 0 || index > num.length)
            System.out.print("Invalid index! Enter index to remove(from 0 to 4): ");
        else {
            for (int n = index; n < num.length - 1; n++)
                num[n] = num[n + 1];
        }
        System.out.print("\nNew Array: ");
        for (int n = 0; n < num.length - 1; n++)
            System.out.print(num[n] + " ");
    }
}