public class TaskFour {
    public static void main(String[] args){
        int[] num = {23, 34, 23, 56, 43, 56, 23, 786, 12, 23};
        System.out.print("Array: ");
        for (int i = 0; i < num.length; i++){
            System.out.print(num[i] + " ");
        }
        boolean hasdub = false;
        System.out.print("\n\nDublicates:");
        for (int i = 0; i < num.length; i++){
            boolean alrdub = false;
            for (int n = 0; n < i; n++){
                if (num[i] == num[n]){
                    alrdub = true;
                    break;
                }
            }
            if (alrdub)
                continue;
            for (int j = i + 1; j < num.length; j++){
                if (num[i] == num[j]){
                    System.out.print(num[i] + " ");
                    hasdub = true;
                    break;
                }
            }
        }
        if (!hasdub){
            System.out.print("No dublicates numbers");
        }
    }
}