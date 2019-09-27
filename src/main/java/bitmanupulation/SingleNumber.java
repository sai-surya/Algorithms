package bitmanupulation;

public class SingleNumber {

    public static void main(String[] args) {

        int[] nums = {1,2,1,4,1};
        int num = 0;
        for (int num1:
             nums) {
            num ^= num1;
            System.out.println(num);
        }
        System.out.println(num);
    }
}
