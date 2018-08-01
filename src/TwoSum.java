

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {

        TwoSum ts = new TwoSum();
        int[] nums = new int[]{1,3,5,9,11};
        int target = 12;
        int[] res = ts.twoSum(nums,target);
        System.out.println(res[0] + " " + res[1]);
    }

    public int[] twoSum(int[] numbers, int target){
        int[] result = new int[2]; /* this array has two numbers*/
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < numbers.length; i++){
            if(map.containsKey(target - numbers[i])){
                result[1]=i;
                result[0]=map.get(target - numbers[i]);
                return result;
            }
            map.put(numbers[i],i);
        }
        return result;
    }
}