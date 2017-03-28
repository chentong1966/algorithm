
public class Quick {
	public static void sort(int A[],int p,int r){
		if(p>=r)return;
		int q=partition(A,p,r);
		sort(A,p,q-1);
		sort(A,q+1,r);
	}
	
	static int partition(int A[],int p,int r){
		int x=A[r];
		int i=p-1;
		for(int j=p;j<=r-1;j++){
			if(A[j]<=x){
				i++;
				int t=A[i];
				A[i]=A[j];
				A[j]=t;
			}
		}
		int t=A[i+1];
		A[i+1]=A[r];
		A[r]=t;
		return i+1;
	}
	
}
