package javaExercises;

public class ClassAndMethods {
	int a=50;
	int b=100;
	void add() {
		System.out.println(a+b);
	}
	void sub() {
		System.out.println(a-b);
	}
	void multiply() {
		System.out.println(a*b);
	}

	public static void main(String[] args) {
		ClassAndMethods examp=new ClassAndMethods();
		examp.add();
		examp.multiply();
		ClassAndMethods examp1=new ClassAndMethods();
		examp1.add();
		examp1.sub();


	}

}
