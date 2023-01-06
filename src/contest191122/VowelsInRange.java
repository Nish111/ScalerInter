package contest191122;

public class VowelsInRange {
	public int[] solve(String A, int[][] B) {
        int[] C = new int[B.length];
        int[] D = new int[A.length()];
        if((A.charAt(0) == 'a') || (A.charAt(0) == 'e') ||(A.charAt(0) == 'i') ||(A.charAt(0) == 'o') ||(A.charAt(0) == 'u') )
        D[0]=1;
        for(int j=1; j<A.length(); j++){
            if((A.charAt(j) == 'a') || (A.charAt(j) == 'e') ||(A.charAt(j) == 'i') ||(A.charAt(j) == 'o') ||(A.charAt(j) == 'u') ){
                D[j] = D[j-1]+1;
            } else {
                 D[j] = D[j-1];
            }
        }
        for(int i=0; i<D.length; i++) {
        	System.out.print(D[i] + " ");
        }
        System.out.println();
        C[0] = D[0];
        for(int i=0; i<B.length; i++){
        	//System.out.println(i);
        	if(B[i][0] == 0) {
        		C[i] = D[B[i][1]] - 0;
        	} else {
        		C[i] = D[B[i][1]] - D[B[i][0]-1];
        	}
            
        }
        
        /*for(int i=0; i<B.length; i++){
            for(int j=B[i][0]; j<=B[i][1]; j++){
                if((A.charAt(j) == 'a') || (A.charAt(j) == 'e') ||(A.charAt(j) == 'i') ||(A.charAt(j) == 'o') ||(A.charAt(j) == 'u') ){
                    C[i]++;
                }
            }
        }*/
        return C;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VowelsInRange vir = new VowelsInRange();
		String A = "pdihgbze";
		int[][] B = {{0,4}, {4,7}, {2,7}, {6,7}, {6,7}, {0,1}, {2,6}, {4,6}, {0,1}, {1,2}};
		int[] C = vir.solve(A, B);
		for(int i=0; i<C.length; i++) {
        	System.out.print(C[i] + " ");
        }
        System.out.println();
        int[][] D = {{0,2}};
        int[] E = vir.solve("eaucqt", D);
        for(int i=0; i<E.length; i++) {
        	System.out.print(E[i] + " ");
        }
        
	}

}
