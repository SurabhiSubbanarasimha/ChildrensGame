import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class GameBeginTest {

	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public void testPositiveCase() {
		ArrayList<Integer> children = new ArrayList<Integer>(5);
		ArrayList<Integer> result = new ArrayList<Integer>(5);
		children.add(3);
		children.add(1);
		children.add(5);
		children.add(2);
		children.add(4);
		result = GameBegin.play(5, 3);
		assertEquals(result,children);
	}
	
	@Test
	public void testInputInvalidCaseWhereNisZero() {
		
		ArrayList<Integer> result = new ArrayList<Integer>(5);
				result = GameBegin.play(0, 3);
		assertNull(result);
	}

	@Test
	public void testInputInvalidCaseWhereKisZero() {
		
		ArrayList<Integer> result = new ArrayList<Integer>(5);
				result = GameBegin.play(3, 0);
		assertNull(result);
	}
	
	@Test
	public void testInputInvalidCaseWhereKisGreaterThanN() {
		
		ArrayList<Integer> result = new ArrayList<Integer>(5);
				result = GameBegin.play(3, 6);
		assertNull(result);
	}
	
	@Test
	public void testInputInvalidCaseWhereNisLessThanZero() {
		
		ArrayList<Integer> result = new ArrayList<Integer>(5);
				result = GameBegin.play(-3, 2);
		assertNull(result);
	}
	
	@Test
	public void testInputInvalidCaseWhereKisLessThanZero() {
		
		ArrayList<Integer> result = new ArrayList<Integer>(5);
				result = GameBegin.play(3, -2);
		assertNull(result);
	}
}
