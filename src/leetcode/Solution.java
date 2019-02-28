package leetcode;



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
        System.out.println(count);
        return count;
    }




}
