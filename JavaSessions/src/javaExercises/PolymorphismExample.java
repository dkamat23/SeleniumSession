package javaExercises;

public class PolymorphismExample {

	void exampleday() {
		System.out.println("Today is wednesday");
	}
	void exampleday(int a) {
		System.out.println(a);
	}
	void exampleday(int b,int c) {
		System.out.println(b);
		System.out.println(c);
	}
	void exampleday(String a,String b) {
		System.out.println(a);
		System.out.println(b);
	}
	public static void main(String[] args) {
		PolymorphismExample day=new PolymorphismExample();
		day.exampleday();
		day.exampleday(1);
		day.exampleday(2, 3);
		day.exampleday("Yes", "No");
	

	}

}
