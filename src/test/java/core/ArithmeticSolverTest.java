package core;
import junit.framework.*;

public class ArithmeticSolverTest extends TestCase{
	
	public void testAdd() {
		ArithmeticSolver solver = new ArithmeticSolver();
		
		assertEquals(4, solver.add(2,2));
	}
	
	public void testSubract() {
		ArithmeticSolver solver = new ArithmeticSolver();
		assertEquals(2, solver.subtract(4,2));
	}
	
	public void testMultiply() {
		ArithmeticSolver solver = new ArithmeticSolver();
		assertEquals(8, solver.multiply(4,2));
	}
	
	public void testDivide() {
		ArithmeticSolver solver = new ArithmeticSolver();
		assertEquals(3, solver.divide(9,3));
	}
	
	public void testModulus() {
		ArithmeticSolver solver = new ArithmeticSolver();
		assertEquals(1, solver.modulus(5,2));
	}
}
