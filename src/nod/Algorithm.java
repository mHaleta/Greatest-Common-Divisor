package nod;

public class Algorithm {
	
	public static long nod(long n, long m) {
		long k;
		while(n%m!=0) {
			k=n%m;
			n=m;
			m=k;
		}
		return(m);
	}
	
}
