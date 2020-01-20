package calculator;

import java.util.Stack;

public class Evaluate {
	 public static double evaluate(String inputString) {

	        Stack<Double> numberStack = new Stack<Double>();
	        Stack<Character> operationStack = new Stack<Character>();

	        int i = 0;
	        while ( i < inputString.length() ) {
	            if ((inputString.charAt(i) >= '0' && inputString.charAt(i) <= '9') || inputString.charAt(i) == '.') {
	                StringBuffer sbuf = new StringBuffer();
	                int j = i;
	                while (j < inputString.length()) {
	                    if ((inputString.charAt(j) >= '0' && inputString.charAt(j) <= '9') || inputString.charAt(j) == '.'){
	                        sbuf.append(inputString.charAt(j++));
	                    }
	                    else break;
	                }
	                i = j-1;
	                numberStack.push(Double.parseDouble(sbuf.toString()));
	                i++;
	            }

	            //Current token is a number after multiplication or division operators
	            else if (i != 0 && (inputString.charAt(i-1)=='X' || inputString.charAt(i-1)=='/')) {
	                i++;
	            }

	            // Current token is an operator.
	            else if (inputString.charAt(i) == '+' || inputString.charAt(i) == '-' ||
	                    inputString.charAt(i) == 'X' || inputString.charAt(i) == '/') {
	                // While top of 'operationStack' has same or greater precedence to current
	                // token, which is an operator. Apply operator on top of 'operationStack'
	                // to top two elements in numberStack stack
	                while (!operationStack.empty() && !numberStack.empty() && hasPrecedence(inputString.charAt(i), operationStack.peek())) {
	                    double a = numberStack.pop();
	                    double b;
	                    if (numberStack.empty()) {
	                        b=0;
	                    }
	                    else {
	                        b=numberStack.pop();
	                    }

	                    numberStack.push(solve(operationStack.pop(), a, b));
	                }

	                // Push current token to 'operationStack'.
	                operationStack.push(inputString.charAt(i));
	                i++;
	            }
	        }

	        // Entire expression has been parsed at this point, apply remaining
	        // operationStack to remaining numberStack
	        while (!operationStack.empty()) {
	            char op = operationStack.pop();
	            double x = numberStack.pop();
	            double y;
	            if (numberStack.empty()) {
	                y = 0;
	            }
	            else {
	                y = numberStack.pop();
	            }
	            numberStack.push(solve(op, x, y));
	        }
	        // Top of 'numberStack' contains result, return it
		return numberStack.pop();
	    }

	 // returns false if op1 has more precedence than op2
	    public static boolean hasPrecedence(char op1, char op2) {
	        if (op2 == '(' || op2 == ')')
	            return false;

	        if ((op1 == 'X' || op1 == '/') && (op2 == '+' || op2 == '-'))
	            return false;

	        else
	            return true;
	    }

	    public static double solve(char op, double b, double a) {
	        switch (op)
	        {
	            case '+':
	                return a + b;
	            case '-':
	                return a - b;
	            case 'X':
	                return a * b;
	            case '/':
	                if (b == 0)
	                    throw new
	                          UnsupportedOperationException("Cannot divide by zero");
	                return a / b;
	        }
	        return 0;
	    }

}
