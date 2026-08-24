class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> sol = new ArrayList<>();
        if(nums.length == 0){
            return List.of();
        }
        int start = 0, end = 0;
        int count = 1;
        for(int i = 0; i < nums.length - 1; i++) {

            if(nums[i] == nums[i + 1] - 1){
                count++;
            }else{
                if(count > 1){
                    String ans = nums[start] + "->" + nums[i];
                    sol.add(ans);
                    
                }else{
                    sol.add(String.valueOf(nums[i]));
                }
                start = i + 1;
                count = 1;
            }
        }
        if(count > 1){
            String ans = nums[start] + "->" + nums[nums.length - 1];
            sol.add(ans);
                    
        }else{
            sol.add(String.valueOf(nums[nums.length -1]));
        }

        return sol;

    }
}
