
public class Heap {
	int[] A;
	int len;
	Heap(int A[]){
		this.A = new int[2*A.length+1+1];
		len = A.length +1;
		for(int i=0;i<A.length;i++){
			this.A[i+1]=A[i];
		}
		for(int i=A.length;i<2*A.length;i++){
			this.A[i+1]=Integer.MAX_VALUE;
		}
		minfyHeap();
	}

	int left(int i){
		return A[2*i];
	}
	
	int right(int i){
		return A[2*i+1];
	}
	
	void minfyHeap(){
		for(int i = len/2;i>0;i-- ){
			int t = A[i];;
			if(A[2*i]>A[2*i+1]){
				if(A[i]>A[2*i+1]){
					A[i]=A[2*i+1];
					A[2*i+1] = t;
				}
			}else
			{
				if(A[i]>A[2*i]){
					A[i]=A[2*i];
					A[2*i] = t;
				}

			}
		}
	}
	
	int remove(){
		int t=A[1];
		A[1]=Integer.MAX_VALUE;
		minfyHeap();
//		len--;
		return t;
	}
	
	static void sort(int A[]){
		Heap hp = new Heap(A);
		for(int i=0;i<A.length;i++){
			A[i] = hp.remove();
		}
		
	}
}
