
public class Main {
	public static void main(String args[]){
		int  ii= solution(378,1953786)	;	
String s="aa";
if(s.equals(null)){
	s.indexOf(0);
}else{
	s.indexOf(0);;
}

		int A[] = {5,2,4,7,8,1,3,2,6,4};
		
		Heap.sort(A);

		Select.sort(A);
		
		Quick.sort(A, 0, A.length-1);

		Merge.sort(A,0,A.length-1);
		
		Bubble.sort(A);
		
		System.out.println(A[A.length-1]);
	}
	
	static String find_numbers(int digit, int start, int end) {
		String sReturn="";
		for(int i=start;i<=end;++i){
				String s = String.valueOf(i);
				if(s.contains( String.valueOf(digit))){
					sReturn +=s;
				}
			}
		return sReturn;
	}
	
	 public static int solution(int A, int B) {
	        String strA = String.valueOf(A);
	        String strB = String.valueOf(B);
	        return strB.indexOf(strA);
	    }
	
    public int solutionA(int[] A) {
        // write your code in Java SE 8
    	int a=0;
    	int b=0;
        for(int i=0;i<=A.length/2;i++)
        {
        	a +=A[i];
        	b +=A[A.length-1-i];
        	if(a == b) return i;
        }
        return -1;
    }
        		

}