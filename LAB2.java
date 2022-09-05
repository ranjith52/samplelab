import java.io.*;
import java.util.*;
import java.lang.*;

class program1b {
    public static void main(String[] args) {
        int arr[] = new int[10];
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            arr[i] = (int) (Math.random() * 101);
            sum += arr[i];
            System.out.println("Score of Stutent " + (i + 1) + "=" + arr[i]);
        }

        System.out.println("Number of students: " + arr.length);
        System.out.println("Total Score: " + sum);
        System.out.println("The average is: " + String.format("%.2f", (float) sum / arr.length));

    }
}