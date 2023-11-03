import java.util.ArrayList;
import java.util.List;

public class Generate_Parentheses_1{
    public List<String> generateParenthesis(int n) {
        List<String> allPossibleVariations = new ArrayList<>();
        generateParenthesisHelper(n, "", 0, allPossibleVariations);
        return allPossibleVariations;
    }

    public void generateParenthesisHelper(int n, String currentString, int close, List<String> result) {
        if (n ==1 && close == 0) { 
            result.add(currentString+"()"); 
        } else if (n == 0 && close == 1) { 
            result.add(currentString + ")"); 
        } else if (n==0 && close==0){
            result.add(currentString);
        }
 
        if (n>=1) {
            generateParenthesisHelper(n-1, currentString + "(", close+1, result); 
        }

        if (close >= 1) {
            generateParenthesisHelper(n, currentString + ")", close - 1, result); 
        }
    }

    public static void main(String[] args) {
        Generate_Parentheses_1 solution = new Generate_Parentheses_1();
        int n = 3; 
        List<String> result = solution.generateParenthesis(n);
        /*for (int i=0;i<result.length; i++){
            System.out
        }*/

        for (String combination : result) {
            System.out.print(combination+",");
        }
    }
}
