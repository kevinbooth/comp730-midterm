package q1UnitTests;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

public class TestInventory {
	private Inventory inv;
	
	@Mock
	private Inventory spyInv;
	
	@Mock
	private InventoryItem mockItem;
	
	
	@BeforeEach
	void setUp() {
		inv = new Inventory();
		spyInv = spy(new Inventory());
		mockItem = mock(InventoryItem.class);
	}
	
	@Test
	void test_addItemToInventory_ShouldFailToAdd() { // Mockito utilization 
		when(mockItem.getWeight()).thenReturn(251);
		
		// Test if there's anything in the list
		assertEquals(0, spyInv.getList().size(), "The list didn't have 0 items (Before trying to add item)");
		// Test if the method returns the proper value
		boolean result = spyInv.addItemToInventory(mockItem);
		assertFalse(result, "The method returned true when it should have been false.");
		// Test if the list resembles what the method told us
		assertEquals(0, spyInv.getList().size(), "The list didn't have 0 items (After trying to add item)");
	}
	
	@Test
	void test_addItemToInventory_ShouldAdd() { // Mockito utilization
		when(mockItem.getWeight()).thenReturn(249);
		
		// Test if there's anything in the list
		assertEquals(0, spyInv.getList().size(), "The list didn't have 0 items (Before trying to add item)");
		// Test if the method returns the proper value
		boolean result = spyInv.addItemToInventory(mockItem);
		assertTrue(result, "The item wasn't able to be added to the list.");
		// Test if the list resembles what the method told us
		assertEquals(1, spyInv.getList().size(), "The list didn't have 1 item (After trying to add item)");
	}
	
	@Test
	void test_dropInventoryItem_ShouldDelete() {
		InventoryItem item = new InventoryItem("weapon", 26, "axe", 1);
		inv.addItemToInventory(item);
		
		// Test if there's anything in the list
		assertEquals(1, inv.getList().size(), "The list didn't have 1 item (Before trying to delete item)");
		// Test if the method returns the proper value
		boolean result = inv.dropInventoryItem(item);
		assertTrue(result, "The item couldn't be found in the inventory.");
		// Test if the list resembles what the method told us
		assertEquals(0, inv.getList().size(), "The list didn't have 0 items (After trying to delete item)");
	}
	
	@Test
	void test_getMethods() {
		int expectedWeight = 0;
		int weight = inv.getWeight();
		int expectedCount = 0;
		int count = inv.getCount();
		
		assertEquals(expectedWeight, weight, "The weight didn't return 0");
		assertEquals(expectedCount, count, "The count didn't return 0");
	}
	
	@Test
	void test_toString() {
		InventoryItem item1 = new InventoryItem("weapon", 4, "knife", 1);
		InventoryItem item2 = new InventoryItem("food", 1, "slice of bread", 1);
		inv.addItemToInventory(item1);
		inv.addItemToInventory(item2);
		
		String expected = "Your inventory has:\n" + item1.toString() + item2.toString();
		String actual = inv.toString();
		
		assertEquals(expected, actual, "The expected value didn't match the actual value");
		
	}
}
