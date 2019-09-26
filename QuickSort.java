public class QuickSort implements SortingAlgorithm
{
	public void sort(int[] a){
		qs(a,0,a.length-1);
	}
	public void qs(int[] a, int left, int right){
		if(left<right){
			int p = partition(a,left,right);
			qs(a, left, p-1);
			qs(a, p+1, right);
		}
	}

	public int partition(int[] a, int left, int right){
		if(left<right){
			int pivot = a[left]; //creates pivot as the left most element of the array
			int i = right+1;		//i is the rightmost index of the array
			
			for(int j = right ; j > left ; j--){	//start from the right side of the array 
				if(a[j]>pivot){						//if the element is greater than the pivot, sort it to the right side of the array using var 'i'
					i--;					//moves i to the correct location
					swap(a,j,i);		//swaps the element at j with the element at i
				}
			}
			swap(a,left,i-1);			//all elements from i and up are greater than the pivot
										//so then we swap the pivot into the location i-1 so that it is in the right place
			return i-1;	//return the location of the partition
		}

		return left;
	}

	public void swap(int[] a, int i, int j){
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

}