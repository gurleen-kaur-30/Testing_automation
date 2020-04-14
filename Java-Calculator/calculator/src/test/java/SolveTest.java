package test.java;
import main.java.Evaluate;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolveTest {

	@Test
	void solve_1() {
		char op;
		double a, b;
		op = '+';
		a = 5;
		b = 3;
		double result = Evaluate.solve(op, b, a);
		assertEquals(result,8);
	}
	
	@Test
	void solve_2() {
		char op;
		double a, b;
		op = '-';
		a = 5;
		b = 3;
		double result = Evaluate.solve(op, b, a);
		assertEquals(result,2);
	}
	
	@Test
	void solve_3() {
		char op;
		double a, b;
		op = 'X';
		a = 5;
		b = 3;
		double result = Evaluate.solve(op, b, a);
		assertEquals(result,15);
	}
	
	@Test
	void solve_4() {
		char op;
		double a, b;
		op = '/';
		a = 25;
		b = 5;
		double result = Evaluate.solve(op, b, a);
		assertEquals(result,5);
	}
	
	@Test
	void solve_5() {
		char op;
		double a, b;
		op = '/';
		a = 25;
		b = 0;
		Exception exception = assertThrows(ArithmeticException.class, () -> Evaluate.solve(op,b,a));
		assertEquals("Cannot divide by zero", exception.getMessage());
	}
	
	@Test
	void random_op() {
		char op;
		double a, b;
		op = '*';
		a = 25;
		b = 0;
		double result = Evaluate.solve(op, b, a);
		assertEquals(result,0);
	}

}
