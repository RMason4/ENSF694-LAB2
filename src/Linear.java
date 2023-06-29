

/**
 * The Linear class uses the linear search algorithm to find the index of a key value in an array of integers.
 * 
 * @author Robert Mason
 *
 */

public class Linear {
	
	int[] array;
	int key;
	
	Linear(int[] array, int key) {
		this.array = array;
		this.key = key;	
	}
	
	int Search() {
	
	for(int i = 0; i < array.length; i ++) {
		
	if(array[i] == key)
		
	return i; //key FOUND and index returned
	}
	
	return -1; //key NOT FOUND and -1 returned
	}
	
}


