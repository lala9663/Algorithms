package programmers.lv0;

import java.util.Scanner;

public class P09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String N = Integer.toString(n);
        String[] arr = N.split("");
        int sum = 0;

        for (int i = 0; i < arr.length ; i++) {
            sum += Integer.parseInt(arr[i]);
        }
        System.out.println(sum);


    }
}
