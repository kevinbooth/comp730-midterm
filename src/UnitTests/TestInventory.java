package UnitTests;

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
	void test_addItemToInventory_ShouldFail() { // Mockito utilization 
		when(mockItem.getWeight()).thenReturn(251);
		boolean result = spyInv.addItemToInventory(mockItem);
		
		assertFalse(result, "The item was able to be added to the list.");
	}
	
	@Test
	void test_addItemToInventory_ShouldPass() { // Mockito utilization
		when(mockItem.getWeight()).thenReturn(249);
		boolean result = spyInv.addItemToInventory(mockItem);
		
		assertTrue(result, "The item wasn't able to be added to the list.");
	}
	
	@Test
	void test_dropInventoryItem_ShouldDelete() {
		InventoryItem item = new InventoryItem("weapon", 26, "axe", 1);
		inv.addItemToInventory(item);
		boolean result = inv.dropInventoryItem(item);
		
		assertTrue(result, "The item couldn't be found in the inventory.")
	}
}
