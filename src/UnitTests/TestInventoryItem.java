package UnitTests;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

public class TestInventoryItem {
	private InventoryItem item;
	
	@BeforeEach
	void setUp() throws Exception {
		item = new InventoryItem("weapon", 6, "sword", 3);
	}
	
	@Test
	void test_getName() {
		String expected = "sword";
		String actual = item.getName();
		
		assertEquals(expected, actual, "The actual name doesn't match the expected name");
	}
	
	@Test
	void test_getType() {
		String expected = "weapon";
		String actual = item.getType();
		
		assertEquals(expected, actual, "The actual type doesn't match the expected type");
	}
	
	@Test
	void test_getWeight() {
		int expected = 6;
		int actual = item.getWeight();
		
		assertEquals(expected, actual, "The actual weight doesn't match the expected weight");
	}
	
	@Test
	void test_getCount() {
		int expected = 3;
		int actual = item.getCount();
		
		assertEquals(expected, actual, "The actual count doesn't match the expected count");
	}
	
	@Test
	void test_toString() {
		String expected = "sword" + " type (" + "weapon" + "), wt: " + 6 + ", there are " + 3 + " left";
		String actual = item.toString();
		
		assertEquals(expected, actual, "The actual string doesn't match the expected string");
	}
}
