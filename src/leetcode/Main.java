package leetcode;

import org.junit.Test;

public class Main {

        Solution solution=new Solution();

        @Test
        public void test771() {
            //771. 宝石与石头
            String J = "aA";
            String S = "aAAbbbb";
            int count = solution.numJewelsInStones(J, S);
            System.out.println(count);
        }

        @Test
        public void test977() {
            //977. 有序数组的平方
            int[] A = {-4, -1, 0, 3, 10};
            int[] ans = solution.sortedSquares(A);
            for (int i = 0; i < ans.length; i++) {
                System.out.println(ans[i]);
            }
        }

        @Test
        public void test709(){
        //709. 转换成小写字母
            String str="Hello";
            String ans=solution.toLowerCase(str);
            System.out.println(ans);
        }

        @Test
        public void test135(){
            //135.分发糖果
            int[] ratings=new int []{1,3,4,5,2};
            System.out.println(solution.candy(ratings));
        }

        @Test
        public void test942(){
            String S= "IDID";
            System.out.println(solution.diStringMatch(S));
        }
}
