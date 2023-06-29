

/**
 * The Interpolation class uses the interpolation search algorithm to find the index of a key value in an array of integers.
 * 
 * @author Robert Mason
 *
 */

public class Interpolation {

	int[] array;
	int key;
	
	Interpolation(int[] array, int key) {
		
		this.array = array;
		this.key = key;
	}
		
		
	int Search() {
		
		int low = 0, mid, high = array.length-1;
		while (low <= high) {
		
			int pos = (key - array[low]) / (array[high] - array[low]);
			mid = low + ((high - low) * pos);
		
	
			if(key < array[mid]) {
				high = mid - 1;}
			else if(array[mid] < key) {
				low = mid + 1;}
			else {
				return mid;} //key FOUND and index returned
			}
	return -1; //key NOT FOUND and -1 returned
	}

	
	
	
	
	
	
	
}
