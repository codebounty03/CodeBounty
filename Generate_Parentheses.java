import java.util.ArrayList;
import java.util.List;

// public class Generate_Parentheses {
//     public List<String> generateParenthesis(int n) {
//         List<String> allPossibleVariations = new ArrayList<>();
//         generateParenthesisHelper(n, "", 0, allPossibleVariations);
//         return allPossibleVariations;
//     }


    public class GenerateParentheses {

    public List<String> generateParenthesis(int n) {
            List<String> allPossibleVariations = new ArrayList<>();
            generateParenthesisHelper(n, "", 0, 0, allPossibleVariations);
            return allPossibleVariations;
        }
    
        private void generateParenthesisHelper(int n, String currentString, int open, int close, List<String> result) {
            if (n == 0 && open == close) {
                result.add(currentString);
                return;
            }
    
            if (open < n) {
                generateParenthesisHelper(n - 1, currentString + "(", open + 1, close, result);
            }
    
            if (close < open) {
                        generateParenthesisHelper(n, currentString + ")", open, close + 1, result);
            }
        }
    
        public static void main(String[] args) {
            GenerateParentheses solution = new GenerateParentheses();
            int n = 3;
            List<String> result = solution.generateParenthesis(n);
    
            for (String combination : result) {
                System.out.println(combination);
            }
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
