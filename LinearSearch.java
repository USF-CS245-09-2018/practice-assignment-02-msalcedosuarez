


public class LinearSearch implements Practice2Search {

	public int search(int[] a, int target){
		for(int i = 0; i < a.length; i++){
			if(a[i] == target){
				return i;
			}
		}
		return -1; 
	}

	public String searchName(){
		return "Here";
	}

}