package javaExercises;


import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {
		HashSet <String>b=new HashSet <String>();
		b.add("FLIPKART");
		b.add("AMAZON");
		b.add("MYNTRA");
		b.add("FLIPKART");
		b.add("NYKAA");
		for(String s:b) {
			System.out.println(s);
		}

	}

}
