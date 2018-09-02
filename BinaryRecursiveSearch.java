


public class BinaryRecursiveSearch implements Practice2Search {

	public int search(int[] a, int target){

		return binarysearch(a, target, 0, a.length); 

	}

	public int binarysearch(int[] a, int target, int low, int upper){
		if(low > upper){
			return -1;
		}
		int mid = (upper + low) / 2;
		if(a[mid] == target){
			return mid;
		}
		else if(a[mid] < target){
			int lower = mid + 1;
			return binarysearch(a, target, lower, upper);
		}
		else{
			return binarysearch(a, target, low, mid-1);
		}
	}

	public String searchName(){
		return "Here" ;
	}

}