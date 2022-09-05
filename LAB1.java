import java.io.*;
import java.util.*;

public class program1a {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.print("Enter Student Score or enter -1 to stop: ");
        while (sc.hasNext()) {
            System.out.print("Enter Student Score or enter -1 to stop: ");
            int score = sc.nextInt();
            if (score == -1) {
                break;
            } else if (score > 100 || score < 0) {
                System.out.println("Invalid");
                continue;
            } else
                arr.add(score);
        }
        System.out.println("Number of students: " + arr.size());
        for (int i : arr) {
            sum += i;
        }
        System.out.println("Total Score: " + sum);
        System.out.println("The average is: " + String.format("%.2f", (double) sum / arr.size()));

    }
}
