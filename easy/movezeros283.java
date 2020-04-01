package leetcodeTrain.easy;

public class movezeros283 {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int[] nums1 = new int[n];
        int[] nums2 = new int[n];
        int count=0;
        for(int i=0 ;i< nums.length;i++){
            if (nums[i]==0){
                count++;
            }else {
               nums1[i-count]=nums[i];
            }
        }
        for (int i = 0; i <nums1.length ; i++) {
            nums[i]=nums1[i];
            System.out.print(nums[i]);
            if (i<nums1.length-1)
            {
                System.out.print(",");
            }
        }
        /*
        *   if (nums == null || nums.length <= 1) {
            return;
        }
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index] = nums[i];
                index++;
            }
        }

        for (int i = index; i < nums.length; i++) {
            nums[i] = 0;
        }
        * */
    }
    public static void main(String[] args) {
        int[] nums = {2,4,6,0,8,0};
        movezeros283 hk = new movezeros283();
        hk.moveZeroes(nums);
    }
}
