public class TaskOne {
    public static void main(String[] args){
        int[] num = {-345, 534, 34, -565, -23, 0, -566, 32, 23, -1};
        int repl = 0;
        System.out.print("Array: ");
        for (int n = 0; n < num.length; n++){
            System.out.print(num[n] + " ");
            if (num[n] < 0) {
                num[n] = 0;
                repl++;
            }
        }
        System.out.print("\nReplacements: " + repl);
        System.out.print("\nNew Array: ");
        for (int i : num){
            System.out.print(i + " ");
        }
    }
}
