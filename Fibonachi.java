package GitTest;

import java.util.ArrayList;
import java.util.List;

public class Fibonachi {
    static List<Integer> list = new ArrayList<>();

    public static void fibonachiForCycle(int x) {
        int arr[] = new int[x];
        for (int i = 0; i < arr.length; i++) {
            if(i==0||i==1) {
                arr[i] = i;
                System.out.print(i + " ");
                continue;
            }
            arr[i] = (arr[i-1]) + (arr[i-2]);
            System.out.print(arr[i] + " ");
        }
    }

    public static int fibonachiForRec(int i) {
        if (i==0||i==1) {
            return i;
        }
        System.out.println();
        int result = fibonachiForRec(i - 2) + fibonachiForRec(i - 1); //5 4 3 2 1  5 4 3 2 1  5 4 3 2 1  5 4 3 2 1  5 4 3 2 1
        System.out.print(result + " ");
        return result;


//        if(i==0) {
//            System.out.print(i + " ");
//            return i;
//        }
//
//        int current = fibonachiForRec(i-1);
//        if(i==1) {
//            System.out.print(i + " ");
//            return i;
//        }
//        int prev = fibonachiForRec(i-1);
//        int result = prev + current;
//        System.out.print(result + " ");
//        return result;
    }


    public static void main(String[] args) {
        fibonachiForCycle(10);
        System.out.println();
        fibonachiForRec(7);
        System.out.println();
        System.out.println(factorial(6));
    }

    private static int factorial(int n) {
        int result = 1;

        if (n == 0) {
            System.out.print(" = ");
            return result;
        }
        if (n == 1) {
            System.out.print(" * 1 = ");
            return result;
        }

        System.out.print(n);
        if (n != 2) {
            System.out.print(" * ");
        }

        result = n * factorial(n-1);
        return result;
    }
}
