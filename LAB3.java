
import java.io.*;
import java.util.*;

class program3_v2 {
    static Boolean isNumber(String x) {
        try {
            int y = Integer.parseInt(x);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        System.out.print("Enter your Expression:");
        while (sc.hasNext()) {
            String postfix = sc.nextLine();
            if (postfix.length() == 0) {
                break;
            }
            String[] ch_pf = postfix.split(" ");
            for (int i = 0; i < ch_pf.length; i++) {
                String ch = ch_pf[i];
                if (isNumber(ch)) {
                    int x = Integer.parseInt(ch);
                    st.push(x);
                } else {
                    if (st.size() < 2) {
                        System.out.println("Error!");
                        continue;
                    } else if (ch.equals("+")) {
                        int b = st.pop();
                        int a = st.pop();
                        st.push(a + b);
                        // System.out.println(ch + " " + isNumber(ch) + " " + a + " " + b + " " +
                        // st.peek());
                    } else if (ch.equals("-")) {
                        int b = st.pop();
                        int a = st.pop();
                        st.push(a - b);
                    } else if (ch.equals("*")) {
                        int b = st.pop();
                        int a = st.pop();
                        st.push(a * b);
                    } else if (ch.equals("/")) {
                        int b = st.pop();
                        int a = st.pop();
                        st.push(a / b);
                    }
                }
            }
            if (st.size() == 1) {
                System.out.println(postfix + " = " + st.pop());
            } else {
                System.out.println("Error!!");
            }
            System.out.print("Enter your Expression:");
        }
    }
}