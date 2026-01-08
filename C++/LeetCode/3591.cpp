class Solution {
    public boolean checkPrimeFrequency(int[] nums) {
        Arrays.sort(nums);
        int i = 1;
        int count = 1;
        for(i = 0; i < nums.length - 1; i++){
                if(nums[i] == nums[i + 1]){
                    count++;               
                }
                else{
                    if(count > 1){
                        if(isprime(count)){
                            return true;
                        }
                        count = 1;
                    }
                    
                }
            }
            return isprime(count);
        }
    public boolean isprime(int a){
        if(a < 2) return false;
        for(int i = 2; i < a; i++){
            if(a % i == 0) return false;
        }
        return true;
    }
}