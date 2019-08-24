/**
* BinarySearch.java
*
*
* @author Tarakeshwar Sriram 
* @since 2019-08-24
*/

class BinarySearch {
	
	public int searchKey(final int[] number, int key){

		int low = 0;
		int high = number.length-1;
		int mid =  (low + high)/2;

		while (low < high){

			mid =  (low + high)/2;

			if(number[mid] == key)
			{
				return mid;
			}
			else if(number[mid] < key){
				low = mid + 1;
			}
			else {
				high = mid - 1;
			}
		}

		return -1;

	}

	public static void main(String[] args) {

		BinarySearch binarySearch = new BinarySearch();
		final int numbers[] = {3, 4, 7, 9, 19, 20};

		int index = binarySearch.searchKey(numbers, 19);
		if(index == -1){
			System.out.println("Key not found");
		}
		else{
			System.out.println("Key found at index: " +  index);
		}
			
	}
}


/*
	key = 19

	// 1st iteration
	low = 0
	high = 5
	mid = 2
	a[2] = 7

	a[2] < 19, low = 3



	//2nd interation
	low = 3
	high = 5
	mid = 4
	a[4] = 19
	a[4] == key 


**/