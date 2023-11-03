public class Generate_Parentheses {
    public static void generateParentheses(int n) {
        generateParenthesesHelper(n, n, "");
    }

    public static void generateParenthesesHelper(int left, int right, String current) {
        if (left == 0 && right == 0) {
            System.out.println(current);
            return;
        }

        if (left > 0) {
            generateParenthesesHelper(left - 1, right, current + "(");
        }
        if (right > left) {
            generateParenthesesHelper(left, right - 1, current + ")");
        }
    }

    public static void main(String[] args) {
        int n = 3; // Change this to the desired number of pairs
        generateParentheses(n);
    }
}