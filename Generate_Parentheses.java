import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Generate_Parentheses {
    public List<String> generateParenthesis(int n) {
        List<String> allPossibleVariations = new ArrayList<>();
        generateParenthesisHelper(n, "", 0, allPossibleVariations);
        return allPossibleVariations;
    }

    private void generateParenthesisHelper(int n, String currentString, int close, List<String> result) {
        if (n == 0 && close == 0) { 
            result.add(currentString + "("); 
        } else if (n == 1 && close == 0) { 
            result.add(currentString + ")"); 
        }

        if (n >= 1) {
            generateParenthesisHelper(n - 1, currentString + ")", close + 1, result); 
        }

        if (close >= 1) {
            generateParenthesisHelper(n, currentString + "(", close - 1, result); 
        }
    }

    public static void main(String[] args) {
        Generate_Parentheses solution = new Generate_Parentheses();
        Scanner sc = new Scanner(System.in);
        System.out.print("n = "); 
        int n = sc.nextInt();
        List<String> result = solution.generateParenthesis(n);

        for (String combination : result) {
            System.out.println(combination);
        }
        sc.close();
    }
}
