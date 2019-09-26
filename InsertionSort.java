public class InsertionSort implements SortingAlgorithm
{
	public void sort(int[] a){
		for(int i = 1;  i<a.length ; i++){
			int j = i-1;	//compares the current index to the all previous ones
			int key = a[i];	//key is the value in the current index
			while(j>=0 && a[j]>key){
				a[j+1] = a[j];	//if a[j] is greater than the key, it shifts the value over to the next slot in the array
				j--;
			}
			a[j+1] = key;	//places the key back in its correct place
		}
	}

}