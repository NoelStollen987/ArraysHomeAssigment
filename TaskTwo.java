public class TaskTwo {
    public static void main(String[] args){
        int[] num = {234, 345, 465, 234, 5767, 5767, 343, 243, 123};
        int max = 0;
        int secmax = 0;
        boolean found = false;
        System.out.print("Array: ");
        for (int n = 0; n < num.length; n++){
            System.out.print(num[n] + " ");
            if (num[n] > max)
                max = num[n];
        }
        System.out.print("\nMax number: " + max);
        for (int i = 0; i < num.length; i++){
            if (num[i] < max && num[i] > secmax && !found)
                secmax = num[i];
            else
                System.out.print("There is no second max number");
        }
        System.out.print("\nSecond max number: " + secmax);
    }
}
