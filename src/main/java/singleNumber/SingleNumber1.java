package singleNumber;

import java.util.HashSet;
import java.util.Set;

public class SingleNumber1 {
    public static void main(String[] args) {
        int[] nums = {1,2,1,4,2,4};
        usingSet(nums);

    }

    public static void bitManupulation(int[] nums){
        int num = 0;
        for(int n:nums){
            num ^= n;
            System.out.println(num);
        }
        System.out.println(num);
    }

    public static void usingSet(int[] nums){
        Set<Integer> set = new HashSet<Integer>();

        for(int n: nums) {
            if (set.contains(n)) {
                set.remove(n);
            } else {
                set.add(n);
            }
        }
        System.out.println(!set.isEmpty() ? set.iterator().next():"-1");
    }



}
