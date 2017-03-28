
public class Merge {
	public static void sort(int A[],int p,int r){
		if(p>=r)return;
		int q=(p+r)/2;
		
		sort(A,p,q);
		sort(A,q+1,r);
		merge(A,p,q,r);
	}
	
	static void merge(int A[],int p,int q,int r){

		int A1[] = new int[q-p+1];
		int l=0;
		for(int i=p;l <= A1.length-1;i++){
			A1[l]=A[i];
			l++;
		}

		int A2[] = new int[r-q];
		l=0;
		for(int i=q+1;l <= A2.length-1;i++){
			A2[l]=A[i];
			l++;
		}
	
		int i,j;
		i=0;
		j=0;
		int k=p;
		boolean flag=true;
		do{
			if(j>A2.length-1&&i<=A1.length-1){
				A[k]=A1[i];
				i++;
				k++;
				continue;
			}
			if(j<=A2.length-1&&i>A1.length-1){
				A[k]=A2[j];
				j++;
				k++;
				continue;
			}
			if(j<=A2.length-1 && i<=A1.length-1){
				if( A1[i]>A2[j]){
					A[k]=A2[j];
					j++;
				}else{
					A[k]=A1[i];
					i++;
				}
				k++;
			}
			if(j>A2.length-1 && i>A1.length-1){
				break;
			}
		}while(flag);
		
	}
}
