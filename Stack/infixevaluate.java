import java.io.*;
import java.util.*;

public class infixevaluate {

    public static boolean isoptr(char ch) {
        if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
            return true;
        } else {
            return false;
        }
    }

    public static int calculate(int v1, int v2, char optr) {
        if (optr == '+') {
            return v1 + v2;
        } else if (optr == '-') {
            return v1 - v2;
        } else if (optr == '*') {
            return v1 * v2;
        } else if (optr == '/') {
            return v1 / v2;
        }
        return 0;
    }

    public static int priority(char ch) {
        if (ch == '*' || ch == '/') {
            return 2;
        } else if (ch == '+' || ch == '-') {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        Stack<Character> operator = new Stack<Character>();
        Stack<Integer> operand = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // kabhi hme open bracket milta he to
            if (ch == '(') {
                // to hm ese operator vale stack me push kr denge thik he ji
                operator.push(ch);
            } else if (ch >= '0' && ch <= '9') {
                operand.push(ch - '0');
            } else if (ch == ')') {
                // ydi hme close bracket milta he to us case me hm integer vale stack me se do
                // element ko pop krenge
                // and Character vale stack mtlb operator vale stack kvl ek element ko pop
                // krenge .
                // to while lenge with the help of while loop we can easily solve this above
                // conditions

                // we iterating the while loop untill we got '(' open bracket.from operator
                // stack
                // is case me reverse honge kull mila ke (2+3) yha pr hme ) ye mila to hm ab
                // operator vale stack se open bracket jb tk nhi milta tb tk pop krnege thik he
                // ji

                while (operator.peek() != '(') {
                    char optr = operator.pop(); // we already know on the top of operator stack element is + , -, * ,/.
                                                // inme se koi bhi

                    // hmne v2 ko phle islie liya kyuki stack se pop krte time hme phle element jo
                    // milega vo generally di hui string ka dusra element hoga
                    // ans v1 bad me liya kyuki stack se 2nd pop element string ka phla element hoga

                    int v2 = operand.pop();
                    int v1 = operand.pop();

                    // yha hm calculate function ko call krke in dono ka multiplication find krenge.
                    int ans = calculate(v1, v2, optr);

                    // or jb hme ans ki value mil jayegi then hm use operand vale stack me push kr
                    // denge.
                    operand.push(ans);
                }
                // ab hm ek operator ko pop kr denge jo ki upr likha he
                operator.pop();
            } else if (isoptr(ch) == true) {
                // kabhi hme operator milta he tb
                // in while loop first condition is check wether stack empty or not if not empty
                // the we will work in
                // second condition is operator vale stack ka peek khi open braket to nhi
                // third condition is ki jo curr ch variable uski priority operator vale stack
                // ke element ke equal he ya nhi.

                while (operator.size() != 0 && operator.peek() != '(' && priority(ch) <= priority(operator.peek())) {
                    // to hm same upr jese kiya vese krnege
                    // take v2 and v1 and take ans
                    char optr = operator.pop();

                    int v2 = operand.pop();
                    int v1 = operand.pop();

                    int ans = calculate(v1, v2, optr);

                    operand.push(ans);
                }
            }
            while (operator.size() != 0) {
                char optr = operator.pop(); // +-x/
                int v2 = operand.pop();
                int v1 = operand.pop();
                int ans = calculate(v1, v2, optr);
                operand.push(ans);
            }

            System.out.println(operand.peek());
        }
    }
}