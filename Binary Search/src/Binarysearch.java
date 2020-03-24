class Binarysearch {
	public int binarySearch(int arr[], int l, int r, int x) {
		if(r>=1) {
			int mid = l+(r-1)/2;
			if(arr[mid] == x)
				return mid;
			if(arr[mid]>x)
				return binarySearch(arr,l,mid-1,x);
			return binarySearch(arr,mid+1,r,x);
		}
		return -1;
	}
	public static void main(String[] args) {
		Binarysearch b = new Binarysearch();
		int arr[] = {2,3,4,10,40};
		int n = arr.length;
		int x = 3;
		int result = b.binarySearch(arr, 0, n-1, x);
		if(result == -1)
			System.out.println("Element not found");
		else
			System.out.println("Element found at index " +result);
	}
}