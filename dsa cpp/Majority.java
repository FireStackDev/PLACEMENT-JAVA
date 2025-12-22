class Solution {
    public static int majorityElement(int[] nums) {
        int item = nums[0], count = 1;

        for(int i = 1 ; i < nums.length ; i++){
            if (count == 0){
                item = nums[i];
            }
            
            if (item == nums[i]){
                count += 1;
            } else {
                count -= 1;
            }

            System.out.println("item = "+item+" num = "+nums[i]+" count = "+count);
        }

        return item;
    }
}

public class Majority {
    public static void main(String[] args) {
        int[] arr = {1,2,2,1,1,1,2,2,2,1,1};
        
        System.out.println(Solution.majorityElement(arr));
    }
}
