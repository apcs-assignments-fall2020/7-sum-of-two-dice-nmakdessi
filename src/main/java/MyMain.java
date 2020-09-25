import java.util.Scanner;

public class MyMain {

    // Rolls a single die
    // Returns a random integer between 1 and 6
    public static int rollDie() {
        int b = (int) (Math.random() * 6) + 1;
        return b;
    }

    // Rolls two dice n times
    // This method returns an int array of size 11, where each element is
    // the number of times a certain sum of two dice was rolled
    public static int[] sumOfTwoDice(int n) {
        int[] arr = new int[11];
        int roll1 = 0;
        int roll2 = 0;
        int sum = 0;
        for(int i = 0; i < n; i++){
            roll1 = (int) (Math.random() * 6) + 1;
            roll2 = (int) (Math.random() * 6) + 1;
            sum = roll1 + roll2;
            arr[sum-2]++;
        }
        return arr;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number for n");
        int n = scan.nextInt();

        int[] arr1 = sumOfTwoDice(n);

        System.out.print("[");
        for (int i = 0; i < arr1.length; i++) {
	        System.out.print(arr1[i]);
            System.out.print(", ");
        }
         System.out.println("]");
        scan.close();
    }
}
