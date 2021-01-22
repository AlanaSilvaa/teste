package lista4;

public class Q2 {
	
	public static void main(String[] args) {
		
	}
	
	void inverte (int v[], int esq, int dir) {
	int t;
	 if (esq >= dir) return;
	 t = v[esq];
	 v[esq] = v[dir];
	 v[dir] = t;
	 inverte(v, esq+1, dir - 1);
		
		
	}

}
