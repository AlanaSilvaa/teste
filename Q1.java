package lista4;

public class Q1 {
	
  
	
	int soma (int v[], int n) {
		
		if ( n == 0) return 0;
		return v[n-1] + soma (v, n-1);
		
	}

}
