
import java.util.IllformedLocaleException;

public class Question1_twoSum_ez {


    public static int[] twoSum(int[] nums, int target){

            for (int i = 0; i < nums.length ; i++ ){
               for (int j = 0 ; j <nums.length ; j++) {
                   if (nums[i] + nums[j] == target){
                        return new int[]{i, j};
                   }
               }
            }
            throw new IllformedLocaleException("No such two numbers !");
    }

}
