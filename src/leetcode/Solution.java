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

    //135.分发糖果
    public int candy(int[] ratings) {
        int n = ratings.length;
        if (n == 0 || n == 1) {
            return n;
        }
        int[] candy = new int[n];
        if (ratings[0] <= ratings[1]) {
            candy[0] = 1;
        } else {
            candy[0] = 2;
        }
        for (int i = 1; i < n; i++) {
            if (ratings[i] > ratings[i - 1]) {
                candy[i] = candy[i - 1] + 1;
            } else {
                candy[i] = 1;
            }
        }
        int sum = candy[n - 1];
        for (int j = n - 2; j >= 0; j--) {
            if (ratings[j] > ratings[j + 1] && candy[j] <= candy[j + 1]) {
                candy[j] = candy[j + 1] + 1;
            }
            sum = sum + candy[j];
        }
        return sum;
    }
        //942. 增减字符串匹配
    public int[] diStringMatch(String S) {
        int n=S.length();
        int pre=0;
        int last=n;
        int[] A=new int[n+1];
        char[] B=S.toCharArray();
        for(int i=0;i<n;i++){
            if(B[i] == 'I'){
                A[i]=pre;
                pre++;
            }else{
                A[i]=last;
                last--;
            }
        }
        A[n]=pre;
        return A;
    }
    //237. 删除链表中的节点
//    public class ListNode {
//          int val;
//          ListNode next;
//          ListNode(int x) { val = x; }
//    }
//    public void deleteNode(ListNode node) {
//        node.val=node.next.val;
//        node.next=node.next.next;
//    }
    //832. 翻转图像
    public int[][] flipAndInvertImage(int[][] A) {
        for(int i=0;i<A.length;i++){
            for (int j = 0; j <A[i].length/2 ; j++) {
                int temp = A[i][j];
                A[i][j]=A[i][A[i].length-j-1]^1;
                A[i][A[i].length-j-1]=temp^1;
            }
            if (A[i].length%2==1){
                A[i][A[i].length/2]=A[i][A[i].length/2]^1;
            }
        }
        return A;
    }
    //804. 唯一摩尔斯密码词
    public int uniqueMorseRepresentations(String[] words) {
        final static String[] PASSWORD={
                [".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]
        }
    }
}
