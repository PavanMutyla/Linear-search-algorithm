import java.util.Scanner;

public class Algo_linear_2D {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("enter array");
        int[][] a = new int[3][3];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = input.nextInt();
            }

        }
        System.out.println("enter target");
        int b= input.nextInt();
        ltwod(a, b);
    }

    static int ltwod(int[][] arr, int tar)
    {
        if (arr.length==0)
        {
            System.out.println("not valid");
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (tar == arr[i][j])
                {
                    System.out.println("yes in the index"+" "+i+" "+j);
                }
            }

        }
        System.out.println("not valid");
        return -1;
    }
}
//here the output is showing 0 index and 1 index of the 0 index
