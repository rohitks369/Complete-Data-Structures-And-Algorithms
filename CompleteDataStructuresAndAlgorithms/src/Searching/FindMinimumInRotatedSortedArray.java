package Searching;

public class FindMinimumInRotatedSortedArray {

	public static void main(String[] args) {
		int nums[]= {3,4,5,1,2};
		
		int min=findMin(nums);
		System.out.println("The minimum element in the nums is : "+min);
	}
	public static int findMin(int nums[]) {
		int mid=0,low=0,high=nums.length-1;
		int min=Integer.MAX_VALUE;
		
		while(low<=high) {
			mid=low+(high-low)/2;
			
			if(nums[low]<=nums[high]) {
				min=Math.min(min,nums[low]);
				break;
			}
			
			if(nums[low]<=nums[mid]) {
				min=Math.min(min,nums[low]);
				low=mid+1;
			}
			else {
				min=Math.min(min,nums[mid]);
				high=mid-1;
			}
		}
		return min;
	}

}
