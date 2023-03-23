package com.coderscampus.arraylist;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CustomArrayListTest {

	@Test
	void should_add_item_to_list() {

		var list = new CustomArrayList<>();

		assertEquals(true, list.add(8));

	}

	@Test
	void should_get_size_of_list() {

		var list = new CustomArrayList<>();

		assertEquals(0, list.getSize());
	}

	@Test
	void should_get_index_of_list_item() {

		var list = new CustomArrayList<>();

		assertEquals(null, list.get(0));
	}

	@Test
	void should_add_item_at_index() {

		var list = new CustomArrayList<>();

		assertEquals(true, list.add(0, "i"));
	}

	@Test
	void should_remove_item_from_list() {

		var list = new CustomArrayList<>();

		assertEquals(null, list.remove(0));
	}

	@Test
	void should_throw_expection_if_less_than_or_more_than_size_of_list() {
		
		var list = new CustomArrayList<>();
		
		Object[] array = {"a", "b", "c", "d"};
		assertThrows(IndexOutOfBoundsException.class, () -> {
			Object item = array[6];
		});
		
		
	}

	
	

}
