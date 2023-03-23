package com.coderscampus.arraylist;

public class CustomListaApplication {

	public static void main(String[] args) {
		
		CustomArrayList<String> myCustomList = new CustomArrayList<>();
		
		
	          myCustomList.add("e1");
	          myCustomList.add("e2");
	          myCustomList.add("e3");
	          myCustomList.add("e4");
	          myCustomList.add("e5");
	            
	            myCustomList.add(0, "hello");
	            
	            myCustomList.remove(4);
	            
	            
	            


	            

		
	        for (int i = 0; i < myCustomList.getSize(); i++) {
	            System.out.println(myCustomList.get(i));
	        }
		
		
	
		

	}

}
