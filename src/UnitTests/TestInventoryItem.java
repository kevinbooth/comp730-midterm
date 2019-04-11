package UnitTests;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

public class TestInventoryItem {
	private InventoryItem inv;
	
	@BeforeEach
	void setUp() throws Exception {
		InventoryItem inv = new InventoryItem("weapon", 6, "sword", 3);
	}
	
	@Test
	void test_getName() {
		String expected = "sword";
		String actual = inv.getName();
		
		assertEquals(expected, actual, "The actual name doesn't match the expected name");
	}
	
	@Test
	void test_getType() {
		String expected = "weapon";
		String actual = inv.getType();
		
		assertEquals(expected, actual, "The actual name doesn't match the expected name");
	}
	
	@Test
	void test_getWeight() {
		int expected = 2;
		int actual = inv.getWeight();
		
		assertEquals(expected, actual, "The actual name doesn't match the expected name");
	}
	
	@Test
	void test_getCount() {
		int expected = 3;
		int actual = inv.getCount();
		
		assertEquals(expected, actual, "The actual name doesn't match the expected name");
	}
	
}
