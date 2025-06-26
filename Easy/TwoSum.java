public class TwoSum{
    public static int[] TwoSum(int[] nums, int target){
            for(int i = 0 ; i<nums.length ; i++){
                for(int j = i+1 ; j < nums.length; j++){
                    if(nums[i] + nums[j] == target){
                       return new int[] {i,j};
                    }
                }
            }
            return new int[] {}; //this line executes when no such pair is found.
        } 

        public static void main(String[] args) {
            int[] nums = { 2,7,23,55,3};
            int target = 26;

            int[] result = TwoSum(nums , target);
            System.out.println("The indices which sums the target number are " + result[0] + ", " + result[1]);
        }
}