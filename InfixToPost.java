import java.util.Scanner;
import java.util.Stack;

public class InfixToPost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String exp = sc.next();
            StringBuilder res = new StringBuilder();
            Stack<Character> s = new Stack<Character>();
            for (int i = 0; i < exp.length(); i++) {
                char c = exp.charAt(i);
                if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z' || c >= '0' && c <= '9') {
                    res.append(c);
                    System.out.println(s);
                    System.out.println(res);
                } else if ((s.isEmpty() || s.peek() == '+' || s.peek() == '-' || s.peek() == '(') && c != ')') {
                    s.push(c);
                    System.out.println(s);
                    System.out.println(res);

                } else if ((s.isEmpty() || s.peek() == '*' || s.peek() == '/') && c != ')') {
                    if (c == '+' || c == '-') {
                        while (!s.isEmpty() && (s.peek() != '+' || s.peek() != '-')) {
                            res.append(s.pop());

                        }
                        s.push(c);
                        System.out.println(s);
                        System.out.println(res);
                    } else if ( c == '*' || c == '/' ) {
                            res.append(s.pop());
                        s.push(c);
                    } else {
                        s.push(c);
                        System.out.println(s);
                        System.out.println(res);
                    }
                } else if(c == ')'){
                    System.out.println(s);
                    System.out.println(res);
                    while (s.peek() != '(') {
                        res.append(s.pop());
                    }
                    s.pop();
                }
            }
            while (!s.isEmpty()) {
                res.append(s.pop());
            }
            System.out.println(res);
        }
    }
}

//import java.util.Stack;
//
//class InfixToPost {
//
//    // Function to return precedence of operators
//    int prec(char c) {
//        if (c == '^')
//            return 3;
//        else if (c == '/' || c == '*')
//            return 2;
//        else if (c == '+' || c == '-')
//            return 1;
//        else
//            return -1;
//    }
//
//    // Function to perform infix to postfix conversion
//    void infixToPostfix(String s) {
//        Stack<Character> st = new Stack<>();
//        StringBuilder result = new StringBuilder();
//
//        for (int i = 0; i < s.length(); i++) {
//            char c = s.charAt(i);
//
//            // If the scanned character is
//            // an operand, add it to the output string.
//            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9'))
//                result.append(c);
//
//                // If the scanned character is
//                // an ‘(‘, push it to the stack.
//            else if (c == '(')
//                st.push('(');
//
//                // If the scanned character is an ‘)’,
//                // pop and add to the output string from the stack
//                // until an ‘(‘ is encountered.
//            else if (c == ')') {
//                while (st.peek() != '(') {
//                    result.append(st.pop());
//                }
//                st.pop();
//            }
//
//            // If an operator is scanned
//            else {
//                while (!st.isEmpty() && (prec(c) < prec(st.peek()) ||
//                        prec(c) == prec(st.peek()))) {
//                    result.append(st.pop());
//                }
//                st.push(c);
//            }
//        }
//
//        // Pop all the remaining elements from the stack
//        while (!st.isEmpty()) {
//            result.append(st.pop());
//        }
//
//        System.out.println(result.toString());
//    }
//
//    public static void main(String[] args) {
//        InfixToPost InfixToPost = new InfixToPost();
//        String exp = "((A+B)–C*(D/E))+F";
//        InfixToPost.infixToPostfix(exp);
//    }
//}
