package lista4;

public class Q3 {
	
	public static void main(String[] args) {
		
	}
	
	int mdc (int p, int q) {
		if ( p == q) return p;
		if ( p < q )return mdc(q, p);
		return mdc(p - q, q);
		
		
		
	}

}
