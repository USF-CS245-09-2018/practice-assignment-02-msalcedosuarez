


public class BinaryIterativeSearch implements Practice2Search{

	public int search(int[] a, int target){

		int lower = 0;
		int upper = a.length - 1;
		int mid = 0;


		while(lower <= upper){
			mid = (lower + last) / 2; 

			if(a[mid] < target){
				lower = mid + 1;
			}
			else if(a[mid] > target){
				upper = mid - 1;
			}
			else{
				return mid;
			}
		}
		return -1;
	}

	public String searchName(){

		return;
	}

}
