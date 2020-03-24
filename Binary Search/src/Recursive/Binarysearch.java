package Recursive;

class Binarysearch {
	public int binarySearch(int arr[], int l, int r, int x) {
		if(r >= l) {
			int mid = l + (r - l) / 2;
			if(arr[mid] == x)
				return mid;
			if(arr[mid] > x)
				return binarySearch(arr, l, mid - 1, x);
			else
				return binarySearch(arr, mid + 1, r, x);
		}
		return -1;
	}
	public static void main(String[] args) {
		Binarysearch b = new Binarysearch();
		int arr[] = {2, 4, 6, 8, 10};
		int l = 0;
		int n = arr.length - 1;
		int x = 10;
		int result = b.binarySearch(arr, l, n, x);
		if(result == -1)
			System.out.println("Element not found");
		else
			System.out.println("Element found at index " + result);
	}
}