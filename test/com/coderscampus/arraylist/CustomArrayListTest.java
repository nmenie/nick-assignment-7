package com.coderscampus.arraylist;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CustomArrayListTest {

	@Test
	void should_add_item_to_list() {

		var list = new CustomArrayList<>();

		int addItem = 11;

		assertEquals(true, list.add(addItem));
		assertEquals(1, list.getSize());
		assertEquals(addItem, list.get(0));

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
	void test_Add_InvalidIndex() {
		CustomArrayList<String> list = new CustomArrayList<>();

		assertThrows(IndexOutOfBoundsException.class, () -> {
			list.add(1, "i");
		});
	}

	@Test
	void test_Remove_InvalidationIndex() {
		CustomArrayList<String> list = new CustomArrayList<>();

		assertThrows(IndexOutOfBoundsException.class, () -> {
			list.remove(4);
		});
	}

}
