package com.coderscampus.arraylist;

public class CustomListaApplication {

	public static void main(String[] args) {

		CustomArrayList<String> myCustomList = new CustomArrayList<>();

		myCustomList.add("e0");
		myCustomList.add("e1");
		myCustomList.add("e2");
		myCustomList.add("e3");
		myCustomList.add("e4");
		myCustomList.add("e5");
		myCustomList.add("e6");
		myCustomList.add("e7");
		myCustomList.add("e8");
		myCustomList.add("e9");
		myCustomList.add("e10");
		myCustomList.add("e11");
		myCustomList.add("e12");
		myCustomList.add("e13");
		myCustomList.add("e14");
		myCustomList.add("e15");
		myCustomList.add("e16");
		myCustomList.add("e17");
		myCustomList.add("e18");
		myCustomList.add("e19");
		myCustomList.add("e20");

		myCustomList.add("e21");
		myCustomList.add(9, "item9");
		myCustomList.add(21, "item20");
		myCustomList.add(12, "item12");
		myCustomList.add(24, "item24");
		myCustomList.remove(4);
		myCustomList.remove(9);
		myCustomList.remove(10);
		myCustomList.remove(8);


		for (int i = 0; i < myCustomList.getSize(); i++) {
			System.out.println(myCustomList.get(i));
		}

	}

}
