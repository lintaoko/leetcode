package leetcode;


import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Solution {
    // 771. 宝石与石头
    public int numJewelsInStones(String J, String S) {
        int count = 0;
        if (J == null || S == null) {
            return count;
        }
        char[] stone = S.toCharArray();
        char[] jewel = J.toCharArray();
        for (int i:stone) {
            for (int j:jewel){
                if (i==j){
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    // 977. 有序数组的平方
    public int[] sortedSquares(int[] A) {
        int length=A.length;
        int[]ans = new int[length];
        for (int i=0; i<length;i++){
            ans[i]=A[i]*A[i];
        }
        Arrays.sort(ans);
        return  ans;
    }

    //709. 转换成小写字母
    public String toLowerCase(String str) {
        return  str.toLowerCase();
    }


}
