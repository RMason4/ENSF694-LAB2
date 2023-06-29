import java.util.Arrays;

/**
 * SearchingCLI is a comand line interface which prompts a user to enter an array of integers, and then 
 * returns the index of the key value using both linear and interpolation search algorithms. 
 * 
 * @author Robert Mason
 *
 */


public class SearchingCLI {
	
	private InteractiveCLI cli;
// 23 12 11 34 45 65 33 10 11 19

public SearchingCLI() {
		
		cli = new InteractiveCLI();
	}
	
public void run() {
	
	int length;
	int key;
	
	this.cli.prompt(" Enter the number of elements in the array: ");
	length = this.cli.getKeyboardInteger();
	int[] array = new int[length];
	
	this.cli.prompt(" Enter the elements in the array: \n");
	
	for (int i = 0; i < length; i++) {
		array[i] = this.cli.getKeyboardInteger();
	}
	
	Arrays.sort(array);
	
	this.cli.prompt(" Enter the search key: ");
	key = this.cli.getKeyboardInteger();
	
	Linear linear = new Linear(array, key);
	long linearStartTime = System.nanoTime();
	int indexLinear = linear.Search();
	long linearEndTime = System.nanoTime();
	long linearDuration = (linearEndTime - linearStartTime);
	
	this.cli.display("\nUsing Linear Search: ");
	
	if(indexLinear == -1) {
		this.cli.display("search key NOT FOUND\n");
	}
	else {
		this.cli.display("Search key FOUND at index " + Integer.toString(indexLinear));
		this.cli.display("Search time: " + linearDuration + " nanoseconds\n");
	}
	
	
	Interpolation interpolate = new Interpolation(array, key);
	long interpolationStartTime = System.nanoTime();
	int indexInterpolation = interpolate.Search();
	long interpolationEndTime = System.nanoTime();
	long interpolationDuration = (interpolationEndTime - interpolationStartTime);
	
	this.cli.display("Using Interpolation Search: ");
	
	if(indexInterpolation == -1) {
		this.cli.display("search key NOT FOUND");
	}
	
	else {
		this.cli.display("Search key FOUND at index " + Integer.toString(indexInterpolation));
		this.cli.display("Search time: " + interpolationDuration + " nanoseconds");
	}
}

	public static void main(String[] args) {
		SearchingCLI app = new SearchingCLI();
		app.run();	
	}
}
