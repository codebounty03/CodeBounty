import java.util.ArrayList;
import java.util.List;

public class Generate_Parentheses {
    public List<String> generateParenthesis(int n) {
        List<String> allPossibleVariations = new ArrayList<>();
        generateParenthesisHelper(n, "", 0, allPossibleVariations);
        return allPossibleVariations;
    }

    private void generateParenthesisHelper(int n, String currentString, int close, List<String> result) {
        if (n == 0 && close == 0) {
            result.add(currentString);
        } else if (n == 1 && close == 0) {
            result.add(currentString + ")");
        }

        if (n >= 1) {
            generateParenthesisHelper(n - 1, currentString + "(", close + 1, result);
        }

        if (close >= 1) {
            generateParenthesisHelper(n, currentString + ")", close - 1, result);
        }
    }

    public static void main(String[] args) {
        Generate_Parentheses solution = new Generate_Parentheses();
        int n = 3;
        List<String> result = solution.generateParenthesis(n);

        for (String combination : result) {
            System.out.println(combination);
        }
    }
}