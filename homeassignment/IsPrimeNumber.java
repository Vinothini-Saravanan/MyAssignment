package week1.homeassignment;

public class IsPrimeNumber {
	public static void main(String[] args) {
		int n=13;
		int count=0;
		for(int i = 2; i < n; i++) {
            if (n % i == 0) {
			count=1;
			break;
	}}
            if(count==0) {
            	System.out.println(n + " is Prime Number");
            }
            else {
            	System.out.println(n+"is a not Prime Number");
            }		
	}}
