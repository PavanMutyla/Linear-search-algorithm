import java.util.Scanner;

public class Algo_linear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter array");
        int[] a = new int[5];
        for (int i = 0; i < a.length; i++) {
            a[i] = input.nextInt();
        }
        System.out.println("enter target");
        int x = input.nextInt();
        lin(a, x);
    }

    static int lin(int[] arr, int target)
    {
        if (arr.length==0)
        {
            System.out.println("not valid");
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target)
            {
                System.out.println("yes"+i);
                return i;
            }
        }
        System.out.println("not valid");
        return -1;
    }
}
