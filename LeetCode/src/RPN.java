import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class RPN {
	
	public static void main(String[] args) {
	
		String[] tokens = new String[] {"2","1","+","3","*"};
		System.out.println(evalRPN(tokens));

	}
	
	public static int evalRPN(String[] tokens) {
	   Set<String> operators = new HashSet<>(Arrays.asList(new String[]{"+","-","*","/"}));     
	   Stack<Integer> stack = new Stack<Integer>();
       for(String token: tokens){
           if(operators.contains(token)){
               int op = stack.pop();
               stack.push(evaluate(stack.pop(), token, op));
           } else {
               stack.push(Integer.parseInt(token));
           }
       }
       return stack.pop();
   }
	    
   public static int evaluate(int op1, String operand, int op2){
       switch(operand){
           case "+":
               return op1 + op2;
           case "-":
               return op1 - op2;
           case "*":
               return op1 * op2;
           case "/":
               return op1 / op2;
           default:
               return 0;
       }
   }

}
