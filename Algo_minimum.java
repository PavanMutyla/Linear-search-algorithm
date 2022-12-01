import java.util.Scanner;

public class Algo_minimum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter array");
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        int x = min(arr);
        System.out.println("the minimum is" + "  "+x);


    }
    static int min(int[] a)
    {
        int mini = a[0];
        for (int i = 0; i < a.length; i++) {
            if(a[i]<a[0])
            {
                mini = a[i];
            }
        }
        return mini;
    }
}
