package com.guiapps;

public class Testgenerics {
	public static <E> void printArray(E[] elements) {
		for( E element: elements) {
			System.out.println(element);
			
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Integer[] intArray= {10,20,30,40,50};
Character[] charArray= {'R','O','H','I','T','R','A','H','A'};
System.out.println("Printing Integer Array");
printArray( intArray);

System.out.println("Printing Character Array");
printArray(charArray);

	}

}
