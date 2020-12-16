package tags.sort;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        Test t = new Test();
        int[] nums = {1,3,5,2,4,0};
        System.out.println(t.countSmaller(nums));
    }


    int index = 0;
    int[] help = null;
    public int countSmaller(int[] nums) {
        int N = nums.length;
        help = new int[N];
        int res = 0;
        for (int i=0;i<N;i++) {
            res += helper(nums[i]);
        }
        return res;
    }
    int helper(int num) {
        help[index] = num;
        int i=index;
        int res = 0;
        for (;i>0;i--) {
            if (help[i-1] <= help[i]) {
                res += help[i-1];
                int t = help[i];
                help[i] = help[i-1];
                help[i-1] = t;
            }else {
                break;
            }
        }
        index++;
        return res;
    }
}
