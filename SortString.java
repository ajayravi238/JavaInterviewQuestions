import java.util.*;
public class SortString
{
	public static void main(String[] args) {
        String[] arr = { "banana", "apple", "orange", "grape", "kiwi" };
		for(int i=0; i<arr.length; i++) {
		    for(int j=0; j<arr.length-1; j++) {
		        if(arr[j].charAt(0) > arr[j+1].charAt(0)) {
		            String temp = arr[j];
		            arr[j] = arr[j+1];
		            arr[j+1] = temp;
		        }
		    }
		}
		System.out.println(Arrays.toString(arr));
	}
}
