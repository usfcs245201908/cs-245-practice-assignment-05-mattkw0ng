import java.util.Arrays;

public class MergeSort implements SortingAlgorithm
{
	public void sort(int[] a){
		if(a.length > 1){
			int split = (a.length/2);
			int[] left = new int[split];
			int[] right = new int[(a.length)-split];
			for(int i = 0; i<split ; i++){
				left[i] = a[i];
			}
			int i = 0;
			for(int j = split; j<a.length ; j++){
				right[i] = a[j];
				i++;
			}


			//int[] left = Arrays.copyOfRange(a,0,split-1);
			//int[] right = Arrays.copyOfRange(a,split,a.length-1);
			sort(left);
			sort(right);
			
			merge(left,right,a);
		}
	}
	public void merge(int[] left,int[] right,int[] target){
		int i = 0; //index for left
		int j = 0; //index for right
		int k = 0; //index for target
		while(i<left.length && j<right.length){
			if(left[i]<=right[j]){
				target[k] = left[i];
				k++;
				i++;
			}else{
				target[k] = right[j];
				k++;
				j++;
			}
		}
		while(i<left.length){
			target[k] = left[i];
			k++;
			i++;
		}
		while(j<right.length){
			target[k] = right[j];
			k++;
			j++;
		}
	}

}