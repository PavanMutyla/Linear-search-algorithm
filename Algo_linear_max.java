import java.util.Scanner;

public class Algo_linear_max {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter array");
        int[][] a = new int[3][3];
        for (int i = 0; i < a.length; i++)
        {
            for (int j = 0; j < a[i].length; j++)
            {
               a[i][j] = input.nextInt();
            }
        }

        System.out.println(max(a));


    }
    static int max(int[][] arr)
    {
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if ( arr[i][j] > max)
                {
                    max = arr[i][j];

                }
            }
        }
        return max;
    }

}
