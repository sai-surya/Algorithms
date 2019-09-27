package singleNumber;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber2 {
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,2,3};
        //hashMap(nums);
        System.out.println(singleNumber(nums));

    }

    public static void hashMap(int[] nums){
        Map<Integer, Integer> map = new HashMap<>();
        for(int num: nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }

        for(int key: map.keySet()){
            if(map.get(key) == 1){
                System.out.println(key);
            }
        }
    }

    public static int singleNumber(int[] A) {
        int ones = 0, twos = 0;
        for(int i = 0; i < A.length; i++){
            //ystem.out.println(~twos);
            ones = (ones ^ A[i]) & ~twos;
            twos = (twos ^ A[i]) & ~ones;
        }
        return ones;
    }

}
