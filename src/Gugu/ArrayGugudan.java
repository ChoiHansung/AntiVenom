package Gugu;

public class ArrayGugudan {
	public static void main(String[] args) {

		int[] result = new int[9];
		for(int b=0; b<result.length; b++) {
			System.out.println((b+1)+"´Ü");
			for(int a=0; a<result.length; a++) {
				result[a] =(b+1) * (a+1);
				System.out.println((b+1)+"*"+(a+1)+"="+result[a]);
			}
		}

	}
}
