package Searching;

public class SearchInRotatedSortedArray1 {

	public static void main(String[] args) {
		int nums[]= {4,5,6,7,0,1,2};
		int target=3;
		
		int position=search(nums,target);
		System.out.println("Found at position : "+position);
	}
	
	public static int search(int nums[],int target) {
		int mid=0,low=0,high=nums.length-1;
		
		while(low<=high) {
			mid=low+(high-low)/2;
			
			if(nums[mid]==target) {
				return mid;
			}
			else if(nums[low]<=nums[mid]) {
				if(nums[low]<=target && target<=nums[mid])
					high=mid-1;
				else
					low=mid+1;
			}
			else {
				if(nums[mid]<=target && target<=nums[high])
					low=mid+1;
				else
					high=mid-1;
			}
		}
		return -1;
	}

}
