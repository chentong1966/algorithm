
public class Bubble {
	 public static int[] sort(int  A[]){
		boolean flag=true;
		while(flag){
			flag=false;
			for(int i=0;i<A.length-1;i++){
				if(A[i]>A[i+1]){
					int t=A[i];
					A[i]=A[i+1];
					A[i+1]=t;
					flag=true;				
				}
			}
		}
		return A;
	}
}
