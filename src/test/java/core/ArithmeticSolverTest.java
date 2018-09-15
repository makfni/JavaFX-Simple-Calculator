package core;
import junit.framework.*;

public class ArithmeticSolverTest extends TestCase{
	
	public void testAdd() {
		ArithmeticSolver solver = new ArithmeticSolver();
		
		assertEquals(4.0, solver.add(2,2));
	}
	
	public void testAddNegativeNum() {
		ArithmeticSolver solver = new ArithmeticSolver();
		
		assertEquals(-4.0, solver.add(-2,-2));
		assertEquals(-58.0, solver.add(-55, -3));
		assertEquals(10.0, solver.add(25,  -15));
	}
	
	public void testAddLargeNum() {
		ArithmeticSolver solver = new ArithmeticSolver();
		
		//assertEquals(Double.MIN_VALUE, solver.add(Double.MAX_VALUE,1));
		assertEquals(-58110005.0, solver.add(-58752887, 642882));
		
	}
	
	public void testAddDecimalNum() {
		ArithmeticSolver solver = new ArithmeticSolver();
		
		assertEquals(8.6, solver.add(5.3,3.3));
		assertEquals(12.778, solver.add(9.445, 3.333));
		assertNotNull(solver.add(9.445, 3.333));
	}
	
	public void testSubract() {
		ArithmeticSolver solver = new ArithmeticSolver();
		assertEquals(2.0, solver.subtract(4,2));
	}
	
	public void testMultiply() {
		ArithmeticSolver solver = new ArithmeticSolver();
		assertEquals(8.0, solver.multiply(4,2));
	}
	
	public void testDivide() {
		ArithmeticSolver solver = new ArithmeticSolver();
		assertEquals(3.0, solver.divide(9,3));
	}
	
	public void testModulus() {
		ArithmeticSolver solver = new ArithmeticSolver();
		assertEquals(1.0, solver.modulus(5,2));
	}
}
