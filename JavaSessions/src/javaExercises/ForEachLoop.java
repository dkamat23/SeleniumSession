package javaExercises;

public class ForEachLoop {

	public static void main(String[] args) {
		int []x= {4,6,3,10,23};
		for(int i=0;i<5;i++) {
			System.out.println(x[i]);
		}
		for (int i:x)
		{
			System.out.println(i);
		}

	}

}
