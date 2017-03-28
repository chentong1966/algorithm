
public class Select {
	public static void sort(int A[]){
		for(int i=1;i<=A.length-1;i++){
			int j=i;
			int key=A[j];
			while(j>0 && key<A[j-1]){

				A[j]=A[j-1];
				
				j--;
			}
			A[j]=key;
			
		}
	}
}
