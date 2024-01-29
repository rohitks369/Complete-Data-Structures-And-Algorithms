package Searching;

public class BinarySearch {

	public static void main(String[] args) {
		int arr[]= {1,1,3,4,5,5,7,8,9};
		int target=1;
		
		int result=findElement(arr,target); // return position of the element
		
		if(result!=-1) {
			System.out.println(target+" found at position "+ (result+1));
		}
		else {
			System.out.println("No Such element present");
		}
	}
	public static int findElement(int arr[], int target) {
		int low=0,high=arr.length-1;
		int mid=0;
		
		while(low<=high) {
			mid=low+(high-low)/2;
			if(arr[mid]==target) {
				return mid;
			}
			else if(arr[mid]<target) {
				low=mid+1;
			}
			else {
				high=mid-1;
			}
		}
		return -1;
	}
}
