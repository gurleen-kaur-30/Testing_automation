package test.java;
import main.java.Evaluate;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EvaluateTest {

	@Test
	void testHasPrecedence_1() {
		char op1,op2;
		op1 = '-';
		op2 = 'X';
		Evaluate eval = new Evaluate();
		boolean result = eval.hasPrecedence(op1, op2);
		assertEquals(result, true);
	}
	
	@Test
	void testHasPrecedence_2() {
		char op1,op2;
		op1 = 'X';
		op2 = '-';
		Evaluate eval = new Evaluate();
		boolean result = eval.hasPrecedence(op1, op2);
		assertEquals(result, false);
	}
	
	
	@Test
	void testHasPrecedence_3() {
		char op1,op2;
		op1 = 'X';
		op2 = '+';
		Evaluate eval = new Evaluate();
		boolean result = eval.hasPrecedence(op1, op2);
		assertEquals(result, false);
	}
	
	@Test
	void testHasPrecedence_4() {
		char op1,op2;
		op1 = '+';
		op2 = 'X';
		Evaluate eval = new Evaluate();
		boolean result = eval.hasPrecedence(op1, op2);
		assertEquals(result, true);
	}
	
	@Test
	void testHasPrecedence_5() {
		char op1,op2;
		op1 = '+';
		op2 = '/';
		Evaluate eval = new Evaluate();
		boolean result = eval.hasPrecedence(op1, op2);
		assertEquals(result, true);
	}

	@Test
	void testHasPrecedence_6() {
		char op1,op2;
		op1 = '/';
		op2 = '+';
		Evaluate eval = new Evaluate();
		boolean result = eval.hasPrecedence(op1, op2);
		assertEquals(result, false);
	}

	@Test
	void testHasPrecedence_7() {
		char op1,op2;
		op1 = '-';
		op2 = '/';
		Evaluate eval = new Evaluate();
		boolean result = eval.hasPrecedence(op1, op2);
		assertEquals(result, true);
	}

	@Test
	void testHasPrecedence_8() {
		char op1,op2;
		op1 = '/';
		op2 = '-';
		Evaluate eval = new Evaluate();
		boolean result = eval.hasPrecedence(op1, op2);
		assertEquals(result, false);
	}

}
