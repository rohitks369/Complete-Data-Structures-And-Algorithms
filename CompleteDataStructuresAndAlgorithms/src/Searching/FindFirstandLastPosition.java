package Searching;

public class FindFirstandLastPosition {

	public static void main(String[] args) {
		int arr[]= {1,1,3,4,5,5,5,8,9};
		int target=5;
		
		int result[]=searchRange(arr,target);
		
		System.out.println("First position "+result[0]+" and last position "+ result[1]);
	}
	public static int[] searchRange(int[] nums, int target) {
        int left=findLeftBound(nums,target);
        int right=findRightBound(nums,target);
        
        return new int[]{left,right};
    }
    private static int findLeftBound(int[] nums,int target){
        int index=-1,low=0,high=nums.length-1;
        
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                index=mid;
                high=mid-1; //once the number is found move to left
            }
            else if(nums[mid]<target)
                low=mid+1;
            else
                high=mid-1;
        }
        
        return index;
    }
    private static int findRightBound(int[] nums,int target){
        int index=-1,low=0,high=nums.length-1;
        
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                index=mid;
                low=mid+1; //once the number is found move to right
            }
            else if(nums[mid]<target)
                low=mid+1;
            else
                high=mid-1;
        }
        
        return index;
    }
}
