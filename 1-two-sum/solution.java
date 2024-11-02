class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[j] == target-nums[i]){
                    int[] answer = {i, j};
                    return answer;
                };
            };
        };
        return null;
    }
}