package Iterative;

class Binarysearch {
	public int binarySearch(int arr[], int x) {
		int l = 0;
		int r = arr.length - 1;
		while(l <= r) {
			int mid = l + (r - l) / 2;
			if(arr[mid] == x)
				return mid;
			if(arr[mid] < x)
				l = mid + 1;
			else
				r = mid - 1;
		}
		return -1;
	}
	public static void main (String[] args) {
		Binarysearch b = new Binarysearch();
		int arr[] = {10, 20, 30, 40, 50};
		int x = 40;
		int result = b.binarySearch(arr, x);
		if(result == -1)
			System.out.println("Element not found");
		else
			System.out.println("Element is at index " +result+ ".");
	}
}