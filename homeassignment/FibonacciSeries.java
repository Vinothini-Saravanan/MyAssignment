package week1.homeassignment;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		int b=1;
		int c;
		int range=8;
		System.out.println(a);
		System.out.println(b);
		for(int i=2;i<range;i++) {
			c=a+b;
			a=b;
			b=c;
			System.out.println(c);
		}
		
	}

}
