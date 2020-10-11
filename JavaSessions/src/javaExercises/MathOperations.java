package javaExercises;

public class MathOperations {
	public int add(int a,int b) {
		int c=a+b;
		return c;
			}
	public int sub(int x,int y) {
		int z=x-y;
		return z;
	}

	public static void main(String[] args) {
		MathOperations addsub=new MathOperations();
		int addition=addsub.add(10,20);
		System.out.println(addition);
		int substract=addsub.sub(5,10);
		System.out.println(substract);
		int substract2=addsub.sub(20,15);
		System.out.println(substract2);
	
	}

}
