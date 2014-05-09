package com.psl.main;

import java.util.ArrayList;

import junit.*;

import org.junit.*;

public class TestDemo {

	
	@Test
	public void testListNotEmpty() throws Exception {
		ArrayList list = new ArrayList();

		list = InventoryDAO.InvLogic();
		int size = list.size();
		Assert.assertEquals(5, size);

	}
	
	@Test
	public void testListEmpty() throws Exception {
		ArrayList list = new ArrayList();

		list = InventoryDAO.InvLogic();
		int size = list.size();
		Assert.assertFalse(list.isEmpty());

	}
}
