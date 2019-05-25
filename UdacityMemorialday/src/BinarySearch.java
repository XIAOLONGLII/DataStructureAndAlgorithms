
public class BinarySearch {
	public static void main(String[] args) {
		
		int[] arr = {1,3,9,11,15,19,29, 31};
		int key1 = 29;
		int key2 = 2;
		int left = 0, right = arr.length - 1;
		int result = binarySearch(arr, 0, right, key1);
		int result2 = binarySearch(arr, 0, right, key2);

		System.out.println("key1 is at "+ result + "\nkey2 is at " + result2);
	
	}
	
	public static int binarySearch(int[] arr, int left, int right, int key) {
	
			int middle = ( left + right ) / 2; // 3 
			if( right < left) {
				return -1;
			}
			if(arr[middle] == key) {
				return middle;
			}
			else if(arr[middle] < key) { // key = 29, middle = 3 arr[3] .. arr[
				return binarySearch(arr, middle + 1 , right, key);
			}
			else {//if(arr[middle] > key) { // key = 2, arr[
				return binarySearch(arr, left, middle - 1, key);
			}
	}

}
